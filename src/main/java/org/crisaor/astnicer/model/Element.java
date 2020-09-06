/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.crisaor.astnicer.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Objetos con cierta entidad
 *
 * @author crisaor
 */
@Entity
@Table(name = "ELEMENT")
public class Element extends Property {

    @OneToOne
    @JoinColumn(name = "bill_id",nullable = true)
    private Bill bill;
    
    @OneToOne
    @JoinColumn(name = "warranty_id",nullable = true)
    private Warranty warranty;

}
