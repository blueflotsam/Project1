document.getElementById("logout").addEventListener("click",function(){
    window.location.replace("mainPage.html");
},false);

//fetch info from server
let url="http://localhost:8080/Project1/hello";
let xhttp=new XMLHttpRequest();
xhttp.onreadystatechange=receiveData;
xhttp.open('GET', url, true);
xhttp.send();

function receiveData(){
    if(xhttp.readyState==4&&xhttp.status==200){
        let r=xhttp.responseText;
        console.log(r);

        //parse each activity from r and put into list
        let list=document.getElementById("current");
        //for loop to add

    
    }
    else{
        console.log("not working");
    }
};