package com.TO;

import java.io.Serializable;
import javax.persistence.*;

import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "facturas")
public class Facturas implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFacturas;
    private String codigoFactura;
    private String tipoVehiculo;
    private String placa;
    private String tipoContrato;
    private String fechaEntrada;
    private String fechaSalida;
    private int idPersonas;
    private double valor;
    private String fecaFactura;
    private int idPlaza;

}
