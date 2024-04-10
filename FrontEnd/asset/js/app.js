let student;

function registerStudent(){
    
    let firstName = document.getElementById("txtFirstName").value;
    let lastName = document.getElementById("txtLastName").value;
    let address = document.getElementById("txtAddress").value;
    let age = document.getElementById("txtAge").value;

    if (firstName == "" || lastName == "" || address == "" || age == "") {
        window.alert("Enter all the details");
    }
    student = {
        "firstName" : firstName,
        "lastName" : lastName,
        "address" : address,
        "age" : age
    }

    if (student != null) {
        sendStudent(student);
    }
}

function sendStudent(student){
    fetch("http://localhost:8080/student",{
        method: "POST",
        body: JSON.stringify(student),
        headers : {
            "Content-type":"application/json"
        }
    }).then(res => res.json())
    .then(data => {
        console.log(data);
        showSuccess();
    })
}

function showSuccess(){
    window.alert("Successfully Registered");
    clearFields();
}

function clearFields(){
    document.getElementById("txtFirstName").value='';
    document.getElementById("txtLastName").value="";
    document.getElementById("txtAddress").value="";
    document.getElementById("txtAge").value="";
}