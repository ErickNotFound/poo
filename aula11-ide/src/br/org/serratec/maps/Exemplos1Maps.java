package br.org.serratec.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class Exemplos1Maps {

	public static void main(String[] args) {
		LinkedHashMap<String,String> estados = new LinkedHashMap<>();
//		Map<String, String> estados = new HashMap<>();
//		TreeMap<String, String> estados = new TreeMap<>();
		estados.put("AC", "ACRE");
		estados.put("RJ", "RIO DE JANEIRO");
		estados.put("SP", "SÃO PAULO");
		estados.put("MG", "MINAS GERAIS");
		estados.put("SE", "SERGIPE");
		estados.put("SE", "SERGIPE");
		
		System.out.println("-----Retornar a chave do mapa-----\n");
		for (String string : estados.keySet()) {
			System.out.println(string);
		}
		
		System.out.println("\n-----Retorna os valores do mapa-----\n");
		for (String string : estados.values()) {
			System.out.println(string);
		}
		
		System.out.println("\n-----Retorna as chaves e valores do mapa-----");
		for (Map.Entry<String, String> mapa : estados.entrySet()) {
				System.out.println(mapa.getKey() + "-" + mapa.getValue());
		}
		System.out.println(estados);
	}

}
