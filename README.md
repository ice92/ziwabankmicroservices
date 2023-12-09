# ziwabank
 bank related microservices

# bank statement request
 API to receive request
 Action POST
 link: http://localhost:8080/api/bankstatementreq
 payload: JSON payload containing startDate, endDate, and emailAddress.
 Example: 
 {
  "startDate": "2023-01-01",
  "endDate": "2023-12-31",
  "emailAddress": "user@example.com"
 }
