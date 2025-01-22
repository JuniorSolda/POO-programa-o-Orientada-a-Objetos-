package questão03;

import java.util.LinkedList;
import java.util.List;


public class Professor {
	private double valorHora;
	private List<Turma> turmas;
	
	public Professor(double valorHora, List<Turma> turm) {
		this.valorHora = valorHora;
		turm = new LinkedList<Turma>();
	}

	public double getValorHora() {return valorHora;}
	
	public double remuneracao() {
		double aux = 0;
		for(Turma t : turmas) {
			aux += getValorHora()*t.getCurso().getDuracao();
		}
		
		return aux;
	}
	
	public void adicionar(Turma turm) {
		if(turm != null && turmas.contains(turm)) {
			turmas.add(turm);
		}
	}
}
