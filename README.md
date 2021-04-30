# Open Weather Map API Testing Framework

As a group we were tasked with developing a framework for testing the [Open Weather API](https://openweathermap.org/api). We had 3 days to plan out, develop and present our framework, which included using DTOs, JUnit and Jackson.

## Sprint 0
### Group Members

- Abdul Makba (Scrum Master)
- Aaron Banjoko
- Alasdair Malcolm
- Bradley Williams
- Joel Fright
- Manit Shah
- Patrick Walsh
- Wahdel Woodhouse

# Tools
JDK 11
Maven
Intellij
Jackson 2
Git

# Definition of Done
...
## Sprint 0
### Planning 

As we weren't given requirements for the project we had to develop our own user stories. We did this by analysing the websites Json data and figuring out requirements from there. By creating user stories this way we were then able to create epics from the stories that shared a similar requirement. Following this we analysed our created user stories to define which stories were relevant to the project and which were out of scope. 

### Execution 

We focused next on setting up the project. This included initializing the project in the Github repo. We then set up the dependencies that we would need for the project such as JUnit and Jackson. 
To access the data on the website correctly we also needed an Api key. We signed up to the website and obtained this and used Postman to test our data results.

### Review

At the end of the sprint we used planning poker to define how difficult we thought each story would be as this woule make it much easier to focus on the roles during the next sprint. We voted on the difficulty of each user story which also helped us to define them better, and made sure everyone was on the same page before we finished for the sprint.


## Sprint 1

### Planning 

To start the sprint we looked at our user stories and assigned each member a role. We then worked on interfaces to better understand and structure how we would approach making the framework. From looking at the api request tyoes we understood that we would need 3 different DTO's for the project to handle single city locations, recuangular city locations and circle city locations. 
We analysed the responses for each api request type to see whether they have any differences in their responses. An example of such differences being having different names for their variables and case sensitivity.

### Execution



### Review


Setting up the dtos - One for each of the different api request types
Setting up the interfaces
creating the framework 
Working through user stories
Integrating Json properties
