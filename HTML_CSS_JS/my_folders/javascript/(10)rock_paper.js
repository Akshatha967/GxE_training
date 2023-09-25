/*
  Rock Paper Scissors 🚀🔥
  Concepts covered in this project
    👉 For loops
    👉 Dom Manipulation
    👉 Variables
    👉 Conditionals (if else if)
    👉 Template Literals
    👉 Event Listeners
    👉 Higher order Function (Math.random())
*/

// ** getComputerChoice randomly selects between `rock` `paper` `scissors` and returns that string **
// getComputerChoice() 👉 'Rock'
// getComputerChoice() 👉 'Scissors'

const totalScores={human :0, computer:0

}
function getComputerChoice() {
  let choice =['Rock','Paper','Scissors']
  let index = Math.floor(Math.random()*3)
  return choice[index]
  
}

// ** getResult compares playerChoice & computerChoice and returns the score accordingly **
// human wins - getResult('Rock', 'Scissors') 👉 1
// human loses - getResult('Scissors', 'Rock') 👉 -1
// human draws - getResult('Rock', 'Rock') 👉 0
function getResult(playerChoice, computerChoice) {
  // return the result of score based on if you won, drew, or lost
  let score;
  // All situations where human draws, set `score` to 0
  if (playerChoice==computerChoice)
  {
    score =0
    //console.log(score)
  }

  // All situations where human wins, set `score` to 1
  // make sure to use else ifs here
  else if((playerChoice=='Rock' && computerChoice=='Scissors') || (playerChoice=='Scissors' && computerChoice=='Paper'))
  {
    score =1
    console.log(score)
  }
  else if(playerChoice=='Paper' && computerChoice=='Rock' )
  {
    score =1
    console.log(score)
  }


  // Otherwise human loses (aka set score to -1)
 else{
  score =-1
 }

  showResult(score,playerChoice,computerChoice)
  
}

// ** showResult updates the DOM to `You Win!` or `You Lose!` or `It's a Draw!` based on the score. Also shows Player Choice vs. Computer Choice**
function showResult(score, playerChoice, computerChoice) {
  // Hint: on a score of -1
  // You should do result.innerText = 'You Lose!'
  // Don't forget to grab the div with the 'result' id!
  let resl = document.getElementById('endGameButton')
  let ps = document.getElementById('player-score')
  let hands = document.getElementById('hands')
  let res = document.getElementById('result')

  if (score==-1)
  {
    totalScores['human']= totalScores['human']-1;
    res.innerText='You Lose!'
  }
  else if (score==1)
  {
    totalScores['human']++;
    res.innerText='You Win!'
  }
  else if (score==0)
  {
    res.innerText='Its a Draw!'
  }
  hands.innerHTML=`you: ${playerChoice} VS robot:${computerChoice}`
  ps.innerText= totalScores['human'];

}

// ** Calculate who won and show it on the screen **
function onClickRPS(playerChoice) {
  let cs = getComputerChoice()
  console.log(cs)
  getResult(playerChoice, cs)

}


// ** Make the RPS buttons actively listen for a click and do something once a click is detected **
function playGame() {
  
  // use querySelector to select all RPS Buttons
  const rpsBtn = document.querySelectorAll('.rpsButton')

  // * Adds an on click event listener to each RPS button and every time you click it, it calls the onClickRPS function with the RPS button that was last clicked *
  
  // 1. loop through the buttons using a forEach loop
  // 2. Add a 'click' event listener to each button
  // 3. Call the onClickRPS function every time someone clicks
  // 4. Make sure to pass the currently selected rps button as an argument

  rpsBtn.forEach(rps =>
    {
      
      rps.onclick=()=>{
        console.log(rps.value)
        onClickRPS(rps.value)
      }
    }
    
    )

  // Add a click listener to the end game button that runs the endGame() function on click
  let end = document.getElementById('endGameButton')
  end.onclick=()=>
  {
    endGame()
  }
  
}

// ** endGame function clears all the text on the DOM **
function endGame() {

  let ps = document.getElementById('player-score')
  let hands = document.getElementById('hands')
  let res = document.getElementById('result')
  ps.innerText='';
  hands.innerText=''
  res.innerText=''
  totalScores['human']=0
  totalScores['cs']=0

}

playGame()