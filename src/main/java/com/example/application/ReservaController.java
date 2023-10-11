package com.example.application;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/reservas")
public class ReservaController {

    @GetMapping("/nova")
    public String novaReserva(Model model) {
        // Lógica para preparar dados para a página de criação de reserva
        return "reserva/nova"; // Isso renderizará a página JSP "nova.jsp"
    }
}
