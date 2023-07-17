# Springboot-login-CRUD-JWT
## Spring-Boot-Security-CURD-JWT-MySQL ## This is a simple App with the user login/signup and logout functions, the App is built with the Sprint Boot implementing Spring Security, CURD operations, MySQL database and JWT

## 1. You can clone it from github by running following command
```
https://github.com/ScarlettZ842/Spring-Boot-Security-CURD-JWT-MySQL.git
```
## 2. Create the MySQL Database and change the root username & password accordingly.
## 3. Run the App as a Spring boot project.
```
create database assignment_spring
```
open src/main/resources/application.properties file to change the username and password
## Once the Application started successfully then you can test the functions or call endpoints

## 5. For users to signup or login(create new users) or signout with POST Request
```
http://localhost:8080/signup
```
```
http://localhost:8080/signin
```
```
http://localhost:8080/signout
```
## 6. To get the public resource without user login with GET Request
```
http://localhost:8080/api/test/user
```
## 7. To delete the existed user with DELETE Request
```
http://localhost:8080/api/test/user/<id>
