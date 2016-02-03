package crud;

public class Start {

public static void main(String[] args) {
		
	    AlunoPrivado aluno = new AlunoPrivado();
	    
		
	    //Utilizando o getCursos() para poder alterar o conteúdo do vetor
	    aluno.getCursos()[0] = "Curso0";
	    aluno.getCursos()[1] = "Curso1";
	    aluno.getCursos()[2] = "Curso2";
	    aluno.getCursos()[3] = "Curso3";
	    aluno.getCursos()[4] = "Curso4";

	    String[] novosCursos = new String[10];

	    for(int i = 0; i < novosCursos.length; i++){
	      novosCursos[i] = "Curso" + i;
	    }
	    //Utilizando o set para alterar o atributo alunos, passando
	    //a referencia de um novo vetor criado acima
	    aluno.setCursos(novosCursos);
	}	
}	

