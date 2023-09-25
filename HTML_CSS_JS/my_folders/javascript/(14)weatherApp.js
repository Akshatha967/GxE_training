/**
 * Weather App
 * TODO: Complete getWeatherData() to return json response Promise
 * TODO: Complete searchCity() to get user input and get data using getWeatherData()
 * TODO: Complete showWeatherData() to set the data in the the html file from response
 */

// API_KEY for maps api
let API_KEY = "a8e71c9932b20c4ceb0aed183e6a83bb";

/**
 * Retrieve weather data from openweathermap
 * HINT: Use fetch()
 * HINT: URL should look like this: 
 * https://api.openweathermap.org/data/2.5/weather?q=detroit&appid=a8e71c9932b20c4ceb0aed183e6a83bb&units=imperial
 */
const getWeatherData = (city) => {
  const URL = "https://api.openweathermap.org/data/2.5/weather";
  //HINT: Use template literals to create a url with input and an API key

  fetch(`${URL}?q=${city}&appid=${API_KEY}&units=imperial`)
  .then(response => response.json())
  .then(data =>
    {
      
      console.log(data.name)
        const weatherdata = {
          name: data.name,
          temp: data.main.temp,
          min_temp: data.main.temp_min,
          max_temp: data.main.temp_max,
          main : data.weather[0].main

        }
        showWeatherData (weatherdata)


    })
    .catch(error=>console.log({error}))
  //CODE GOES HERE
}

/**
 * Retrieve city input and get the weather data
 * HINT: Use the promise returned from getWeatherData()
 */
const searchCity = () => {
  const city = document.getElementById('city-input').value;
  // CODE GOES HERE
  getWeatherData(city)

}

/**
 * Show the weather data in HTML
 * HINT: make sure to console log the weatherData to see how the data looks like
 */
const showWeatherData = (weatherData) => {
  //CODE GOES HERE
 
    document.getElementById('temp').innerText=weatherData.temp
    document.getElementById('min-temp').innerText=weatherData.min_temp
    document.getElementById('max-temp').innerText = weatherData.max_temp
    document.getElementById('weather-type').innerText=weatherData.main
    document.getElementById('city-name').innerText=weatherData.name
  
}

