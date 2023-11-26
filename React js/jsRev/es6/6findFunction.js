// find function

// returns the first element that passes the condition


//with arrays
const arr=[1,2,3,4,5]
const passed = arr.find(element=>element>3)
console.log(passed)

//with array of obj..

const inventory = [
    {
        name:"apples",
        quantity:4
    },
    {
        name:"bananas",
        quantity:5
    }
]

const result = inventory.find( ({name}) =>name==="apples")
console.log(result)

// or we can also do ->

const result2= inventory.find( (item) =>item.name==="apples")
console.log(result2)

// ******************************************************** //
/*
*************************************************************
**************************************************************
*/

//Map function
/* 
map function return an array, by executing the given function for each element
*/

const num =[1,2,3,4]
const sqnum = num.map(Math.sqrt)
console.log(sqnum)

const numbers = [12,23,34,45,56]
const resultArray = numbers.map( num => num*10)
console.log(resultArray)

var person =[
    {
        id:1,
        "f_name":"akshatha",
        "l_name":"shetty"
    },
    {
        id:2,
        "f_name":"amy",
        "l_name":"blyton"
    }

]

let resPerson = person.map( 
    (obj,ind) => [obj.f_name,ind]
)
console.log(resPerson)


// ******************************************************* //
// fill method fills specified elemenets in an array witha value.

// fill function -> fill("item", startIndex, lastIndex)

const arrFruits = ["apples","bananas","mangoes"]
arrFruits.fill("starwberries")
console.log(arrFruits)


// if the index specified doesn't exist in the original array the array is not extended
const arrFruits2 = ["apples","bananas","mangoes"]
arrFruits2.fill("starwberries",3,5)
console.log(arrFruits2)


// now the index is present (3 and 4 th index ) wil be filled last index is not included
const arrFruits3= ["apples","bananas","mangoes","","",""]
arrFruits3.fill("starwberries",3,10)
console.log(arrFruits3)


// ****************************************************** // 


//filter functions 
// returns the array of elemetns that pass the given condition

const arrAge = [12, 34, 55, 16,22,26]
const arrVote = arrAge.filter( (item) => item>18)
console.log(arrVote)


// ************************************************************ /// 
 // reduce function
// returns a single values that is the accumulated result of function 


 let arrTosum =[10,20,30,40,50]
 const resSum = arrTosum.reduce(
    (sum,i)=>sum=sum+i
 )
console.log(resSum)

function resProd(total ,num ){
    console.log(num,total)
    return total*num;
}
const resProds = arrTosum.reduce(resProd,1)
console.log(resProds)

console.log(arrTosum.reduce(myFun))


function myFun(total ,num ){
    console.log(num ,total)
    return total - num; 
}

//note: 
/*
when we do not specify the value of total , the total values is taken as the first item of the aray 
the num is taken as the next item . 

if we specify the total value , then num is taken as the first item of the array.
*/

