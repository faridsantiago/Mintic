package com.Services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.DAO.FacturasDAO;

import com.TO.Facturas;

@Service
public class FacturaService implements IFacturaService {

    @Autowired
    FacturasDAO facturasDAO;

    @Override
    @Transactional
    public Facturas guardar(Facturas factura) {
        return facturasDAO.save(factura);

    }

    @Override
    @Transactional
    public void eliminar(int idFacturas) {
        Long id = Long.valueOf(idFacturas);
        facturasDAO.deleteById(id);

    }

    @Override
    @Transactional(readOnly = true)
    public List<Facturas> listaFacturas() {
        return (List<Facturas>) facturasDAO.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Facturas buscarFactura(int idfacturas) {
        Long id = Long.valueOf(idfacturas);
        return facturasDAO.findById(id).orElse(null);
    }

}
