## Project Title

Flag Picker 
    Displays flags of selected countries of a particular continent picked.

## Getting Started

Used springboot framework concepts, Postgres Sql as database and jpa repository for database connectivity for developing flag picker maven based java application. Used springboot starter test for writing tests. Included logging and health metrics of application.

### Prerequisites

Install any IDE(Say, Eclipse) for developing the application and run it. 
Install database for data storage. For example, used Postgres Sql database in this application. Database configuration settings are included in application.properties to connect db and perform operations on it.

### Installing

Include all the dependencies which are required for the maven java application in pom.xml. Because of springboot nature, all the modules are downloaded into the project. Import the file picker application whose dependencies are already included in the pom.xml file.

Install the Postgres Sql database and configure it. 

Database configuration details are included in application.properties file. Modify it with database configuration properties of your databse environment before running the application. 

Please find the screenshot attached "db_configuration.png" for database configuration details which is in application.properties file.

### Break down into end to end tests

Tests:
1. When continet is provided in the uri , all continents in the database are returned.
2. When a particular continent name is provided, all countries belongs to that continent are returned in response.
3. On sending Country name in the client request, the REST service returns the flag of that particular country in response.

```
Example:
1. If a client request is http://localhost:8080/ , all continents and their respective countries are sent in response.
   Example: When above url is provided in browser client or postman after running the filepicker application, continents Africa and America are seen which their respective countries Nigeria,Egypt under Africa and Mexico,USA under America continents. 

2. If a request url includes http://localhost:8080/Africa, it's countries Nigeria and Egypt are sent in response.

3. On selecting the country which displayed, it's shows up the flags of those particular countries.
```
### And coding style tests

We have included springboot starter test module in pom.xml as dependency to test the application.

Application is developed following naming conventions, MVC architecture, model, controller, service, dto, entity , jpa repository concepts using Delegation design pattern.

Schema of the database is included in data.sql file which is in data.sql file.
Find the screenshots db_schema.png for the static sample data into MySQL database.

Bonus points like creating schema for MySQL database is implemented in the application, logging enhancement to service, a health check metric are also developed in this application.

Junit tests are included to test the services.


## Deployment
Modify database configuration file to point the database exisitng in your environment. Say, modify datasourceurl

Springboot has tomcat server embedded in it. So, running as a basic java application makes the application to get deployed in the server in default port. 

Then the rest services are used to retrieve the data.


## Built With

* [Springboot](https://start.spring.io/) - The web framework used
* [Maven](https://maven.apache.org/) - Dependency Management

## Authors

* **Spandana Kalluri** - *Flag Picker* - [Spandana55](https://github.com/Spandana55/flag-picker)

]]
