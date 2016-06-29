/**
 * 
 */
package com.dns.dockch.controller;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.mock.http.MockHttpOutputMessage;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import com.dns.dockch.DockChApplication;
import com.dns.dockch.dao.IDocDAO;
import com.dns.dockch.entity.Doctor;

/**
 * @author dinusha
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DockChApplication.class)
@WebAppConfiguration
public class UserControllerTest {

	private MediaType contentType = new MediaType(
			MediaType.APPLICATION_JSON.getType(),
			MediaType.APPLICATION_JSON.getSubtype(), Charset.forName("utf8"));

	private MockMvc mockMvc;


    private List<Doctor> docList = new ArrayList<>();
	
	private HttpMessageConverter mappingJackson2HttpMessageConverter;

	@Autowired
	private WebApplicationContext webApplicationContext;

	@Autowired
	private IDocDAO docDao;
	
	
	@Autowired
	void setConverters(HttpMessageConverter<?>[] converters) {

		this.mappingJackson2HttpMessageConverter = Arrays
				.asList(converters)
				.stream()
				.filter(hmc -> hmc instanceof MappingJackson2HttpMessageConverter)
				.findAny().get();

		Assert.assertNotNull("the JSON message converter must not be null",
				this.mappingJackson2HttpMessageConverter);
	}

	@Before
	    public void setup() throws Exception {
	        this.mockMvc = webAppContextSetup(webApplicationContext).build();

	      // this.docDao.deleteAllInBatch();
	       
	       this.docList.add 	(docDao.save(new Doctor()));
	        this.docList.add(docDao.save(new Doctor()));
	  }

	@Test
	public void userNotFound() throws Exception {
		mockMvc.perform(
				post("/doctors/").content(this.json(new Doctor())).contentType(
						contentType)).andExpect(status().isNotFound());
	}

	@Test
	public void readSingleBookmark() throws Exception {
		String docEmail = "doctors@gmil.com";
		mockMvc.perform(
				get("/doctors/" + docEmail))
				.andExpect(status().isOk())
				.andExpect(content().contentType(contentType))
			/*	.andExpect(
						jsonPath("$.id", is(this.docList.get(0).getId()
								.intValue())))
				.andExpect(
						jsonPath("$.uri", is("http://bookmark.com/1/"
								+ docEmail)))
				.andExpect(jsonPath("$.description", is("A description")))*/
						;
	}

	protected String json(Object o) throws IOException {
		MockHttpOutputMessage mockHttpOutputMessage = new MockHttpOutputMessage();
		this.mappingJackson2HttpMessageConverter.write(o,
				MediaType.APPLICATION_JSON, mockHttpOutputMessage);
		return mockHttpOutputMessage.getBodyAsString();
	}
}
