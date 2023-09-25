/* 
🌟 APP: Tip Calculator

These are the 3 functions you must use 👇
=========================================
calculateBill()
increasePeople()
decreasePeople()

These functions are hard coded in the HTML. So, you can't change their names.

These are all the DIV ID's you're gonna need access to 👇
========================================================
#1 ID 👉 'billTotalInput' = User input for bill total
#2 ID 👉 'tipInput' = User input for tip
#3 ID 👉 'numberOfPeople' = Current number of people you're splitting the bill between
#4 ID 👉 'perPersonTotal' = Total dollar value owed per person
*/

// Get global access to all inputs / divs here (you'll need them later 😘)
// bill input, tip input, number of people div, and per person total div
var bilTtl = document.getElementById('billTotalInput')
var tipInp = document.getElementById('tipInput')
var numPpl = document.getElementById('numberOfPeople')
var perPerttl = document.getElementById('perPersonTotal')

// Get number of people from number of people div
let  countPpl = Number(numPpl.innerText)



// ** Calculate the total bill per person **
const calculateBill = () =>
{
var bill = Number(bilTtl.value);
var tips  = Number(tipInp.value);

let totalAmt = (tips/100)*bill+bill

let eachAmt = totalAmt/countPpl
perPerttl.innerText=`${eachAmt.toFixed(2)}`
}

// ** Splits the bill between more people **
const increasePeople = () =>
{
var val = Number(numPpl.innerText)
val=val+1
//console.log(val)
numPpl.innerText=val;
countPpl=val;
calculateBill();
}

// ** Splits the bill between fewer people **
const decreasePeople = () =>
{
    var val = Number(numPpl.innerText)
    if (val==1){
        val=1
    }
    else{
    val=val-1
    //console.log(val)
    numPpl.innerText=val;
    countPpl=val;
    calculateBill();
    }
}