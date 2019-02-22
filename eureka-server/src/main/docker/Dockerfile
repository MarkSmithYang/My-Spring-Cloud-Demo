#构建镜像的Dockerfile文件
FROM 192.168.2.51:5000/my-springcloud-demo/eureka-server:1.0.0
ENV file=eureka-server:1.0.0.jar
ENV runEnv=dev
ENV host=localhost
ENV port=8771
ENV bind=0.0.0.0
ENV eureka=localhost:8771
MAINTAINER yangbiao
WORKDIR /opt
ADD ${file} .
CMD java -jar ./${file} --spring.profiles.active=${runEnv} --eureka.instance.hostname=${host} --server.port=${port} \
--server.address=${bind} --eureka.client.serviceUrl.defaultZone=http://${eureka}/eureka/