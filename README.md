# 🐇 RabbitMQ – Spring Boot Producer & Consumer Example

Bu proje, **Spring Boot + RabbitMQ** kullanarak iki ayrı uygulama arasında
(**producer** ve **consumer**) asenkron mesajlaşmayı göstermek amacıyla hazırlanmıştır.

RabbitMQ, **Docker** üzerinde çalıştırılmaktadır ve Management UI üzerinden
mesajlaşma kolayca gözlemlenebilir.

Docker kurulu bir host üzerinde aşağıdaki terminal komutlarını kullanarak, rabbitmq arayüzü ayağa kaldırılabilir. 
docker pull rabbitmq:3-management 
docker run -d --hostname babahost --name babroker -p 5672:5672 -p 15672:15672 rabbitmq:3-management 
http://localhost:15672/ 
username: guest pass: guest
