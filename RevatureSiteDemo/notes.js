//scope- global, local

//falsy = false, 0, undefined, NaN, null, ""
//hoisting - function call is made even before declaration

// test(10);
//function test(a){
//     console.log(a);

// }

// var funcResult = function test(a) {
//     console.log(a);

// }
// funcResult(10);

// (function test(a){
//     console.log(a);
// })(); //IIFE Imediately invoked functions

//Call back function
// function Agreement(policyAcceptance, yes, no){
//     debugger;
//     if(confirm(policyAcceptance)){
//         yes();
//     }
//     else 
//         no();
// }

// function ShowOk(){
//      alert('Policy is accepted');
// }

// function ShowCancel(){
//     alert('Policy is denied');
// }

// Agreement("Do you agree to our policy?", ShowOk, ShowCancel);

/*var result = function add(a,b,c=10){  //ES6 allows for default values
    return a+b+c;
}

console.log(result(10,5,5));
*/


// function Outer(){ //closure
//     var outerData = "OuterData";
//     function inner(){
//         alert(outerData);
//     }
//     return inner;
// }

// var funcCall = Outer();

// funcCall();

// var add = (function(){
//     var counter = 0;
//     return function(){
//         counter += 1;
//         return counter;
//     }
// })();

// console.log(add())
// console.log(add())

//anonymous functions can only be used once

// (() => alert("hello"))(); //imediately invoked arrow function


// console.log(((a,b) => a*b)(5,3));

// var resExp = (a,b) => (a*b); //storing the function in a variable

// console.log(resExp(2,3));

//what does let and const define in javascript, closure, hoisting


//MY OWN SCRIBBLES
// ((word) => {
//     console.log('Hello, ' + word);
// })('World!');

// const abc = (word) => {
//     console.log('Java' + word)
// }

// abc('script');

// let str = "tomorrow"

// console.log(str.length);

/*
function returnValue(){
    return 'Hello world'
}

var functionItself = returnValue;
alert(functionItself);*/

// (function varvslet(){
//     //var function scoped
//     //let block scoped
//     console.log('before declaration' + i);
//     for(var i = 0; i < 5; i++){
//         console.log(i + 'after initialization');
//     }
//     console.log('outside forloop within a function ' + i); //still accessible created in the function
// })();

//console.log('outside function' + i);

// 'use strict'

// let x = []; //empty array 
// x = [1,2,3,4, 'Pushpinder', null, false];
// // for(i in x){
// //     console.log(i);
// // }

// x.forEach(function(e){
//     console.log(e);
// })

//Type Conversion/Coersion
// var i = 10; j = '10';
// j = Boolean(j)
// console.log(j)

//      OBJECTS

// var obj = {} //empty object
// obj = {
//     name:'Push',
//     profession: 'Full Stack Consultant',
//     setDetails:function(){
//         return this.name + ' - ' + this.profession;
//     }
// }
// obj.height = '177' //adding a new member
// obj.color = 'Brown'
// obj['company'] = 'Revature'
// console.log(obj.setDetails() + ' ' + obj['height'])

// var obj2 = {
//     course:'Java',
//     duration: '10 weeks',
//     setDetails2: obj.setDetails
// }

// console.log(obj2.setDetails2);

//constructors in ES5
/*function Person(name, profession, city){
    this.name = name;
    this.profession = profession;
    this.city = city;
    this.sayDetails = function(){
        console.log(name + ' ' + profession + ' ' + city)
    }
}

let objPushpinder = new Person('Pushpinder','New York');
objPushpinder.sayDetails();

function Student(name, age, city, school){
    this.school = school;
    this.age = age;
    this._proto_ = new Person(name, city);
}

let objStudent = new Student('Brandon', 45, 'City', 'CUNY');
objStudent.sayDetails();*/

// class PersonClass{
//     constructor(name,age,city){
//         this.name = name;
//         this.age = age;
//         this.city = city;
//     }
//     sayDetails(){
//         console.log(this.name + ' - ' + this.city)
//     }
// }

// class Student extends PersonClass{
//     constructor(name, age, city, fingers){
//         super(name, age, city);
//         this.fingers = fingers;
//     }
// }

// let student = new Student('Steven', 89, 'Bazinga', 12);
// student.sayDetails();

//