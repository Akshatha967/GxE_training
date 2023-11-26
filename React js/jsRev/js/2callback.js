function display(){
    console.log("hi");
}


function sum(a,b,calback){
    let sum = a+b;
    calback(sum);
}


sum(2,3,display);