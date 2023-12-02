package com.example.parcial3.Controllers;

 import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.parcial3.Entities.Titulos;
import com.example.parcial3.Services.ParcialDB;

@RestController

public class TitulosController {
    @GetMapping("/titulos")
    public List<Titulos> TodosLosTitulos(){
        return new ParcialDB().obtenerTodosLosTitulos(); 
    }
    
}
