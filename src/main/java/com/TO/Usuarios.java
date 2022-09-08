package com.TO;

import java.io.Serializable;
import javax.persistence.*;

import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "usuarios")
public class Usuarios implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuarios;
    private String usuario;
    private String clave;
    private String rol;
    private int idPersonas;

}
