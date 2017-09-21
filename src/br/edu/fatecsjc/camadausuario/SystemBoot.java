package br.edu.fatecsjc.camadausuario;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.fatecsjc.systemcall.InterpretadorDeComando;

public class SystemBoot {

	public static void main(String[] args) {
		System.out.println("	BEM VINDO AO SIMULADOR DE S.O. DO PROFESSOR SABHA");
		System.out.println("		ABAIXO TEM UM F16 - FALCON");
		System.out.println("	      | ");
		System.out.println("	   --=O=-- ");
		System.out.println("");
		System.out.println("Criando uma pasta chamada S.O. DO PROFESSOR SABHA");
		InterpretadorDeComando.executarComando("criar-diretorio", "S.O. DO PROFESSOR SABHA");
		System.out.println("Pronto!");
		commandList();
	}
	
	public static void commandList() {
		System.out.println("");
		System.out.println("Digite os comandos abaixo:\ncriar-arquivo <nome do arquivo>: cria um arquivo");
		System.out.println("criar-diretorio <nome do diretorio>: para criar um arquivo.");
		esperarComando();
	}
	
	public static void esperarComando() {
		do {
			String comando = InterpretadorDeComando.esperarComando();
			if(comando.equals("sair")) {
				System.out.println("Adeus!");
				break;
			}
			List<String> parametros = new ArrayList<>();
			String[] dummy = comando.split(" ");
			if(comando.indexOf(" ") > 0) {
				int count = 0;
				for (String string : dummy) {
					if(count++ == 0) {
						comando = string;
						continue;
					}
					parametros.add(string);		
				}
			}
			InterpretadorDeComando.executarComando(comando, parametros.toArray(dummy));
		} while(true);
	}
 
}
