package org.syncastra.ejemplospring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/chung")
public class ChungController {


    @GetMapping("/saludo")
    public String saludo() {
        return "Hola, soy Chung!";
    }

}
