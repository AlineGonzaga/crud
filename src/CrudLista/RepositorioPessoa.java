package CrudLista;

import java.util.ArrayList;
import java.util.List;

public class RepositorioPessoa implements IRepositorioPessoa{

	
	List<Pessoa> pessoas = new ArrayList<>();
	
	@Override
	public boolean salvarPessoa(Pessoa pessoa) {
		try {
			pessoas.add(pessoa);

		}catch(Exception e){
		
		return false;
		}
		return true;
	}

	@Override
	public boolean deletarPessoaPorId(int id) {
		for(Pessoa pessoa: pessoas){
			if(pessoa.getId() == id){
				pessoas.remove(pessoa);
			}
		}
		
		return true;
		
	}

	@Override
	public List<Pessoa> listarPessoa() {
		return pessoas;
	}

	@Override
	public boolean alterarPessoa(Pessoa pessoa) {

		for(Pessoa pessoa1: pessoas){
			if(pessoa1.getId() == pessoa.getId()){
				pessoas.remove(pessoa1);
				pessoas.add(pessoa);
			}
		}
		
		return true;
	}

}
