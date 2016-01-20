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

	public void inserirCurso(String nome){
		System.out.println(" Cadastre seus cursos aqui. Mais comodidade para você.");
		for(int totalCursos = 0; totalCursos < cursos.length; totalCursos++){
			if(totalCursos == 4){
				System.out.println(" Quantidade de cursos chegou ao limite");
			}
			cursos[totalCursos] = nome;
		}
	
		System.out.println(" Cadastro efetuado.");
	}
	
	public void listarCurso(){
		 for(String curso : cursos){
			 System.out.println(curso);
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
	
	public boolean editarCurso(String cursoModificar, String novoCurso){
		for(String curso : cursos){
			if(curso == cursoModificar){
				curso = novoCurso;
				return true;
			}
		}
		return false;	
	}	
	
	public boolean ChangedCurso(int indice, String novoCurso){
		
	}
}
