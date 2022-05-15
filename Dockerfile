FROM java:8
EXPOSE 9093
ADD target/SupplierService.jar SupplierService.jar

ENTRYPOINT ["java", "-jar", "SupplierService.jar"]