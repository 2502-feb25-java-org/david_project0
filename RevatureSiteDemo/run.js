//defines what must be input for admin login
function go() {
    let user = document.getElementById("name").value;
    let pass = document.getElementById("pass").value;

    if ((user == "Admin" || user == "admin") && pass == 123) {
        window.location.href = "game.html";
        canvas.style.display = "contents";
    } else
        alert("Incorrect username and password combination.");
}


// storing input from register-form
function store() {
    
        var fn = document.getElementById("fn").value.trim();
        var ln = document.getElementById("ln").value.trim() ;
    
        if (fn == ln) {
            alert("must enter a unique first and last name!")
        }else{
   
    
    alert("Thank you for signing up");

    // Name and Password from the register-form
    var email = document.getElementById('email');
    var pw = document.getElementById('pw');

    localStorage.setItem('email', email.value);
    localStorage.setItem('pw', pw.value);

    window.location.href = "index.html"
        }
}

function valid() {
    // stored data from the register-form
    var storedName = localStorage.getItem('email');
    var storedPw = localStorage.getItem('pw');

    // entered data from the login-form
    var userName = document.getElementById('email');
    var userPw = document.getElementById('pass');

    if (userName.value == storedName && userPw.value == storedPw) {

        alert('You are loged in.');
        window.location.href = "game.html"
    } else {
        alert('ERROR.');
    }
}