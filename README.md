# Springboot-login-CRUD-JWT
## Spring-Boot-Security-CURD-JWT-MySQL ## This is a simple App with the user login/signup and logout functions, the App is built with the Sprint Boot implementing Spring Security, CURD operations, MySQL database and JWT

## 1. You can clone it from github by running following command
```
https://github.com/ScarlettZ842/Spring-Boot-Security-CURD-JWT-MySQL.git
```
## 2. Create the MySQL Database and change the root username & password accordingly.
## 3. Run the App as a Spring boot project.
```
create database assignment_sprinboot
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

#### Creating a new user using POST method

```
http://localhost:8080/api/users
```
![image](https://github.com/hsam-2021/Springboot-login-CRUD-JWT/assets/94940146/4b8f5ba9-e137-4f39-aa63-09719189ebac)

#### Getting all users using GET
```
http://localhost:8080/api/users
```
![image](https://github.com/hsam-2021/Springboot-login-CRUD-JWT/assets/94940146/990a9efe-a885-46ed-a9a5-8a30c68b3b53)

#### Getting user by ID
```
http://localhost:8080/api/users/{id}
```
![image](https://github.com/hsam-2021/Springboot-login-CRUD-JWT/assets/94940146/01480f6d-276d-49f3-9a78-3854241c74ed)

#### Updating user by ID
```
http://localhost:8080/api/users/{id}
```
![image](https://github.com/hsam-2021/Springboot-login-CRUD-JWT/assets/94940146/ff70945e-b14e-41ce-b0ac-9e6c2b93aa08)

#### 7. To delete the existing user with DELETE Request
```
http://localhost:8080/api/test/user/<id>
```
![image](https://github.com/hsam-2021/Springboot-login-CRUD-JWT/assets/94940146/3e31f778-3225-42dc-a5a3-78df8940325a)
