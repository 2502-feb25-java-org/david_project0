//retrieves the values from local storage on load. 
function populate() {
    
    localStorage.getItem('key', sender);
    //for(int i = 0; i < d
}

//saves values to local storage
function load(sender) {
    
    localStorage.setItem('key', sender);
}

//retrieves the value of input fields 
function values(sender) {

    load(document.getElementByName(sender).value);

}

function testNow(){
    console.log(alert);
}

//checks if the first name and last name are equivalent and displays an error message. 
function namecheck() {
    var fn = document.getElementById("fn").value.trim();
    var ln = document.getElementById("ln").value.trim() ;

    if (fn == ln) {
        alert("must enter a unique first and last name!")
    }
}

//restricts input to numbers only through
function isNumberKey(evt){
    var charCode = (evt.which) ? evt.which : event.keyCode
    if (charCode > 31 && (charCode < 48 || charCode > 57))
        return false;
    return true;
}