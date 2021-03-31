var tang = document.getElementsByClassName("tang");
var giam = document.getElementsByClassName("giam");
var soluong = document.getElementsByClassName("quantity");
var stt= document.getElementsByClassName("stt");


for (let i = 0; i < tang.length; i++){
        stt[i].textContent=i+1;
        tang[i].addEventListener('click', function(){
            if(parseInt(soluong[i].placeholder)<10){
                soluong[i].placeholder=parseInt(soluong[i].placeholder)+1;
            }
        })
        giam[i].addEventListener('click', function(){
            if(parseInt(soluong[i].placeholder)>1){
                soluong[i].placeholder=parseInt(soluong[i].placeholder)-1;
            }
        })
}        
