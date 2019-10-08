## About this repo
This repository contains partially implemented web app that intended to provide functionality of adding posts and comments to posts.
It's written in Java 8 using Spring Boot (Spring MVC and JPA), Thymeleaf and Bootstrap 4.

Below you'll find tasks to do as your internship recruitment challenge. You do not need to do them all, but do as much you can. Feel free to search the internet for help, but it will be rather good for you to start with the links provided in `Usefull links` section.
If you complete all tasks the expected result should be following: 
Hint: try first understand the code that is in repository. Implementation of the tasks below will be very similar to these things that are already implemented.


## Local Environment setup
 - install JDK 8 
 - prepare some IDE (IntelliJ preferred, Eclipse or any other IDE/text editor fine)


## How to run application locally
 - run main from class pl.phronimos.internship.postPage.InternshipPostPageApplication
 - or being at project root directory run in console:
   ```mvn spring-boot:run```
	(local [Maven installation](https://maven.apache.org/install.html) is required)
 

## Useful links
If you are new to technologies in this project, you'll find basic introduction under following links:
 - https://spring.io/guides/gs/spring-boot/
 - https://spring.io/guides/gs/serving-web-content/
 - https://spring.io/guides/gs/accessing-data-jpa/
 - https://vladmihalcea.com/the-best-way-to-map-a-onetomany-association-with-jpa-and-hibernate/

## Tasks

### Clapping endpoint (Spring MVC) 
 - The goal is to have clapping functionality like at medium.com blogpost (e.g. [here](https://medium.com/@arjunsk/getting-started-with-spring-boot-edb448d32a26) )
 Each user can click on clapping hands as many times he wants. Many claps means he likes article much.
 - In this task you need to create and endpoint that will serve for serving Post or Get request (you choose) to increment number of claps per post
   - Endpoint name is arbitrary (choose it yourself)
   - Endpoint needs to be given 'postId'
   - Find in code where number of claps are stored and on each call of endpoint increment the number
   - Call to the endpoint, after successful increment should redirect to main page 



### Adding clapping icon clicking on UI (Html, Thymeleaf) - dependent on previous task
 - The clicking on clapping icon should execute a http call on endpoint that is to be created in previous task.
 - You can do this in two possible ways:
   1. clapping icon can be de facto submit button of <form>
	 2. clicking action of clapping icon can be defined in JavaScript	
 - After clicking the number by the icon should update (either by whole page reload or by Java Script DOM modification)



### Number of Claps stored in PostEntity (Thymeleaf)
 - number of claps for each post are currently stored in clapsMap in MainViewController class
 - change code to store number of claps in PostEntity
(mind that if you complete this task database scripts will need to be updated - see last task)

### Posts served from db (Spring JPA)
 - currently Posts are served to frontend from preinitialized ArrayList in PostService. We would like to serve them from Database - like Comments are
 - There H2 in memory database configured in this project with two sql scripts that populates it during application startup: schema.sql and data.sql
 - Modify PostEntity class adding proper Spring JPA (Hibernate) annotation on its fields
 - Make comments list in PostEntity to be initialized by Spring JPA when the post object is obtained from database. Mind that this is 1:n relation - use annotations in proper way 
 - Hint: create PostRepository, similarly to CommentRepository


