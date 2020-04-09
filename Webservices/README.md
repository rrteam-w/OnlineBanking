** Prerequisites to develop the JAX-WS and JAX-RS webservices in your local system.
1. Basic knowledge on java, servlets and jsp.
2. The following softwares need to be ready in your local system.
2.1. Java - Download URL - https://www.filehorse.com/download-java-development-kit-32/19235/
2.2. Eclipse IDE - Download URL - https://www.eclipse.org/downloads/packages/release/helios/sr2/eclipse-ide-java-ee-developers
2.3. Tomcat server - Download URL - https://tomcat.apache.org/download-70.cgi

# JAXRSHelloWorld
This is very basic example to display Hello World plain text in web browser. This is the url to download the Jersey JAR files
URL: https://www.javatpoint.com/jax-rs-file-download-example.
Place jar files in WEB-INF/lib folder or else create your own custom library in build path and add it to project.

Note: Sometimes you may see ClassNotFoundException: org.glassfish.jersey.servlet.ServletContainer in the server console.
Even though if you add the jar's, you will see above exception, In this case goto properties and find the Deployment Assembly and add the WEB-INF/lib folder If you paste the jar files here or If you place the jar's in custom library then add it here.

# JAXRSAnnotations
The following are the URL's to access the GET request's.
** Pathparam - http://localhost:8080/JAXRSAnnotations/rest/input/10/10
** Queryparam - http://localhost:8080/JAXRSAnnotations/rest/input?num1=10&num2=10
** Matrixparam - http://localhost:8080/JAXRSAnnotations/rest/input;num1=10;num2=10

# JAXBAnnotations
Performing marshalling and un-marshalling by using JAX-B and Jackson.

# JerseyClient
In this example, Written Jersey client program to call webservice methods Instaed of accessing through web browser and postman.

