var submit = document.getElementById("xacnhan");
var ten=document.getElementById("ten");
var phone=document.getElementById("phone");
var address=document.getElementById("address");
var email=document.getElementById("email");
var formdata={
    name:ten.value,
    phone:phone.value,
    address:address.value,
    email:email.value
}
submit.addEventListener("click", function () {
    var xhr = new XMLHttpRequest();
    xhr.open("POST", "/giohang/dathang", true)
    xhr.setRequestHeader("Content-Type","application/json")
    xhr.send(JSON.stringify(formdata));
    location.replace('/giohang/dathang');
})
