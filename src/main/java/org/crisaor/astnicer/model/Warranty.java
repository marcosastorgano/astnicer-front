/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.crisaor.astnicer.model;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author crisaor
 */
@Entity
@Table(name="WARRANTY")
public class Warranty extends Document{
    
    
    Date initialDate;
    Date finalDate;
    
}
