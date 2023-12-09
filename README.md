# ziwabank
 bank related microservices

# bank statement request
 API to receive request of bank statement from client
 Functionality:
 Validation input
 Action POST
 link: http://localhost:8080/api/bankstatementreq
 payload: JSON payload containing startDate, endDate, and emailAddress.
 Example: 
 {
  "startDate": "2023-01-01",
  "endDate": "2023-12-31",
  "emailAddress": "user@example.com"
 }

 # DB microservice
 API to receive request of bank statement from client
 Funtionality:
 Database connection
 Fetch requested bank statement according to startDate, endDate, and emailAddress

