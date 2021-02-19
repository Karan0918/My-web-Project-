
$(document).ready(function() {
    $('#btnSun').click(myFunction);
  });
  function myFunction(){
var regex = /^([a-zA-Z0-9_\.\-\+])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
var email = $("#email").val();
var pwordLen = $("#pword").val();

    if (!regex.test(email) && pwordLen!="") {

        if(pwordLen.length<6)
        {
        console.log('email');
        }
    }
    else {
        console.log("not email");
 
    }
}