var submit = document.getElementById("xacnhan");

submit.addEventListener("click", function () {
    var ten = document.getElementById("ten");
    var phone = document.getElementById("phone");
    var address = document.getElementById("address");
    var email = document.getElementById("email");
    var formdata = {
        name: ten.value,
        phone: phone.value,
        address: address.value,
        email: email.value
    }
    if (email.value != "") {
        var xhr = new XMLHttpRequest();
        xhr.open("POST", "/giohang/dathang", true)
        xhr.setRequestHeader("Content-Type", "application/json")
        xhr.send(JSON.stringify(formdata));
        location.replace('/');
    }
})
