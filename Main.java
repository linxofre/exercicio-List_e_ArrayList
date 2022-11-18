package testeArrayList;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class Main {

	public static void main(String[] args ) {

		
		ListaPessoas l = new ListaPessoas();

		Pessoa p = new Pessoa("R", "linxofre@gmail.com","01/06/1989");
		l.add(p);
		
		p = new Pessoa("Marcolino", "marcolino@gmail.com", "01/02/1995");
		l.add(p);
		
		p = new Pessoa("Marcolino", "marcolo@gmail.com", "08/03/1985");
		l.add(p);
		
		List<Pessoa> lista = l.getLista();
		
		for (Pessoa item : lista) {
			System.out.println(item.toString());
		}

	}

}
