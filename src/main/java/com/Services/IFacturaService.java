package com.Services;

import java.util.List;
import com.TO.Facturas;

public interface IFacturaService {
    public Facturas guardar(Facturas factura);

    public void eliminar(int idfacturas);

    public List<Facturas> listaFacturas();

    public Facturas buscarFactura(int idfacturas);
}
