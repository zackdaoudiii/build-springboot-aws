dir of ms_admin project : cd workspace/ms_admin
 
build jar file : mvn -Dmaven.test.skip=true clean install

kill running microservice :  sudo pkill -f ms_admin

 start the microservice : sudo bash ~/scripts/admin_start.sh


###########
content of script " admin_start.sh " to start admin microservice

java -Xmx256m -Dspring.profiles.active=aws -Deureka_ip=10.0.0.127 -jar /home/ubuntu/workspace/ms_admin/target/ms_admin-0.0.1-SNAPSHOT.jar > /home/ubuntu/logs/ms_admin.log &
