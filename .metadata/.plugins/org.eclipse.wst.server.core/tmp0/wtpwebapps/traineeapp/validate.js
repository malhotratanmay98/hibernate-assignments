function validate(){
	
	let name = document.getElementById("nameId");
	let branch = document.getElementById("branchId");
	let percentage = document.getElementById("percentageId");
	
	
	if(isBlank(name)){
		 document.getElementById("nameMsg").innerHTML = "Enter name";
	        document.getElementById("nameMsg").style.color = "red";
	        return false;
	}
	
	
	 if (isBlank(branch)) {
	        document.getElementById("branchMsg").innerHTML = "Enter branch";
	        document.getElementById("branchMsg").style.color = "red";
	        return false;
	    }
	 
	 if (isBlank(percentage)) {
	        document.getElementById("percentageMsg").innerHTML = "Enter percentage";
	        document.getElementById("percentageMsg").style.color = "red";
	        return false;
	    }
}

function isBlank(val){
	return (val.trim()=="")?true:false ;
}