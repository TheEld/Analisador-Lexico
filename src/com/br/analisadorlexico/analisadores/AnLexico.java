package com.br.analisadorlexico.analisadores;

import java.util.ArrayList;
import java.util.List;

import com.br.analisadorlexico.componentes.*;

public class AnLexico {
	private List <String> tokensEncontrados = new ArrayList<String>();
	private TabSimbolos tabSimbolos = new TabSimbolos();
	private String palavraAtual="";
	
	public void nextToken(String simbolo){
		//checar se � um espa�o em branco
		if(checarTokenFinalizador(simbolo).equals("Espa�o!")){
			System.out.print("Terminador espa�o em branco encontrado. Analisar pr�ximo token");
			
			//Checar se a palavra atual n�o � vazia
			if(!palavraAtual.isEmpty()){
			tokensEncontrados.add(palavraAtual);
			palavraAtual = "";
			}
		}	
		
		else if(checarTokenFinalizador(simbolo).equals("Token ;")){
			//Checar se a palavra atual n�o � vazia
			if(!palavraAtual.isEmpty()){
				tokensEncontrados.add(palavraAtual);
				palavraAtual = "";
			}
			tokensEncontrados.add(";");			
		}
			
		else{
			palavraAtual +=simbolo;
		}
			
	}
	private String checarTokenFinalizador(String simbolo){
		if ((" ").equals(simbolo))
			return "Espa�o!";
		
		else if (";".equals(simbolo))
			return "Token ;";
		
		else
			return "Continue an�lise";
	}
	
	public List<String> getTokensEncontrados() {
		return tokensEncontrados;
	}
	public void setTokensEncontrados(List<String> tokensEncontrados) {
		this.tokensEncontrados = tokensEncontrados;
	}
	
	public boolean encontreToken(){
		boolean codigoValido = true;
		Token token = new Token();
		int validador = 0;
		
		for (String simbolo : tokensEncontrados){
			
			
				
			}
		
		return codigoValido;
	}
}
