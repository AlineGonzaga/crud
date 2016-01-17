package crud;

import java.util.Scanner;

public class Aluno {

	private String nome;
	private String matricula;
	private int idade;
	private String[] cursos = new String[5];
	Scanner sc = new Scanner(System.in);
	
	public String[] getCursos() {
		return cursos;
	}

	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}

	public Aluno(){
		this.nome = nome;
		this.matricula = "Aluno nao matriculado";
		this.idade = 0;
	}
		
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void inserirCurso(){
		int i = 0;
		System.out.println(" Cadastre seus cursos aqui. Mais comodidade para você.");
		do {
			System.out.println(" Escolha cursos: " );
			cursos[i] = sc.next();
			i++;
		}while(i < 5);
	
		System.out.println(" Cadastro efetuado.");
	}
	
	public void listarCurso(){
		for( int i = 0; i < this.cursos.length; i++){
			System.out.println(" Cursos cadastrados: " + this.cursos[i]);
		}
		
	}
	
	public void deletarCurso(int indice){
		System.out.println("Cancelando");
		for(int i = 0; i < this.cursos.length; i++){
			if(i == indice){
				this.cursos[i] = " ";
			}
		}
	}
	
	public void editarCurso(int indice){
		System.out.println("Editando");
		System.out.println(" Digite o novo nome: ");
		String nome = sc.next();
		
		for(int i = 0; i < this.cursos.length; i++){
			if(i == indice){
				this.cursos[i] = nome;
			}
		}
	}
}
