package br.edu.fatecsjc.systemcall;

import br.edu.fatecsjc.kernell.KernellRunner;

public class InterpretadorDeComando {
	public static void executarComando(String comando, String ... parametros) {
		if(comando.equals(""))
			return;
		if(comando.startsWith("criar-arquivo")) {
			if(parametros.length == 0) {
				System.out.println("[ERRO] � necess�rio especificar o nome do arquivo a ser criado.");
				return;
			}
			KernellRunner.criarArquivo(parametros[0]);
			return;
		}
		if(comando.startsWith("criar-diretorio")) {
			if(parametros.length == 0) {
				System.out.println("[ERRO] � necess�rio especificar o nome do diretorio a ser criado.");
				return;
			}
			KernellRunner.criardiretorio(parametros[0]);
			return;
		}
		
		//deixar sempre por �ltimo:
		System.out.println("Comando " + comando + " n�o existe nesta vers�o do S.O. do Professor Sabha.");
	}
	
	public static String esperarComando() {
		return KernellRunner.escanearDadosDePeriferico();
	}
}
