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
     * N�o permitir nomes iguais ou com menos de tr�s letras
     * Buscar todos os dom�nios de e-mail
     * Remover pelo nome
     * Alterar pessoa
     * Fazer uma busca usando 'like' inicial do nome
     * Mostrar idade
     * Buscar idade > ?
     * Aniversariantes do m�s ? 1 - janeiro, 2 - fevereiro, ...
     */
	
	

}
