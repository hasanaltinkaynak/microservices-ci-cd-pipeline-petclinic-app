# build-dev-docker-images
./mvnw clean package
docker build --force-rm -t "petclinic-admin-server:dev" ./spring-petclinic-admin-server
docker build --force-rm -t "petclinic-api-gateway:dev" ./spring-petclinic-api-gateway
docker build --force-rm -t "petclinic-config-server:dev" ./spring-petclinic-config-server
docker build --force-rm -t "petclinic-customer-service:dev" ./spring-petclinic-customer-service
docker build --force-rm -t "petclinic-discover-server:dev" ./spring-petclinic-discover-server
docker build --force-rm -t "petclinic-hystrix-dashboard:dev" ./spring-petclinic-hystrix-dashboard
docker build --force-rm -t "petclinic-velt-service:dev" ./spring-petclinic-velt-service
docker build --force-rm -t "petclinic-visits-service:dev" ./spring-petclinic-visits-service
docker build --force-rm -t "petclinic-prometheus-server:dev" ./docker/prometheus
docker build --force-rm -t "petclinic-grafana-server:dev" ./docker/grafana