var data=document.cookie
//check cookie
if(!data){
    document.cookie="ds="+";path=/"
    document.cookie="sl="+";path=/"
}
data=data.split(';')
var ten= document.getElementsByClassName("name")
var buy=document.getElementsByClassName("btn-danger")
var tensp
var soluong

if(data[0].charAt(0)=='d'){
	tensp=data[0].trim().substr(3,data[0].length)
	soluong=data[1].trim().substr(3,data[1].length)
}
else{
	tensp=data[1].trim().substr(3,data[1].length)
	soluong=data[0].trim().substr(3,data[0].length)
}

for(let i=0;i<buy.length;i++){
    buy[i].addEventListener('click',function(){
        if(tensp==''){
		tensp+=ten[i].textContent
		soluong+='1'
		document.cookie="ds="+tensp+';path=/'
		document.cookie="sl="+soluong+';path=/'
	}
	else
		if(document.cookie.indexOf(ten[i].textContent)==-1){
			tensp+=','+ten[i].textContent
			soluong+=',1'
			document.cookie="ds="+tensp+';path=/'
			document.cookie="sl="+soluong+';path=/'
		} 
    })
}