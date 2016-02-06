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
	private int  totalCursos = 0;

	public void addCurso(String curso) {
	    if (totalCursos == 5) {
	        System.out.println("Quantidade de cursos chegou ao limite");
	    }
	    cursos[totalCursos] = curso;
	    totalCursos++;
	}
	
	//Se quiser adicionar vários:

		public void addCursos(String ... listaCursos) {
		    if (totalCursos > 5 - cursos.length) {
		        System.out.println("Quantidade de cursos chegou ao limite");
		    }
		    for(String curso : listaCursos){
		        cursos[totalCursos] = curso;
		        totalCursos++;
		    }
		}
	
	public void listarCurso(){
		 for(String curso : cursos){
			 System.out.println(curso);
		 }
	}
	
	
	public boolean changeCurso(String cursoModificar, String cursoNovo) {
	    for(String curso : cursos) {
	        if (curso == cursoModificar) {
	            curso = cursoNovo;
	            return true;
	        }
	    }
	    return false;
	}
	
	public boolean ChangedCurso(int indice, String novoCurso){
		if(indice < 0 || indice > 5){
			return false;
		}
  	 cursos[indice] = novoCurso;
  	 return true;
	}
	
	//entendi
	public boolean removeUltimoCurso() {
	    if (totalCursos == 0) {
	        return false;
	    }
	    cursos[totalCursos - 1] = null;
	    totalCursos--;
	    return true;
	}
	//entendi
	public boolean removeTodosCursos() {
	    cursos = new String[5];
	    return true;
	}
}
