# Sudoku app backend
---
## 1. Introduction

This is a backend application for a Sudoku game. It uses Spring Boot framework and Java programming language to create RESTful APIs that can authenticate users, generate access tokens, output boards from internal database, add new sudoku solving records, output top 10 record. 

Backend URL: https://sudoku-be.herokuapp.com/ 

Frontend URL: https://sudoku-dede-mi.netlify.app/

### Postman Documentation

url: https://documenter.getpostman.com/view/27348680/2s93sZ5Ysi

### Local installation

- Clone the project repository using the following command: \
`git clone https://github.com/kenanjahicc/sudoku-be.git` 

- Navigate to the project directory and run the following command to build the project: \
`mvn clean install` 

- Run the following command to start the application: \
`mvn spring-boot:run` 

- The application will start on port 8080 by default. You can change the port number in the application.properties file.

## 2. Features

- Authentification
- Returning random board from database
- Adding sudoku board record
- Returning top 10 records for that board

## 4. Technical requirements

The sudoku-be is built using the following technologies: Java, Spring, PostgreSQL

The app Backend is hosted on a Heroku cloud server.
