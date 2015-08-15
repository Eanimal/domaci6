
package com.mycompany.it.sestidomaci.pages;

import com.mycompany.it.sestidomaci.entities.Soba;
import java.util.ArrayList;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.hibernate.annotations.CommitAfter;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.hibernate.Session;


public class DodavanjeSobe {
    
    @Property
    private Soba soba;
    
    @Inject
    private Session session;
    
    @Property
    private ArrayList<Soba> listaSoba;
    
    void onActivate(){
        if(listaSoba==null)
            listaSoba = new ArrayList<Soba>();
        listaSoba = (ArrayList<Soba>) session.createCriteria(Soba.class).list();
    }
    
    @CommitAfter
    Object onSuccess(){
        session.merge(soba);
        return this;
    }
    
}
