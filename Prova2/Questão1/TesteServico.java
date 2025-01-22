package questão1;

public class TesteServico {

	public static void main(String[] args) {
		Servico prog = new Servico("teste", 200, 275.00, 45.50);
		double vlr = prog.registrar(120);
		
		int resta = prog.getSaldoHoras();
		System.out.println("Restam "+resta+" horas");
		vlr = prog.registrar(80);
		resta = prog.getSaldoHoras();
		System.out.println("Restam "+resta+" horas");
		
		prog.encerrar();
	}

}
