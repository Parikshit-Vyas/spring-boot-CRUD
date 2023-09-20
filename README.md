# spring-boot-CRUD



### API Layer (GET, PUT , POST , DELETE requests using functions of service layer .. this layer is in contact with user)
### ^
### |
### Service Layer (Recieve / sends data to DAO layer and modifies data in between)
### ^
### |
### Database Access Layer (DAO interface and its implementing class to carry out crud operation to data.)
### ^
### |
### Database (Redis/mongodb etc)
