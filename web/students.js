let students = []; 
let student = {id:1, matric: "1239880", address: "1, Keshinton lane"};
students.push(student);
students.push({id:2, matric: "1239881", address: "13, Fyrkloversgatan lane"});
console.log('Students', students);

function add(studentNumber, name, address){
    students.push({id:3, matric: studentNumber, name, address});
}

function printStudent(){
    for(let x = 0; x < students.length; x++){
        console.log("Name: "+students[x].name," address: ", students[x].address);
    }

    students.forEach(s => console.log("Name: "+s.name," address: ", s.address));
}
add("4566000", "Jendo", "Kokosari Avenue");
printStudent();
