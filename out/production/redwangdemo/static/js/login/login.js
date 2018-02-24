$(function () {
    $("body").keydown(function() {
        if (event.keyCode == "13") {//keyCode=13是回车键
            document.getElementById("btnSubmit").click();
        }
    });
})



$("#logname_id").click(function () {
    document.getElementById("prompting").innerHTML="";
})

$("#logpass_id").click(function () {
    document.getElementById("prompting").innerHTML="";
})