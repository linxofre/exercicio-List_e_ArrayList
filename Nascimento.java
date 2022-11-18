package testeArrayList;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Nascimento extends Pessoa{
	private Date nascimento;
	
	//construtor
	public Nascimento(String nome, String email, String nascimento) {
		super(nome, email, nascimento);
	}
	public void Nascimento1() {

	}
	
	//métodos
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public Date getNascimento() {
		return nascimento;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Nascimento [nascimento = ");
		builder.append(nascimento);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
