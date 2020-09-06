/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.crisaor.astnicer.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import lombok.Data;
/**
 *
 * @author crisaor
 */
@Data
@MappedSuperclass
public abstract class Item implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    @Column(nullable=false, unique=true)
    private String name;
    
    private String description;
    
    @OneToOne
    @JoinColumn(name = "location_id")
    private Location location;
    
    @OneToOne
    @JoinColumn(name="qr_id", nullable = true)
    private QR qr;
    
}
