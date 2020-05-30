package exercicio_4_2_CLIENTE_SUM;

import java.util.List;

public class SomadorExistente {
	/** Soma uma lista de inteiros. */
	public int somaLista(List<Integer> lista) {
		int resultado = 0;
		for (int i : lista)
			resultado += i;
		return resultado;
	}
}
