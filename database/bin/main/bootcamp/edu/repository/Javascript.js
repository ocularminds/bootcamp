Javascript
let name = "Festus";
const PI = 3.142;
let student = {id: "1234", name: "Kiroshi", department:"Electrical Engineering"};
student.name = "Kiroshi Yamaha";
student.age = 18;
JSON.stringify(student);
let o = JSON.parse(string);

//Arrays 
let students = [];
students.push(student);
students.push({id: "1235", name: "Dino", department:"Policial Science"});

//for-loop
for(let x = 0; x < students.length; x++){
    let s = students[x];
    console.log(s.name+" :", s);
}
//function for-each
students.forEach(s => console.log(s.name+" :", s));
//modification while iterating
students.map(s => {
    s.score = 40;
    return s;
});

// Map - key-value pair
let countryCapitals = new Map();
countryCapitals.put("nigeria", "Abuja");
countryCapitals.put("sweden", "Stockolm");
countryCapitals.put("usa", "New York");
const capitals = {};
capital["nigeria"] = "Abuja";
//methods
let total = 0; //global
function sum(a,b){
    return a + b;
}

function calculateArea(shape, length, breath, height){
    if(shape == 1){
        //rectangle
        return length * breath;
    } else if(shape == 2){
        //square
        return length * length;
    } else if(shape == 3){
        //rectangle
        return (breath * height)/2;
    } else{
        return 0;
    }
}

let area = calculateArea(2, 12, 4);
console.log(area);
//default value
function calculateArea(shape=1, length=5, breadth=3){

}
calculateArea();
calculateArea(3);

// callback
function calculateByShapeId(id, callback){
    let a = 23, b = 43, c = 10;
    callback(id, a, b, c);
}

calculateByShapeId(2, calculateArea);

function printStudent(student){
    console.log(student);
}

function printStudentById(matric, callback){
    let student = students.get(matric);
    callback(student);
}
// arrow function
const printStudent = (student) => console.log(student);
const calculateArea = (shape, length, breadth, height) => {
    return length * height;
}

let testName = "Daniel";
testName.toLowerCase();
testName.toLowerCase();

let addresses = "Titus strees, 1 shogbamu close, 45 Keshinton Lane";
addresses.split(",");
let data = [23, 56,21, 9]
data.join(",");
//Spread method destructure

let student = {firstName: "Jamiu", age:32, school: "awes", state: "Pony"};
const {firstName, school} = student;
console.log('Student: ', firstName, ' school:', school);
student.age = 42;
student.state = "Ekiti";

//spread
student = {...student, age: 42, state: "Ekiti"};

// given a list strings, return a string with maximum number of characters
//button - onClick, onSubmit
//alert() - displays a window message or information on the web
//input - onBlur, onFocus, onChange, onKeyUp, onKeyDown

//Element - input, form, div, a, b, span, table, li, ul, ol, select, 
// Each should name, id, class
//getElementById, getElementByName, getElementByClass
