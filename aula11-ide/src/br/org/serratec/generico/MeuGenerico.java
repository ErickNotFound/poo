package br.org.serratec.generico;

public class MeuGenerico<T> {
	private T valor;

	public MeuGenerico(T valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Valor: " + valor;
	}

	public T getValor() {
		return valor;
	}

}
