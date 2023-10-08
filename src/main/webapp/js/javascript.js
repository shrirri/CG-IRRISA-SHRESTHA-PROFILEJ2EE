function checkIfEmpty(){
	var opTextbox=document.getElementById("opwd").value;
	var npTextbox=document.getElementById("npwd").value;	
	if (opTextbox==""){
	alert("Old Password is mandatory");
	return false;
	}
	else if (npTextbox==""){
	alert("New Password is mandatory");
	return false;
	}
	return true;
}