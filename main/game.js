/*let body=document.getElementById('body');
let newP=document.createElement('p');
section.appendChild(newP);
newP.innerHTML="Im a new paragraph";*/

let urlSource='https://www.dnd5eapi.co/api/classes';
document.getElementById('getData').onclick =getData;
let section=document.getElementById('data');
function getData(){
    console.log('clicked button');
    url=urlSource;
    let xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange=receiveData;
    xhttp.open('GET', url ,true);
    xhttp.send();

    function receiveData(){
        if(xhttp.readyState==4&&xhttp.status==200){
            let r=xhttp.responseText;
            //console.log(r);
            r=JSON.parse(r);
            console.log(r);
            //section.innerHTML=r;
            populateData(r);
        }
        else{
            //error handling
        }
    }
}
function populateData(res){
    let userInput=document.getElementById('dataInput').value;
    let dataSection=document.getElementById('data');
    let nameTag=document.createElement('h3');
    nameTag.innerHTML=res.results[userInput].name;
    section.appendChild(nameTag);
    /*let abilitiesArray=res.results.userInput.name;
    let abilities=document.createElement('ul');
    abilities.innerHTML+="Class name:<br>";
    dataSection.appendChild(abilities);*/
    /*abilitiesArray.forEach(element => {
        console.log(element);
        let abilityItem=document.createElement('li');
        abilityItem.innerHTML=element.ability.name;
        abilities.appendChild(abilityItem);
        //abilities.appendChild(element);
    });*/
}