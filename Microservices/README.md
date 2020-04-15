# prerequisite
** Download the eclipse IDE or Spring boot IDE i.e. STS.

** The main aim of the application is to fetch the movie information by using userId.
In order to develop this application, we need to create three micro services.Those are:
1. movie-catalog-service
2. movies-info-service
3. rating-info-service

** we need Eureka server to expose our microservices with it. So that anyone can access our services at global level.
Add Eureka server in pom.xml file.

The following are the URL's to access the microservices.

1. http://localhost:8081/catalog/userId - To get the movie along with list rating information by using userId
2. http://localhost:8082/movie/movieId - To get the movie information by using movieId
3. http://localhost:8083/rating/users/userId - To get the list of movies rating information by using userId
3.1 http://localhost:8083/rating/movieId - To get the movie rating by using movieId

