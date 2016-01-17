package crud;

public class AlunoPrivado extends Aluno implements ControleDeAluno{

	private boolean isPagou = true;

	public boolean pagouMensalidade(){
		return this.isPagou();
	}
	
	
	public AlunoPrivado(){
		super();
		
		
	}
	public boolean isPagou() {
		return isPagou;
	}

	public void setPagou(boolean isPagou) {
		this.isPagou = isPagou;
	}
	
	@Override
	public void documentacao() {
		System.out.println(" Vai precisar desses documentos:");
		System.out.println("RG;");
		System.out.println("Comprovante de residência;");
		
	}

	@Override
	public void matriculado() {
		System.out.println("Digite seu login:");
		System.out.println("Digite a sua senha:");
		
	}

	@Override
	public boolean fezMatricula() {
		
		return true;
	}
}
