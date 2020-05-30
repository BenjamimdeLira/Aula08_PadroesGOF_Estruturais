package exercicio_4_2_CLIENTE_SUM;
// BENJAMIM DE LIRA SIQUEIRA MELO
// 816112054
public class Main {
	
	public static void main(String[] args) {
		// Cria o cliente com o adaptador.
		Cliente cliente = new Cliente(new SomadorAdapter());
		cliente.executar();
	}
}
