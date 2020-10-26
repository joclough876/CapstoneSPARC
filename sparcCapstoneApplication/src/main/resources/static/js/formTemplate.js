// checks if js and jQuery are connected

// if (jQuery) {

//    alert("connected");

// } else {

//    alert("boo!");

// }


 

$("#selType").change(function () {

    if ($(this).val() === "Project") {

        console.log("Option1");

        option1();

    } else {

        optionNone();

    }

})

$("#selType").change(function(){
	console.log("x")
	if ($(this).val() === "BAU-KTLO"){
		var w = 1;
	}
	else if ($(this).val() === "Admin-General"){
		console.log("w")
		var w = 2;
	}
	else if ($(this).val() === "Project") {
	 var w = 3;
	 
 }
 else if ($(this).val() === "BAU-Servicing") {
	var w = 4
 }
 else if ($(this).val() === "BAU-Other") {
	 var w = 5
 }
 else if ($(this).val() === "BAU-VIP") {
	 var w = 6
 }
 else if ($(this).val() === "Admin-PTO/Holiday") {
	var w = 8
 }
 else if ($(this).val() === "Admin-Professional/Personal Development") {
	var w = 9
 }
 
})
 

function option1 () {

    $("#option1").removeClass("collapseField");

    $("#option2").addClass("collapseField");

    $("#option3").addClass("collapseField");

    $("#option4").addClass("collapseField");

    $("#option5").addClass("collapseField");

    $("#option6").addClass("collapseField");

}

 

function option2 () {

    $("#option1").removeClass("collapseField");

    $("#option2").removeClass("collapseField");

    $("#option3").addClass("collapseField");

    $("#option4").addClass("collapseField");

    $("#option5").addClass("collapseField");

    $("#option6").addClass("collapseField");

}

 

function option3 () {

    $("#option1").removeClass("collapseField");

    $("#option2").removeClass("collapseField");

    $("#option3").removeClass("collapseField");

    $("#option4").addClass("collapseField");

    $("#option5").addClass("collapseField");

    $("#option6").addClass("collapseField");

}

 

function option4 () {

    $("#option1").removeClass("collapseField");

    $("#option2").removeClass("collapseField");

    $("#option3").removeClass("collapseField");

    $("#option4").removeClass("collapseField");

    $("#option5").addClass("collapseField");

    $("#option6").addClass("collapseField");

}

 

function option5 () {

    $("#option1").removeClass("collapseField");

    $("#option2").removeClass("collapseField");

    $("#option3").removeClass("collapseField");

    $("#option4").removeClass("collapseField");

    $("#option5").removeClass("collapseField");

    $("#option6").addClass("collapseField");

}

 

function option6 () {

    $("#option1").removeClass("collapseField");

    $("#option2").removeClass("collapseField");

    $("#option3").removeClass("collapseField");

    $("#option4").removeClass("collapseField");

    $("#option5").removeClass("collapseField");

    $("#option6").removeClass("collapseField");

}

 

function optionNone () {

    $("#option1").addClass("collapseField");

    $("#option2").addClass("collapseField");

    $("#option3").addClass("collapseField");

    $("#option4").addClass("collapseField");

    $("#option5").addClass("collapseField");

    $("#option6").addClass("collapseField");

}