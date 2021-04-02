var tang = document.getElementsByClassName("tang");
var giam = document.getElementsByClassName("giam");
var soluong = document.getElementsByClassName("quantity");
var stt = document.getElementsByClassName("stt");
var giaSP = document.getElementsByClassName("giaSP");
var luu = document.getElementById("luu")
var tonggia = document.getElementById("TongGia")
var formatter = new Intl.NumberFormat('vn', {
    style: 'currency',
    currency: 'VND',
    minimumFractionDigits: 0
})

function stringToNumber(number) {
    return parseInt(number.split('.').join(''))
}
function TongGia() {
    let tong=0;
    for (let i = 0; i < soluong.length; i++) {
        tong+=stringToNumber(giaSP[i].textContent)*soluong[i].placeholder;
    }
    tonggia.textContent=formatter.format(tong);
}
TongGia()
var SL = []

for (let i = 0; i < soluong.length; i++) {
    SL.push(soluong[i].placeholder);
}

for (let i = 0; i < tang.length; i++) {
    stt[i].textContent = i + 1;
    tang[i].addEventListener('click', function () {
        if (parseInt(soluong[i].placeholder) < 10) {
            soluong[i].placeholder = parseInt(soluong[i].placeholder) + 1;
            SL[i] = soluong[i].placeholder 
            TongGia()
        }
    })
    giam[i].addEventListener('click', function () {
        if (parseInt(soluong[i].placeholder) > 1) {
            soluong[i].placeholder = parseInt(soluong[i].placeholder) - 1;
            SL[i] = soluong[i].placeholder
            TongGia()
        }
    })
}

luu.addEventListener('click', function () {
    var xhr = new XMLHttpRequest();
    xhr.open("POST", "/giohang/luu", true);
    var data = {
        sl: SL
    }
    xhr.setRequestHeader("Content-Type", "application/json");
    xhr.send(JSON.stringify(data))
    location.reload();
})


 