package crud;

public class Start {

public static void main(String[] args) {
		
	    AlunoPrivado aluno = new AlunoPrivado();
	    
		aluno.addCursos("Portugues", "matemática", "historia", "fisica");
		//aluno.listarCurso();
		 boolean result = aluno.changeCurso("Portugues", "ciências");
		aluno.listarCurso();
		System.out.println(result);
		//aluno.ChangedCurso(2, " Fotografia ");
		//aluno.listarCurso();
		aluno.addCurso("engenharia");
		aluno.listarCurso();
		aluno.removeUltimoCurso();
		aluno.listarCurso();
		aluno.removeTodosCursos();
		aluno.listarCurso();


	}	
}	

