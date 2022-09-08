package com.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.Services.UsuariosService;
import com.TO.Usuarios;

@Controller
public class UsuariosCtrl {

    @Autowired
    private UsuariosService usuariosService;

    @GetMapping("/Usuarios")
    public String inicio(Model model) {
        model.addAttribute("titulo", "Usuarios");
        var usuarios = usuariosService.listausuarios();
        model.addAttribute("usuarios", usuarios);
        return "Usuarios";
    }

    @PostMapping("/usuarios/guardar")
    public ResponseEntity<Usuarios> guardar(@RequestBody Usuarios usuario) {
        Usuarios obj = usuariosService.guardar(usuario);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

}