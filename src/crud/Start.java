package crud;

public class Start {

public static void main(String[] args) {
		
	    
		AlunoPrivado aluno = new AlunoPrivado();
		AlunoPrivado aluno2 = new AlunoPrivado();
 		aluno.setIdade(20);
		aluno.setMatricula("78654378");
		aluno.setNome("Aline");
		aluno.setPagou(true);
	    aluno.inserirCurso("matematica");
	    aluno.inserirCurso("historia");
	    aluno.inserirCurso("ciencias");
	    aluno.inserirCurso("informática");
	    aluno.inserirCurso("português");
	    aluno.listarCurso();

		
		
		
	
		
		
//		aluno.cursos[0] = "Matem�tica";
//		aluno.cursos[1] = "Ci�ncias";
//		aluno.cursos[2] = "Qu�mica";
//		aluno.cursos[3] = "Hist�ria";
//		aluno.cursos[4] = "Portugu�s";
		
		
		
//		for(int i = 0; i < 5; i++){
//			System.out.println(aluno.cursos[i]);
//		}
		
	}	
}
