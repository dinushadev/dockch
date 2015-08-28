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
var formData = $("#addMediCenterForm").serializeObject();
	console.log(formData);
/*  var tstData = JSON.stringify(formData);
  console.log(tstData);*/

	$.ajax({
     type: "POST",
     url: 'medcenter',
   //  data:JSON.stringify({"email":"dnsworee","name":"sssbbbbsss"}),//$("#addMediCenterForm").serialize(),
     //data:$("#addMediCenterForm").serialize(),
     data:JSON.stringify(formData),
     contentType:"application/json",
  	dataType:"json",

     success: function() {
         alert('ok');
     }
});
}