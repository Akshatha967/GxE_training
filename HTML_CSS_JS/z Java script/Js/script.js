// alert(123);

// add();
// function add(){
//   var a=10,b=20,c=30;
//   var d= a+b+c;
//   document.getElementsByClassName('greet').innerHtml="Good morning";

// }

function bmi()
{
    var wt=parseFloat(document.getElementById('weight').value);
    var ht = parseFloat(document.getElementById('height').value);
    ht=ht/100;
    let bmi = wt/(wt*ht);
    console.log(bmi);
    document.getElementById('result').innerText="BMI is "+bmi;
    console.log(bmi==50? "perfect": (bmi<50)? "underwt":"overwt");
    // return false;
}

function String(){

    var name =document.getElementById("name").value;
    // if(name.length >10)
    // {
    //     document.getElementById("name").innerText=name.slice(0,10);

    // }

    console.log(hello);
    // return false;
}

function arr(){
   var fruts=["banana","apple","mango","orange"];

   var fr="";
   for(let i=0;i<arr.length;i++)
   {
    fr+="<li>"+fruits[i]+"</li>";
   }
   document.getElementById("fruits").innerhtml=fr;
   console.log("executed arr");
}