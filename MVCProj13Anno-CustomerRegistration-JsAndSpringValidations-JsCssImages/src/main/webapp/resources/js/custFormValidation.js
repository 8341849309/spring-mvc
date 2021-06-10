function validate(frm){
	
	let name=frm.cname.value;
	let add=frm.cadd.value;
	let billAmt=frm.billAmt.value;
	
	console.log(name);
	console.log(add);
	console.log(billAmt);
	
	let flag=true;
	
	if(name==""){
		document.getElementById("cname").innerHTML="Customer name is required";
		flag=false;
	}else if(name<5){
		document.getElementById("cname").innerHTML="Customer name should be greater than 5 chars";
		flag=false;
	}
	
	if(add==""){
		document.getElementById("cadd").innerHTML="Customer address is required";
		flag=false;
	}else if(add<8){
		document.getElementById("cadd").innerHTML="Customer address should be greater than 8 chars";
		flag=false;
	}
	
	if(billAmt==""){
		document.getElementById("billAmt").innerHTML="Bill Amount is required";
		flag=false;
	}else if(billAmt<0 && billAmt>0){
		document.getElementById("billAmt").innerHTML="Bill Amount should be postive";
		flag=false;
	}else if(isNaN(billAmt)){
		document.getElementById("billAmt").innerHTML="Customer BillAmt be numberic value";
		flag=false;
	}
	
	frm.vflag.value="yes";
	
	return flag;
}