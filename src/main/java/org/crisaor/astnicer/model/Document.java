/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.crisaor.astnicer.model;

import java.sql.Blob;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Lob;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

/**
 *
 * @author crisaor
 */
@MappedSuperclass
public abstract class Document extends Item {

    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] file;
}
