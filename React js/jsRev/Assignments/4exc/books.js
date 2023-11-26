const books =[ {
    title :"think and grow rich",
    author : "napolean hill",
    "published year" : 2020
},
{
    title :"power of subconcious mind",
    author : " j murphy ",
    "published year" : 2018
},
{
    title :"atomic habbits",
    author : "j clear ",
    "published year" : 2018
},

]


const findBook= (bookname, book)=> {
   const bookFound = book.find( (item) => item.title==bookname)
   if(bookFound == null){
     return `no book found`
   }
   return bookFound
}

console.log(findBook('think and grow rich by',books))

console.log(findBook('think and grow rich',books))

