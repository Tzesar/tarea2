/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.progweb.tarea2;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author augusto
 */
public class BackEndApplication extends Application{
    private Set<Object> singletons = new HashSet();
    private Set<Class<?>> empty = new HashSet();

    public BackEndApplication() {
        // ADD YOUR RESTFUL RESOURCES HERE
        this.singletons.add(new BackEnd());
    }

    public Set<Class<?>> getClasses()
    {
        return this.empty;
    }

    public Set<Object> getSingletons()
    {
        return this.singletons;
    }
}
