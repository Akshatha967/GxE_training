
//destructuring array
const user =["akshatha","shetty" ,22]
const [name1,,age] = user;
console.log(name1,age);



//destructuring the objects
const user2 = {
    name:"akshatha",
    age2:22
}
const {name:username,age2}=user2;
console.log(username);

// note don't call the function before declaring one 
const  display=({name:username,age2:userage})=>{
    console.log(`name is ${username} and age is ${userage}`)

}

display(user2)

