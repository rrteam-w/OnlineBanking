# Prerequisites to work on Microservices

** Basic knowledge on Java and Springboot.
** Download the eclipse IDE or Springboot IDE i.e. STS.
** Spring Tool Suite Download URL - https://spring.io/blog/2019/06/20/spring-tool-suite-3-9-9-released.

** The main aim of the application is to fetch and display movie information by using userId.
In order to develop this application, we need to create three micro services.Those are:
1. movie-catalog-service
2. movies-info-service
3. rating-info-service

** We need Eureka server to deploy above three microservices in it. So that anyone can access our microservices at globally.
1. eureka-server.

The following are the URL's to access the microservices.

1. http://localhost:8081/catalog/userId - To get the list of movies along with ratings information by using userId
2. http://localhost:8082/moviedb/movieId - To get the movies information from external service i.e. moviedb by using movieId
3. http://localhost:8083/rating/users/userId - To get the list of movies rating information by using userId
4. http://localhost:8083/rating/movieId - To get the movie rating by using movieId.
5. http://localhost:8761 - To access the Eureka server in your local machine.

The following things need to know to handle the microservices, If there are down or slow.
1. Circuit Breaker Pattern
2. Bulkhead Pattern
3. Hystrix Dashboard

# Circuit Breaker Pattern

Spring boot uses this pattern to handle the microservices, If there are down or slow.
It has some properties to stop sending requests at certain time and trying again once it reaches to maximum timeout.
commandProperties = {
    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "20000"), // wait for 2 seconds...
    @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "5"), // Observe last 5 requests...
    @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "50"), // Check failed percentage on last 5 requets...
    @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "100000")} // Again try making request after 10 seconds...

For example, If servics is down or slow, three ways we can handle this scenarion. Those are:
1. Throw Error.
2. Create a fall back method and return response.
3. Maintain previous request, response in cache and return it.

In order to implement CircuitBreaker Pattern in application. Follow the below steps:
1. Add the below dependency in pom.xml file.
    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-netflix-hystrix</artifactId>
    </dependency>

2. In the main class mark class as a @EnableCircuitBreaker.
3. Write the fallback method for business logic method like @HystrixCommand(fallbackMethod="somemethod()") and provide the default information for fallback method i.e. somemethod().
4. Add the command properties to hold requests on certain time.

# Hystrix Dashboard

If you want to see services in hystrix dashboard, then follow the below steps.
1. Add the below dependency in pom.xml file.
    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-netflix-hystrix-dashboard</artifactId>
    </dependency>
2. In the main class mark the class with @EnableHystrixDashboard.
3. Add this property in application.properties file, management.endpoints.web.exposure.include=hystrix.stream
4. Access the dashbaord in your local machine, use this url: https://localhost:8081/hystrix.
5. After open hystrix dashboard, Observe url, copy the url and paste in textfield, replace the host name with localhost:8081(In your case base microservice which includes both micro services) and click on monitor stream button.

