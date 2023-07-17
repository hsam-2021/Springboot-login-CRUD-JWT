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
## Some Screenshots of the application 
### registration page
![image](https://github.com/hsam-2021/Springboot-login-CRUD-JWT/assets/94940146/7824d4ed-0f5f-4463-b4f3-7d4807e453b7)
### login page after registration
![image](https://github.com/hsam-2021/Springboot-login-CRUD-JWT/assets/94940146/732163c7-48a5-4e45-a285-933e535be613)
### Landing page after logging in
![image](https://github.com/hsam-2021/Springboot-login-CRUD-JWT/assets/94940146/71e5c9ce-604a-4f78-bda5-4ec89fa4f85d)

## Once the Application started successfully then you can test the functions or call endpoints
## 5. Some endpoint URLs for CRUD operations:

#### Getting all users
```
http://localhost:8080/api/users
```
#### Getting user by ID
```
http://localhost:8080/api/users/{id}
```
#### Updating user by ID
```
http://localhost:8080/api/users/{id}
```
#### 7. To delete the existing user with DELETE Request
```
http://localhost:8080/api/test/user/<id>
```
