
var infoDiv = document.getElementById('info_div');
infoDiv.onclick = () =>
{
    console.log(infoDiv.innerText)
}

function r_y_g(item)
{
let vals =document.getElementById(item).innerText
console.log(vals);
}


// Rock paper scissors and queryselectorall using class names 

const rps_clss = document.querySelectorAll('.div_rps')
//console.log(rps_clss[0].value)
// for each loop
let countClicks={

}
rps_clss.forEach(rps =>
    {
        rps.onclick = () =>
        {
            if(rps.value in countClicks)
            {
                countClicks[rps.value]++;
            }
            else{
                countClicks[rps.value]=1
            }
            rps.innerText=countClicks[rps.value];
            console.log(rps.value)
        }
    }
)

function clear_fun()
{
    rps_clss.forEach(rps =>
        {
            rps.innerText=0
            countClicks[rps.value]=0
        }
        )
}

var clear_game_div = document.getElementById('clear-games')
clear_game_div.onclick =()=>clear_fun()

