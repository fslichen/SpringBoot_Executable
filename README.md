# SpringBoot_Executable
Right click on your project and select run as maven build
The command should be clean package
Then go to your target folder and run the following command
java -jar SpringBoot-0.0.1-SNAPSHOT.jar

If you don't like application.properties, that's fine define another properties file like custom.properties under your class path and run the following command
java -jar SpringBoot-0.0.1-SNAPSHOT.jar --spring.config.name=custom
