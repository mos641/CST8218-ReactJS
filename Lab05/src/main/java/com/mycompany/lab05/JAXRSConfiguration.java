package com.mycompany.lab05;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * Configures JAX-RS for the application.
 * @author Juneau
 */
@ApplicationPath("api")
public class JAXRSConfiguration extends Application {
    // http://ServerIP:8080/ProjectName/ApplicationPath/Resource
    // http://localhost:8080/Lab03/resources/javaee8
    // http://localhost:8080/Lab03/resources/com.mycompany.lab03.contact
    // http://localhost:8080/Lab03/resources/com.mycompany.lab03.contact/id
}
