// const calculateTotals = (...prices) => {
//  return prices.reduce(getSum)
// }
// const getSum=(total,num)=>{
//     return total+num
// }
// console.log(calculateTotals(0,20,30,40))



// passing the array

const calculateTotal =(arr)=>{
    //let sum=0;
   const val =  arr.reduce((total,num) =>
   (total+=num)
   )
   return val
}
//console.log(calculateTotal([10,20,30,40,50]))
export default calculateTotal