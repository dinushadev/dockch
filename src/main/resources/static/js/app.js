/*$('#addMediCenterForm').on('validated.bs.validator', function(){
     alert('valid');
});*/


	$.fn.serializeObject = function()
	{
	    var o = {};
	    var a = this.serializeArray();
	    $.each(a, function() {
	        if (o[this.name] !== undefined) {
	            if (!o[this.name].push) {
	                o[this.name] = [o[this.name]];
	            }
	            o[this.name].push(this.value || '');
	        } else {
	            o[this.name] = this.value || '';
	        }
	    });
	    return o;
	};



	function createMediCenter(){
		var formMediCenter = $("#addMediCenterForm").serializeObject();
		var formAdminInfo = $("#adminInfoForm").serializeObject();

			formMediCenter.admin= formAdminInfo;

			console.log(formMediCenter);


		  $.ajax({
		  method: "POST",
		     url: 'medcenter',
		   data:JSON.stringify(formMediCenter),
		    contentType:"application/json"
			})
		  .done(function( msg ) {
		    //alert( "Data Saved: " + msg );
		    window.location.href ="/";
		  });
	}


