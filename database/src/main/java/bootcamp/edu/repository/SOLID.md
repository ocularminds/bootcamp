SOLID
- Single Respopnsible
- Open for extension
- Dependency Injection

Loose coupling

API - Application Programming Interface
SOAP - Simple Object Access Protocol -> Web Service -> WSDL -> XML
REST - Respresentational State Transfer -> Restful Services -> JSON -> JavaScript Object Notation
      CRUDE -> POST, PUT, GET, DELETE, HEAD
MQ -> Message Queue -> subscribe ,create a queue/topic

Backend Structure
- Configuration [database connection, email, etc]
- Repository {interface to backeend dependencies: daatabase, email server, mq server, file system}
- Services {coordinated data that needs to be sent to or from backend servers}
- Controllers {is reponsible for data collection from frontend and pass to service to and fro}