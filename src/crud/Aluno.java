package crud;

import java.util.Scanner;

public class Aluno {

	private String nome;
	private String matricula;
	private int idade;
	private String[] cursos = new String[5];
	Scanner sc = new Scanner(System.in);
	private int totalCursos = 0;
	
	public String[] getCursos() {
		return cursos;
	}

	public void setCursos(String[] cursos) {
		this.cursos = cursos;
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
		System.out.println(" Cadastre seus cursos aqui.");
//		 int totalCursos = 0;
//		 if (totalCursos == 5) {
//		          System.out.println(" ERROR ");  // throw Exception("Quantidade de cursos chegou ao limite");
//		    }
//		    cursos[totalCursos] = nome;
//		    totalCursos++;
		
		for(int i =0; i<cursos.length; i++ ){
			cursos[i] = sc.next();
		}
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
	
	public void editarCurso(String cursoModificar, String novoCurso){
		for(String curso : cursos){
			if(curso.equals(cursoModificar)){
				curso = novoCurso;
			
			}
		}
		
	}	
	
	public boolean ChangedCurso(int indice, String novoCurso){
		if(indice < 0 || indice > 5){
			return false;
		}
  	 cursos[indice] = novoCurso;
  	 return true;
	}
	
	public boolean removerCurso(){
		   if (totalCursos == 0) {
		        return false;
		    }
		    cursos[totalCursos - 1] = null;
		    totalCursos--;
		    return true;
	}
	
}
