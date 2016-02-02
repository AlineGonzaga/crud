package crud;

public class Start {

public static void main(String[] args) {
		
	    AlunoPrivado aluno = new AlunoPrivado();
		
 		aluno.setIdade(20);
		aluno.setMatricula("78654378");
		aluno.setNome("Aline");
		aluno.setPagou(true);
	    aluno.inserirCurso();
	    System.out.println();
	    aluno.listarCurso();
	    System.out.println();
	    aluno.ChangedCurso(1, "engenharia");
	 //   aluno.listarCurso();
	//    aluno.editarCurso("engenharia", "TESTE");
	    aluno.listarCurso();
	    System.out.println();
	    aluno.removerCurso();
	    System.out.println();
	    aluno.listarCurso();
		
	}	
}
