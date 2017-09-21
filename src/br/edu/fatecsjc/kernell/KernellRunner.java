package br.edu.fatecsjc.kernell;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class KernellRunner {
	public static void criarArquivo(String nomeArquivo) {
		File soF = new File(nomeArquivo);
		try {
			if(!soF.exists()) {
				soF.createNewFile();
				System.out.println("[Kernell] Arquivo " + nomeArquivo + " criado com sucesso.");
			} else {
				System.out.println("[Kernell] Arquivo " + nomeArquivo + " j� existe.");
			}
		} catch (IOException e) {
			System.out.println("[Kernell] Houve um problema o criar o arquivo " + nomeArquivo + ". Veja o log abaixo para saber mais:\n" + e.getMessage());
		}
	}
	
	public static void criardiretorio(String nomeDiretorio) {
		File soF = new File(nomeDiretorio);
		try {
			if(!soF.exists()) {
				soF.mkdir();
				System.out.println("[Kernell] Diret�rio " + nomeDiretorio + " criado com sucesso.");
			} else {
				System.out.println("[Kernell] Diret�rio " + nomeDiretorio + " j� existe.");
			}
		} catch (Exception e) {
			System.out.println("[Kernell] Houve um problema o criar o diret�rio " + nomeDiretorio + ". Veja o log abaixo para saber mais:\n" + e.getMessage());
		}
	}
	
	public static String escanearDadosDePeriferico() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}
}
