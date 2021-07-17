package br.com.confidencecambio.javabasico.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.confidencecambio.javabasico.service.CalcularImcService;

@RestController
@RequestMapping("/calcularImc")
public class CalcularImcController {

    @Autowired
    private CalcularImcService calcularImcService;

    @GetMapping
    public ResponseEntity<String> calcularImc(float peso, float altura) {
	float imc = calcularImcService.calcularImc(peso, altura);
	if (imc == 0) {
	    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao calcular o IMC, verifique os valores!");
	}
	
	return ResponseEntity.status(HttpStatus.OK).body("Valor do IMC: " + imc);
    }

}
