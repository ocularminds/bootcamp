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

function addStudent(){
    let name = document.getElementById("name").value;
    let email = document.getElementById("email").value;
    let department = document.getElementById("department").value;
    let faculty = document.getElementById("faculty").value;
    let age = document.getElementById("age").value;
    let genderOptions = document.getElementsByName("gender");
    let gender;
    for(var i = 0; i < genderOptions.length; i++){
      if(genderOptions[i].checked){
          gender = genderOptions[i].value;
      }
    }
    add(name, email, department, faculty, age, gender);
}

function printStudent(){
    for(let x = 0; x < students.length; x++){
        console.log("Name: "+students[x].matric," address: ", students[x].address);
    }

    students.forEach(s => console.log("Name: "+s.name," address: ", s.address));
}
