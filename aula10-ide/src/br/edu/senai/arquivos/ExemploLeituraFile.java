package br.edu.senai.arquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExemploLeituraFile {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File("C:/exemplos/leitura.txt"));
			while (sc.hasNext()) {
				System.out.println(sc.next());
			}
			sc.close();

		} catch (FileNotFoundException e) {
			System.out.println("Erro ! Caminho do arquivo inv�lido");
		}
	}
}