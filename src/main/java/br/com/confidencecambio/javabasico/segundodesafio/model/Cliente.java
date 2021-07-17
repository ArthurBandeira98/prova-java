package br.com.confidencecambio.javabasico.segundodesafio.model;

import org.springframework.util.StringUtils;

public class Cliente {

    private String nome = " João Soares Silva ";

    public String getNome() {
	return validaNome(nome);
    }

    public String primeiroNome() {
	String[] lista = validaNome(nome).split(" ");
	return lista[0];
    }

    public String ultimoNome() {
	String[] lista = validaNome(nome).split(" ");
	String ultimoNome = lista[lista.length - 1];
	return ultimoNome;
    }

    public String nomeAbreviado() {
	String[] lista = validaNome(nome).split(" ");
	String nomeDoMeio = lista[lista.length - 2];
	String nomeNovo = nome;
	String abreviado = nomeDoMeio.substring(0, nomeDoMeio.length() - nomeDoMeio.length() + 1) + ".";

	nomeNovo = lista[0] + " " + abreviado + " " + lista[lista.length -1];

	return nomeNovo;
    }

    public String validaNome(String nome) {
	if (StringUtils.isEmpty(nome)) {
	    return "Erro, nome vazio";
	}
	String nomeNovo = tiraEspaco(nome);

	return nomeNovo;
    }

    public String tiraEspaco(String nome) {
	boolean inicio = nome.startsWith(" ");
	boolean fim = nome.endsWith(" ");
	String nomeNovo = nome;

	if (inicio) {
	    nomeNovo = nome.substring(1, nome.length());
	}

	if (fim) {
	    nomeNovo = nomeNovo.substring(0, nomeNovo.length() - 1);
	}

	return nomeNovo.toUpperCase();
    }

}
