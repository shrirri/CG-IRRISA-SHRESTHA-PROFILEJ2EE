function checkIfEmpty(){
	var uTextbox=document.getElementById("uid").value;
	var pTextbox=document.getElementById("pwd").value;	
	if (uTextbox==""){
	alert("Userid is mandatory");
	return false;
	}
	else if (pTextbox==""){
	alert("Password is mandatory");
	return false;
	}
	return true;
}