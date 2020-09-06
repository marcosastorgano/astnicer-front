/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.crisaor.astnicer.model;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import org.crisaor.astnicer.utils.CtesEnum;

/**
 *
 * @author crisaor
 */
@MappedSuperclass
public abstract class Property extends Item {
    
    @Column(nullable=true)
    private BigDecimal price;
    
    
    @Enumerated(EnumType.STRING)
    @Column(nullable=true)
    private CtesEnum.Value val;
}
