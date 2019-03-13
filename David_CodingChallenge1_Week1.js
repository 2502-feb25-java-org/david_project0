(function FizzBuzz(){
for (var i = 1; i <= 1000; i++) {
	
	var output = "";
	
	if( i % 3 == 0 ) { 
        output += "Fizz"; 
    }
	if( i % 5 == 0 ) { 
        output += "Buzz"; 
    }
		
	if( output == "") { 
        output = i 
    }
	
	console.log(output);
	
    }
})();



