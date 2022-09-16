package br.edu.senai.exemplos;

import java.util.Arrays;
import java.util.List;

public class Exemplo3Stream {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(10,20,30,40,50,60,70,80);
		
		numeros.stream().map(t->t+10).forEach(t->System.out.println(t));
		numeros.forEach(t->System.out.println(t));

	}

}
