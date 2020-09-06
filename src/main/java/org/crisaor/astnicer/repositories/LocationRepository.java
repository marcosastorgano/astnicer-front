/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.crisaor.astnicer.repositories;

import org.crisaor.astnicer.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author crisaor
 */
public interface LocationRepository extends JpaRepository<Location,Long>{
    
}
