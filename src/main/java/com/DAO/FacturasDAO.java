package com.DAO;

import org.springframework.data.repository.CrudRepository;
import com.TO.Facturas;

public interface FacturasDAO extends CrudRepository<Facturas, Long> {

}
