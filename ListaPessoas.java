package testeArrayList;


import java.util.ArrayList;
import java.util.List;


public class ListaPessoas {
	
	private List<Pessoa> lista = new ArrayList<Pessoa>();
		
	public List<Pessoa> getLista() {
		return lista;
	}

	public void setLista(List<Pessoa> lista) {
		this.lista = lista;
	}

	public boolean add(Pessoa pessoa) {
		lista.add(pessoa);
		return true;
	}
	
	/*
     * Não permitir nomes iguais ou com menos de três letras
     * Buscar todos os domínios de e-mail
     * Remover pelo nome
     * Alterar pessoa
     * Fazer uma busca usando 'like' inicial do nome
     * Mostrar idade
     * Buscar idade > ?
     * Aniversariantes do mês ? 1 - janeiro, 2 - fevereiro, ...
     */
	
	

}
