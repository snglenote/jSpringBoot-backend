# jSpringBoot-backend

An backend API for a movie website made using the [Java Spring Boot](https://start.spring.io) tool, Spring Framework and MongoDB. The API allows users to send requests to:


* **get all movies:**

Request: GET `localhost:8080/api/v1/movies`

Response: (Format with only 2 for example)
```
{
"id": {
"timestamp": ,
"date": ""
},
"imdbId": "",
"title": "",
"releaseDate": "",
"trailerLink": ",
"poster": "",
"genres": [],
"backdrops": [],
"reviewsIds": []
},

{
"id": {
"timestamp": ,
"date": ""
},
"imdbId": "",
"title": "",
"releaseDate": "",
"trailerLink": ",
"poster": "",
"genres": [],
"backdrops": [],
"reviewsIds": []
}
```

* **get a single movie:**

Request: GET `localhost:8080/api/v1/movies`

Response: (Format)
```
{
"id": {
"timestamp": ,
"date": ""
},
"imdbId": "",
"title": "",
"releaseDate": "",
"trailerLink": ",
"poster": "",
"genres": [],
"backdrops": [],
"reviewsIds": []
}
```


* **create a new review:**

Request: POST `localhost:8080/api/v1/reviews`

Body: (raw JSON Format)

```
{
    "reviewBody": "",
    "imdbId": ""
}
```