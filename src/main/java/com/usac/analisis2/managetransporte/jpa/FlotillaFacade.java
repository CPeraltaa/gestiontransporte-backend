/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usac.analisis2.managetransporte.jpa;

import com.usac.analisis2.managetransporte.model.Flotilla;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author carlospecam
 */
@Stateless
public class FlotillaFacade extends AbstractFacade<Flotilla> {

    @PersistenceContext(unitName = "my_persistence_unit")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FlotillaFacade() {
        super(Flotilla.class);
    }
    
}
