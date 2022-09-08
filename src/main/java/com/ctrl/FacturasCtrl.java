package com.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.Services.FacturaService;

@Controller
public class FacturasCtrl {

    @Autowired
    private FacturaService facturaService;

    @GetMapping("/facturas")
    public String inicio(Model model) {
        model.addAttribute("titulo", "Facturas");
        var facturas = facturaService.listaFacturas();
        model.addAttribute("facturas", facturas);
        return "Facturas";
    }

}
