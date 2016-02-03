package CrudLista;

import java.util.ArrayList;
import java.util.List;

public class TestePessoa {
	static RepositorioPessoa rp = new RepositorioPessoa();

	public static void main(String[] args) {
	
		popularArray();
		mostrarPessoas();
		rp.deletarPessoaPorId(2);
		mostrarPessoas();
		alterar();
		mostrarPessoas();

	}
	
	public static void alterar(){
		Pessoa p2 = new Pessoa();
		p2.setId(3);
		p2.setApelido("Leandra");
		p2.setNome("  Leandra Sallezenta ");
		p2.setIdade(49);
		rp.alterarPessoa(p2);
	}
	
	public static void popularArray(){
	
		Pessoa p = new Pessoa();
		
		boolean salvo;
		p.setId(1);
		p.setApelido("Ali");
		p.setNome(" Aline ");
		p.setIdade(29);
		salvo = rp.salvarPessoa(p);
		 
		Pessoa p2 = new Pessoa();
		p2.setId(2);
		p2.setApelido("Lualine");
		p2.setNome(" Lulualine ");
		p2.setIdade(39);
		salvo = rp.salvarPessoa(p2);

		Pessoa p3 = new Pessoa();

		p3.setId(3);
		p3.setApelido("Leandraa");
		p3.setNome(" Leandro Salles");
		p3.setIdade(35);
		salvo = rp.salvarPessoa(p3);
	}
	
	public static void mostrarPessoas(){
		List <Pessoa> lista = new ArrayList<>();
		
		 lista = rp.listarPessoa();
		 
		 for(Pessoa pessoas: lista){
			 System.out.println(" id " +pessoas.getId());
			 System.out.println(" Apelido: "+pessoas.getApelido());
			 System.out.println(" Idade:" +pessoas.getIdade());
			 System.out.println(" Nome: "+pessoas.getNome());
			 System.out.println("-------------------------------");
		 }
   }
}
