FROM dragonwell-registry.cn-hangzhou.cr.aliyuncs.com/dragonwell/dragonwell:17
# RUN addgroup -S spring && adduser -S spring -G spring
# USER spring:spring
ADD ./target/accounts-services.jar accounts-services.jar
ENTRYPOINT ["java","-jar","/accounts-services.jar"]
