
// rest operaotrs
// pass variable numbers of arguments to a funcion.
function restOperators(...args){
    return `entered args are of ${args.length} in numbers`
}

console.log(restOperators(1,2,3,4))

// spread operators
// arrays can be unpacked and [assed as argumments

const arr=[1,2,3,4,5]
const max = Math.max(...arr)
console.log(max)

// Functions 

const sum = (firstname , secondname,...args)=>{
    const fname = firstname
    const sname = secondname
    console.log(`remaining info has ${args.length} number of arguments`)
}

sum("akshatha","shetty","bangalore" ,"karnataka")

// default parameteres

const sum2 = (a=0,b=0)=>{ 
    console.log(`sum is ${a+b}`)
}
sum2(10)

//
