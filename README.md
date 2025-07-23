# Barcode Payment API

A simple Spring Boot project that simulates barcode-based payment processing.

## Features
- Accepts POST requests to simulate barcode payments.
- Returns confirmation string with barcode.

## Technologies Used
- Java 17
- Spring Boot
- REST API

## Running the Project
```bash
./mvnw spring-boot:run
```

## Sample Request
POST http://localhost:8080/api/payment/barcode

```json
{
  "barcode": "123456789",
  "amount": 250.00
}
```

## Sample Response
```
Processed payment for barcode: 123456789
```