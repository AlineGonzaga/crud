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
		
		aluno.editarCurso(4);
		aluno.listarCurso();

		aluno.deletarCurso(2);
		aluno.listarCurso();

		
		System.out.println(aluno.getIdade());
		System.out.println(aluno.getMatricula());
		System.out.println(aluno.getNome());
		System.out.println(aluno.isPagou());
		
		
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
