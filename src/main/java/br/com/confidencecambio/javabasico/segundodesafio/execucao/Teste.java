package br.com.confidencecambio.javabasico.segundodesafio.execucao;

import br.com.confidencecambio.javabasico.segundodesafio.model.Cliente;

public class Teste {

    public static void main(String[] args) {

	Cliente cliente = new Cliente();
	
	//nome sem espaços e com letras maiusculas
	System.out.println(cliente.getNome());
	
	//retorna primeiro nome
	System.out.println(cliente.primeiroNome());
	
	//retorna ultimo nome
	System.out.println(cliente.ultimoNome());
	
	System.out.println(cliente.nomeAbreviado());
	

    }

}
