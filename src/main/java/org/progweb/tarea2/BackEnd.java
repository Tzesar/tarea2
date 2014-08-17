/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.progweb.tarea2;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author augusto
 */
@Path("tarea2")
public class BackEnd {

    @GET
    @Path("hello")
    @Produces("text/plain")
    public String hello(){
        return "Hello World";    
    }
    
    @GET
    @Path("echo/{message}")
    @Produces("text/plain")
    public String echo(@PathParam("message")String message){
        return message;    
    }
}
