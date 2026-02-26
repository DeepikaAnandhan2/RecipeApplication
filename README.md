# Recipe Data Collection and API Development

## Task Overview

### 1. Parse the JSON Data

The first step is to implement a script or module to read and parse the provided JSON file containing the recipe data.

### 2. Store Data in a Database

Designed a database table to store the parsed recipe data. The design accommodates the structure of the JSON data, including nested nutrients information.

### 3. API Development

Developed a RESTful API to manage the recipe data, including endpoints for creating and querying recipes.

---

## Overview of the Work

I used MySQL for the database, where I created a database schema. I used the Spring Boot framework for ease of implementation. Spring Data JPA automatically handles mapping Java objects into SQL table fields.

For API development, I used RESTful principles to build standard and scalable CRUD operations.

---

## Implemented Endpoints

### Create New Recipe
POST /api/recipes

### Retrieve Top Rated Recipes
GET /api/top?limit=2
