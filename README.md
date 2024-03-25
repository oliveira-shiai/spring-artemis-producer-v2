# Sample Java Application

## Overview

This is a sample Java application that demonstrates a basic configuration using Spring and Red Hat AMQ Broker Artemis. Includes instructions on how to start the application, connect to the AMQ broker instance, and send messages to the "Insert.Addr" and "Insert.Card" queues.

## Getting Started

To run the application, use the following command:

```bash
java -jar spring-artemis-producer-0.0.1-SNAPSHOT.jar
```

## Queue Listener

After starting the application, it waits for the first request to start communication and send the message to the "Insert.Card" and "Insert.Addr" queue.


```bash
curl -X POST http://your.router.com/insertcard  -H 'Content-Type: application/json' -d \
'{
  "ORG": "330",  
  "NAME": "Joel Oliveira",
  "CPF": "22233355566",
  "country": "Brasil",
  "State": "Sao Paulo",
  "City": "Sao Paulo",
  "Card_Type": "credit",
  "Card_Number": "3333 4444 5555 6666 7777"
}'
```

```bash
curl -X POST http://your.router.com/insertaddr  -H 'Content-Type: application/json' -d \
'{
  "NAME": "Pedro Neto",
  "CPF": "45865254852",
  "State": "Sao Paulo",
  "City": "Sao Paulo",
}'

```


## [Properties Configuration](https://github.com/oliveira-shiai/spring-artemis-producer-v2/blob/master/src/main/resources/application.properties)

```properties
server.port=8080
spring.artemis.broker-url=tcp://broker-artemis-0-svc.message.svc.cluster.local:61616
spring.artemis.user=app-producer
spring.artemis.password=app
```

Feel free to explore and modify the application as needed for your use case.

Happy coding!
