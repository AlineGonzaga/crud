package crud;

public class Start {

public static void main(String[] args) {
		
	    
		AlunoPrivado aluno = new AlunoPrivado();
		AlunoPrivado aluno2 = new AlunoPrivado();
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
		
		
		aluno2.setNome(" Celine ");
		aluno2.setIdade(17);
		aluno2.setMatricula("8574975");
		aluno2.setPagou(true);
		aluno2.inserirCurso();
		aluno2.listarCurso();
		aluno2.editarCurso(3);
		aluno2.deletarCurso(0);
		
		
//		aluno.cursos[0] = "Matemática";
//		aluno.cursos[1] = "Ciências";
//		aluno.cursos[2] = "Química";
//		aluno.cursos[3] = "História";
//		aluno.cursos[4] = "Português";
		
		
		
//		for(int i = 0; i < 5; i++){
//			System.out.println(aluno.cursos[i]);
//		}
		
	}	
}
