package com.Services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.DAO.UsuariosDAO;
import com.TO.Usuarios;

@Service
public class UsuariosService implements IUsuariosService {

    @Autowired
    UsuariosDAO usuariosDAO;

    @Override
    @Transactional
    public Usuarios guardar(Usuarios usuario) {
        return usuariosDAO.save(usuario);

    }

    @Override
    @Transactional
    public void eliminar(int idusuarios) {
        Long id = Long.valueOf(idusuarios);
        usuariosDAO.deleteById(id);

    }

    @Override
    @Transactional(readOnly = true)
    public List<Usuarios> listausuarios() {
        return (List<Usuarios>) usuariosDAO.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Usuarios buscarUsuario(int idusuarios) {
        Long id = Long.valueOf(idusuarios);
        return usuariosDAO.findById(id).orElse(null);
    }

}
