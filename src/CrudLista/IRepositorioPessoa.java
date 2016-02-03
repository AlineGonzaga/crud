package CrudLista;

import java.util.List;

public interface IRepositorioPessoa {
	
	  boolean salvarPessoa(Pessoa pessoa);
	  boolean deletarPessoaPorId(int id);
	  public List<Pessoa> listarPessoa();
	  boolean alterarPessoa(Pessoa pessoa);
}
