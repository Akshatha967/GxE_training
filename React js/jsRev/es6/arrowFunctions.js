// arrow functions can't be used with this keyword,
// so if you need a function that has to access this-> don;t use arrow
// can' tb  used for constructors as we can';t invoke it with a new keyword.


//arrow functions can only be used 
//callback functions, event handlers,
// or other functions that do not need to access or modify the this value of their context



const person = {
    name: "akshatha",
    age:22,
    greet:function(){
        return this.name
    }
}

console.log(person.greet())


//

const display=()=>{
    console.log("hi");
}


const sum=(a,b,calback)=>{
    let sum = a+b;
    calback(sum);
}

sum(2,3,display);