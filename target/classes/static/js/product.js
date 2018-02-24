/**
 * Created by zunyun on 18-2-24.
 */

function jumpPageOne() {
    document.getElementById("pageOne").style.display = "block";
    document.getElementById("pageTwo").style.display = "none";
    document.getElementById("pageThree").style.display = "none";
}

function jumpPageTwo() {
    document.getElementById("pageOne").style.display = "none";
    document.getElementById("pageTwo").style.display = "block";
    document.getElementById("pageThree").style.display = "none";
}

function jumpPageThree() {
    document.getElementById("pageOne").style.display = "none";
    document.getElementById("pageTwo").style.display = "none";
    document.getElementById("pageThree").style.display = "block";
}

function jumpPageNext() {

}
