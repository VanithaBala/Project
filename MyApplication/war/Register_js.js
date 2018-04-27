function execute(){
		var name=document.getElementById("userId").value;
		var mail=document.getElementById("mail").value;
		var pwd=document.getElementById("pass").value;
		//alert("You have registered successfully!");
		if(name== "" && mail== "" && pwd== "")
		 {
			alert("enter something!");
		}
		if(name!= "" && mail!= "" && pwd!= ""){

			alert("You have successfully registered!!!")
		}
	}

	function validateEmail() {
    var email = document.getElementById("mail").value;
    //var mailId=document.getElementById("userId").value;
    var atpos = email.indexOf("@");
    var dotpos = email.lastIndexOf(".");
    if (atpos<1 || dotpos<atpos+2 || dotpos+2>email.length) {
        alert("Not a valid e-mail address");
      document.form1.EmailAddress.focus();
        return false;    
    }
    else{
    	return true;
    }
}
