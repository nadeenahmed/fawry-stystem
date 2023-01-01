# fawry-stystem
(i) import as a maven project, run the project
(ii) the project depends on Java 17
(iii)
The user should be able to sign up to the system.

1- POST/User/signup
A service to sign up the user. This service returns the process succeeded or not
Input: username, email, password, id

example: {
 "userName":"Nadeen",
    "email":"Nadeen@gmail.com",
    "password":"123",
    "id":1
}

The user should be able to log in to the system.

2- POST/User/login
A service to sign up the user. This service returns the process succeeded or not
Input: username, email, password, id

example: {
 "userName":"Nadeen",
    "email":"Nadeen@gmail.com",
    "password":"123",
    "id":1
}

The user should be able to search for any service in the system.

3- GET/provider/search/{provider}
A service to search if a service exists. This service returns the service name if it exists.
Input: service name

example:  GET/provider/search/MobileWe

The user can pay for any service in the system.

4- POST/handle
A service to handle a payment. This service returns the process succeeded or not and transaction id
Input: mobile number, amount, service provider name, transaction id , payment method

example: {
 "MobileNumber":1501215412,
"amount":200,
"sp":"MobileWe",
"id":"MobileWe1",
"method":"Credit"
}

The user can ask for a refund for any complete transaction to any given service.

5- POST/User/request
A service to request a refund. This service returns the process succeeded or not 
Input: transaction id

example: POST/User/request?id=MobileWe1

The user should be able to add any funds to the wallet.

6- POST/addFund
A service to add funds to the wallet. This service returns the current balance
Input: fund amount

example: POST/addFund?amount=50

The user should be able to check any discount for any service in the system.

7-GET/discounts
A service to view all available discounts. This service returns the discounts
Input: no input

example: GET/discounts

The admin should be able to add discounts to the system.

8-POST/addDiscount
A service to add a new discount. This service returns the process succeeded or not 
Input: discount type, discount name, discount percent

example: {
    "type":"Overall",
    "discount":"50% OFF on first use",
    "percent":50
}

The admin should be able to list all user transactions.

9-GET/Admin/trans
A service to list all transactions. This service returns the transactions 
Input:no input

example: GET/Admin/trans

The admin should be able to list all refund requests.

10-GET/Admin/req
A service to list all refund requests. This service returns the refund requests 
Input:no input

example: GET/Admin/req

The admin should be able to accept any refund request

11-POST/Admin/accept
A service to accept a refund request. This service returns the process succeeded or not 
Input: transaction id

example: POST/Admin/accept?id=MobileWe1

The admin should be able to reject any refund request

12-POST/Admin/reject
A service to reject a refund request. This service returns the process succeeded or not 
Input: transaction id

example: POST/Admin/reject?id=MobileWe1

The admin should be able to sign up to the system.

13- POST/Admin/signup
A service to sign up the admin. This service returns Added successfully if the admin didn’t exist before, if the admin exists it asks the admin to log in.
Input: admin name, email, password, id

example: {
    "adminName":"Toka",
    "email":"Toka@gmail.com",
    "password":"123",
    "id":1
}

The admin should be able to log in to the system.

14- POST/Admin/login
A service to sign up the admin. This service returns logged in successfully if the admin existed before, if the admin didn’t exist it asks the admin to sign up first.
Input: admin name, email, password, id

example:{
    "adminName":"Mai",
    "email":"Mai@gmail.com",
    "password":"123",
    "id":2
}

The admin should be able to view a user by email

15-GET/User/{email}
A service to view user by email. This service returns the user info
Input:no input

example: GET/User/Nadeen@gmail.com

The admin should be able to view an admin by email

16-GET/Admin/{email}
A service to view admin by email. This service returns the admin info
Input:no input

example: GET/Admin/Toka@gmail.com

The user should be able to check the status of his refund request

17-POST/User/check
A service to check if a refund request is approved or rejected . This service returns request status.
Input: transaction id

example: POST/User/check?id=MobileWe1
