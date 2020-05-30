package exercicio_4_1_MAP;

import java.util.Iterator;
import java.util.Map;
//BENJAMIM DE LIRA SIQUEIRA MELO
//816112054
public class Main {

	public static void main(String[] args) {
		// Cria os pares em uma matriz.
		Object[][] pares = new String[][] { { "Apple", "Green", "Desk", "Chair", "The Wall", "Pink" }, { "Maça", "Verde", "Mesa", "Cadeira", "A/O Parede", "Rosa" } };

		// Cria um novo mapa com a matriz.
		@SuppressWarnings("rawtypes")
		Map mapa = new NovoMapa(pares);

		// Imprime os valores.
		for (@SuppressWarnings("rawtypes")
		Iterator iter = mapa.entrySet().iterator(); iter.hasNext();) {
			@SuppressWarnings("rawtypes")
			Map.Entry entry = (Map.Entry) iter.next();
			System.out.println(entry.getKey() + " => " + entry.getValue());
		}
	}
}
