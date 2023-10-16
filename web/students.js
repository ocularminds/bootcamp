let students = []; 

function add(name, email, department, faculty, age, gender){
    let id = students.length + 1;
    students.push({id, name, email, department, faculty, age, gender});
    let data = "";
    for(var x = 0; x < students.length; x++){
      data = data + `<tr><td>${students[x].name}</td><td>${students[x].email}</td><td>${students[x].department}</td>
      <td>${students[x].faculty}</td><td>${students[x].age}</td><td>${students[x].gender}</td></tr>`;
    }
    document.getElementById("records").innerHTML = data;
}

function createStudentAndPost(name, street, city, state){
    const student = {name: name, address:{street:street, city:city, state:state}};
    const baseUrl = 'http://localhost:8080/students'
    fetch(baseUrl, {method: 'POST', body: student})
    .then(response => response.json())
    .then(data => {
        console.log(data);
    })
}

function getStudents(){
    const baseUrl = 'http://localhost:8080/students'
    fetch(baseUrl)
    .then(response => response.json())
    .then(students => {
    let data = "";
        for(var x = 0; x < data.length; x++){
            data = data + `<tr><td>${students[x].name}</td><td>${students[x].email}</td><td>${students[x].department}</td>
            <td>${students[x].faculty}</td><td>${students[x].age}</td><td>${students[x].gender}</td></tr>`;
          }
          document.getElementById("records").innerHTML = data;
    })
}

function addStudent(){
    let name = document.getElementById("name").value;
    let city = document.getElementById("city").value;
    let state = document.getElementById("state").value;
    let street = document.getElementById("street").value;
    createStudentAndPost(name, street, city, state);
}

function printStudent(){
    for(let x = 0; x < students.length; x++){
        console.log("Name: "+students[x].matric," address: ", students[x].address);
    }

    students.forEach(s => console.log("Name: "+s.name," address: ", s.address));
}
