const numbers=[1,2,3,4,5,6,7,8,9,10]

const double = (num )=> {
    return num.map( item => 2*item)
}

const sqrs = (num) => {
    return num.map( item => item*item);
}

console.log(numbers,double(numbers),sqrs(double(numbers)))