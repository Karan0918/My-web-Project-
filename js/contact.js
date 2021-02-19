var $ = function (id) {
    return document.getElementById(id);
}
var login = function () {
	//var name = $("fname").value;
	//var lname = $("lname").value;
	var subject = $("subject").value;
	var isValid = true;
	 var alphaExp = /^[a-zA-Z]+$/;
	// var len = subject.value.split(/[\s]+/);
	if (fname.value.match(alphaExp)) { 
		//
		$("fname_error").firstChild.nodeValue = "";
	} 
	else {
		$("fname_error").firstChild.nodeValue = "This field only accept alphabet";
		isValid = false;
		
	}
	
	if (lname.value.match(alphaExp)) { 
		$("lname_error").firstChild.nodeValue = "";
	} else {
		$("lname_error").firstChild.nodeValue = "This field only accept alphabet ";
		isValid = false;
		
	} 

	if (subject=="" ) { 
		$("subject_error").firstChild.nodeValue = "This field is required.";
		isValid = false;
	} else {
		$("subject_error").firstChild.nodeValue = "";
	}  
	
	
	if (isValid) {
		$("contact_form").submit(); 
	}
}

window.onload = function () {
    $("btn").onclick = login;
    $("fname").focus();
    // enter the alert statement of step 11 here
}
 
