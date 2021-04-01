var tang = document.getElementsByClassName("tang");
var giam = document.getElementsByClassName("giam");
var soluong = document.getElementsByClassName("quantity");
var stt= document.getElementsByClassName("stt");
var luu=document.getElementById("luu")
var SL=[]
for(let i=0;i<soluong.length;i++){
    SL.push( soluong[i].placeholder);}

for (let i = 0; i < tang.length; i++){
        stt[i].textContent=i+1;
        tang[i].addEventListener('click', function(){
            if(parseInt(soluong[i].placeholder)<10){
                soluong[i].placeholder=parseInt(soluong[i].placeholder)+1;
                SL[i]=soluong[i].placeholder
            }
        })
        giam[i].addEventListener('click', function(){
            if(parseInt(soluong[i].placeholder)>1){
                soluong[i].placeholder=parseInt(soluong[i].placeholder)-1;
                SL[i]=soluong[i].placeholder
            }
        })
}        

luu.addEventListener('click',function(){
   var xhr = new XMLHttpRequest();
   xhr.open("POST", "/giohang/luu",true);
   var data={
       sl:SL
   }
   xhr.setRequestHeader("Content-Type", "application/json");
   xhr.send(JSON.stringify(data))
   location.replace('/giohang');
})
