let students = [];
let student = { id: 1, matric: "123456564", address: "Underåsgatan 24" };
students.push(student);
students.push({ id: 2, matric: "123456565", address: "Underåsgatan 26" });
console.log("Students", students);

function add(studentNumber, name, address) {
  students.push({ id: 3, matric: studentNumber, name, address });
}

function printStudent() {
  for (let x = 0; x < students.length; x++) {
    console.log(
      "Name: " + students[x].matric,
      "address: " + students[x].address
    );
  }
  students.forEach((s) =>
    console.log("Name: " + s.name, " address: ", s.address)
  );
}
