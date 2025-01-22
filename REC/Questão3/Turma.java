package questão03;

public class Turma {
	private int numAlunos;
	private Professor professor;
	private Curso curso;
	
	public Turma(int numAlunos, Professor professor, Curso cur) {
		this.numAlunos = numAlunos;
		this.curso = cur;
		if(professor != null) {
			this.professor = professor;
			this.professor.adicionar(this);
		
		}
		
		
	}
	
	public int getNumAlunos() {return numAlunos;}
	public Professor getProifessor() {return professor;}
	public Curso getCurso() {return curso;}
	
	public double calcularCusto() {
		
		return professor.remuneracao() + curso.getValorManutencao();
	}
}
