package crud;

public class Start {

public static void main(String[] args) {
		
	    
		AlunoPrivado aluno = new AlunoPrivado();
		
 		aluno.setIdade(20);
		aluno.setMatricula("78654378");
		aluno.setNome("Aline");
		aluno.setPagou(true);
	    aluno.inserirCurso();
	    aluno.listarCurso();
	    aluno.ChangedCurso(1, "engenharia");
	    aluno.listarCurso();
	    aluno.editarCurso("engenharia", "TESTE");
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
