/* 
🌟 APP: Fighting Game

Create an updateGame() function that will update the DOM with the state of the game 👇
========================================

- updateGame()

These are the 2 classes you must create and their methods 👇
========================================

class Player {
  - strike()
  - heal()
}

class Game {
  - play()
  - checkIsOver()
  - declareWinner()
  - reset()
}

These functions are hard coded in the HTML. So, you can't change their names.

These are all the DIV ID's you're gonna need access to 👇
========================================================
#1 ID 👉 'play' = Button to run simulation
#2 ID 👉 'result' = Div that holds the winner of the match
#3 ID 👉 'p1Health' = Div that holds player 1's health
#4 ID 👉 'p2Health' = Div that holds player 2's health
*/

// ** Grabs elements from the DOM and stores them into variables **
let playButton = document.getElementById('play')
let resultDiv = document.getElementById('result')
let p1HealthDiv = document.getElementById('p1Health')
let p2HealthDiv = document.getElementById('p2Health')
let p1names = document.getElementById('p1name')
let p2names = document.getElementById('p2name')

// ** Check if either players health is  0 and if it is, then update isOver to true **
const updateGame = (p1,p2, gameState) => {
  // Update the DOM with the latest health of players
p1names.innerText = p1.name;
p2names.innerText = p2.name;
p1HealthDiv.innerText=p1.health;
p2HealthDiv.innerText=p2.health
 if(p1.health<=0 || p2.health<=0)
 {
    game.isOver=true
    gameState=game.isOver
    resultDiv.innerText = game.declareWinner(game.isOver,p1,p2)
 }
 
}

// ** Create the Player class which can create a player with all it's attributes and methods **
// qazi = Player('Qazi', 100, 7)
// qazi.name 👉 'Qazi'
// qazi.health 👉 100
// qazi.attackDmg 👉 7
class Player {
  constructor(name, health, attackDamage) {
    this.name = name;
    this.health = health;
    this.attackDmg = attackDamage;
  }
  // ** Attack an enemy with a random number from 0 to YOUR attackDmg bonus **
  strike (player, enemy, attackDmg) {
    let damageamt =Math.ceil( Math.random()*attackDmg)

    enemy.health-=damageamt
    updateGame(p1,p2,game.isOver)
    return `${player.name} attacks ${enemy.name} for ${damageamt}damage! `
  }
  // ** Heal the player for random number from  1 to 5 **
  heal (player) {
    let healamt = Math.ceil(Math.random()*5)
    player.health +=healamt
    updateGame(p1,p2,game.isOver)
    return `${player} heals for the ${healamt} HP! `
  }
}

// ** Create the Game class with all it's attributes and methods to run a match **
class Game {
  constructor() {
    this.isOver=false;
  }

  // ** If the game is over and a player has 0 health declare the winner! **
  declareWinner(isOver,p1, p2) {
    let message='tie'
  if(isOver)
  {
    if(p1.health<=0)
    {
      message = `${p2.name} wins`

    }
    else{
      message =  `${p1.name} wins`
    }
  }
  // victory sound document.getElementById('')
  return message
  }

  // ** Reset the players health back to it's original state and isOver to FALSE **
  reset(p1,p2) {
   p1.health=100
   p2.health=100
   this.isOver=false
   resultDiv.innerText=''
   updateGame(p1,p2,Game.isOver)
  }
  
  // ** Simulates the whole match untill one player runs out of health **
  play(p1, p2) {
    
    // Make sure the players take turns untill isOver is TRUE
   this.reset(p1,p2)
    while(!this.isOver)
    {
      p1.strike(p1,p2,p1.attackDamage)
      p2.heal(p2)
      p2.strike(p2,p1,p2.attackDamage)
      p2.heal(p1)
    }
    // Once isOver is TRUE run the declareWinner() method 
    return this.declareWinner(this.isOver,p1,p2)

  }

}

// ** Create 2 players using the player class **
let player1 = new Player('EMMA', 100, 15)
let player2 = new Player('DANIEL', 100, 15)

// ** Save original Player Data **
let p1 = player1
let p2 = player2

// ** Create the game object from the Game class **
let game = new Game()
console.log(game)

// ** Save original Game Data **
updateGame(p1,p2,game.isOver)


// ** Add a click listener to the simulate button that runs the play() method on click and pass in the players **
//playButton.onclick=()=>
//resultDiv.innerText = game.play(p1,p2)


// ** BONUS **
// Add functionality where players can press a button to attack OR heal

// ** Player 1 Controls **
//p1.strike(p1,p2,10)
document.addEventListener('keydown',function(e)
{
  if(e.key =='q' && p2.health >0 && game.isOver==false)
  {
    p1.strike(p1,p2,p1.attackDmg)
    document.getElementById('p1attack').play()
  }
})

document.addEventListener('keydown',function(e)
{
  if(e.key =='a' && p2.health >0 && game.isOver==false)
  {
    p1.heal(p1)
    document.getElementById('p1heal').play()
  }
})

// ** Player 2 Controls **
document.addEventListener('keydown',function(e)
{
  if(e.key =='p' && p1.health >0 && game.isOver==false)
  {
    p2.strike(p2,p1,p2.attackDmg)
    document.getElementById('p2attack').play()
  }
})

document.addEventListener('keydown',function(e)
{
  if(e.key =='l' && p1.health >0 && game.isOver==false)
  {
    p2.heal(p2)
    document.getElementById('p2heal').play()
  }
})




