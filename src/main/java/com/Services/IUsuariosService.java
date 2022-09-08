package com.Services;

import java.util.List;
import com.TO.Usuarios;

public interface IUsuariosService {
    public Usuarios guardar(Usuarios usuario);

    public void eliminar(int idusuarios);

    public List<Usuarios> listausuarios();

    public Usuarios buscarUsuario(int idusuarios);
}
