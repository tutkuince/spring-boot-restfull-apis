REST stands for REpresentational State Transfer. It’s a set of guidelines application developers use to design APIs. 

There are four principles that APIs follow:

    1. Data and functionality in the API are considered “resources” and identified through something called the URI, or Uniform Resource Identifier. These are accessed by web links.
    2. Resources are manipulated using a fixed set of operations. GET retrieves a resource. POST creates one. Use PUT to update the resource, and of course, DELETE will remove it.
    3. Resources can be represented in multiple formats, such as HTML, XML, plain text, and other formats defined by a media type.
    4. Communication between the client and server (i.e. endpoint) is stateless. This means the server will not remember or store any state about the client that made the call.


    spring-boot-starter-web         - This starter pack is used for web application development and automatically adds libraries like Spring MVC, REST, Tomcat, and Jackson.
    com.h2database                  - This starter pack is used for the H2 in-memory database.
    spring-boot-starter-data-jpa    - This starter pack includes JDBC, Hibernate, Transactions API, JPA, and Aspects.

### Annotation	Description

##### @Entity
This marks a Java class as an entity, which means it will be persisted to the database. Typically, an entity maps to a database table and the table contains rows that represent that given entity.

##### @RestController
This marks a class as a REST API. 
@RestController is a convenience annotation that combines @Controller and @ResponseBody.

##### @GetMapping
This annotation handles HTTP GET requests and acts as a shortcut for @RequestMapping (method = RequestMethod.GET).