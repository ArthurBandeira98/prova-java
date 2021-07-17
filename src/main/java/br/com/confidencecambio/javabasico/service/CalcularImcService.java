package br.com.confidencecambio.javabasico.service;

import org.springframework.stereotype.Service;

@Service
public class CalcularImcService {
    
    public float calcularImc(float peso, float altura) {
	
	if (peso == 0) {
	    return 0;
	}
	
	if (altura == 0) {
	    return 0;
	}
	//altura sendo sem virgula ou ponto
	float alturaCorreta = altura / 100; 
	float imc = peso / (alturaCorreta * alturaCorreta);
	return imc;
    }

}
