#Recipe Data Collection and API Development

#Task Overview

##1.Parse the JSON Data

The first step is to implement a script or module to read and parse the provided JSON file
containing the recipe data.


##2.Store Data in a Database

Designed a database table to store the parsed recipe data. The design should accommodate the
structure of the JSON data, including nested nutrients information.


##3. API Development

Developed a RESTful API to manage the recipe data, including endpoints for creating and
querying recipes.


#Overview of the work

I used MySQL for the DataBase, where I created a Database schema and used springboot framework for ease of implementation i.e., like Spring Data JPA(automatically handles Java obj into SQL fields).

When it comes to API Development. I used RESTful Application for standard and scalable CRUD Operations.

Developed a RESTful API using Spring Boot to manage recipe data.

#Implemented endpoints for:

Create new recipes -> (POST /api/recipes)

Retrieve the highest rating Recipes depends on the limit(limit-user input) -> (GET /api/top?limit=2)
