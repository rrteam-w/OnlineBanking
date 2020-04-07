# JAXRSHelloWorld
This is very basic example to display Hello World plain text in web browser. This is the url to download the Jersey JAR files
URL: https://www.javatpoint.com/jax-rs-file-download-example.
Place jar files in WEB-INF/lib folder or else create your own custom library in build path and add it to project.

Note: Sometimes you may see ClassNotFoundException: org.glassfish.jersey.servlet.ServletContainer in the server console.
Even though if you add the jar's, you will see above exception, In this case goto properties and find the Deployment Assembly and add the WEB-INF/lib folder If you paste the jar files here or If you place the jar's in custom library then add it here.

# JAXRSAnnotations
The following are the URL's to access the GET request's.
** Pathparam - http://localhost:8080/JAXRSAnnotations/rest/form/path/40/20
** Queryparam - http://localhost:8080/JAXRSAnnotations/rest/form/query?num1=20&num2=20
** Matrixparam - http://localhost:8080/JAXRSAnnotations/rest/form/matrix;num1=20;num2=20
