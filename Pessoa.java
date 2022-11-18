package testeArrayList;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Pessoa {
	
	private String nome;
	private String email;
	private String nascimento;

	//construtores
	public Pessoa(String nome, String email, String nascimento) {
		this.nome = nome;
		this.email = email;
		this.nascimento = nascimento;
	}

	
	//métodos
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		String verificaN = nome;
		// verifica se o nome se repete
	    if(this.nome.equalsIgnoreCase(verificaN) || this.nome.length() < 3) {
	    	System.out.println("nome inválido");
	    }else
	    	this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	 
	
	@Override
	/*public boolean equals(Object obj) {
	    Pessoa other = (Pessoa) obj;
	    // verifica se o nome se repete
	    if(this.nome.equals(other.nome) || this.nome.length() < 3) {
	    	System.out.println("nome inválido");
	    }else
	    	this.nome = nome;
			return nome != null;
	 }*/
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [nome = ");
		builder.append(nome);
		builder.append(", email = ");
		builder.append(email);
		builder.append(", nascimento = ");
		builder.append(nascimento);
		builder.append("]");
		return builder.toString();
	}
	

	

}
