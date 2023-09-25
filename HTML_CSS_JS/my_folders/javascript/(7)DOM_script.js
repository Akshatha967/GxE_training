
///innerHTML when you want - the html inside as well
document.getElementById('intro_name').innerHTML='<h2>My name is Akshatha</h2>'
var altrd =document.getElementById('intro_name');
console.log(altrd.innerHTML);

//innerText wen u just want the text content
document.getElementById('aftr_intro').innerText='good day today'
var val = document.getElementById('already_written');
console.log(val.innerText);

//use variable to replace the inner text
var var_rep_text = 'this is a text written using a variable'
document.getElementById('var_rep').innerHTML=`<h5>${var_rep_text}.<br>This is outside the var text</h5>`

//styling using JS
altrd.style.color='red'
altrd.style['font-style']='italic'
altrd.style['backgroundColor']='pink'

//events like onclick etc
