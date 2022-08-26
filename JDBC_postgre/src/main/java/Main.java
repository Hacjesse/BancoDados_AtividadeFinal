import java.sql.SQLException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
                long tempoInicial = System.currentTimeMillis();
		
		String url = "jdbc:postgresql://localhost:5432/postgres";

		String user = "postgres";
		
		String password = "1243";
		PersonJDBC pjdbc = new PersonJDBC(url, user, password);
		
		Person person = new Person();
		person.setName("Ale");
		person.setSobrenome("Ave");
		person.setBirthday("10/10/1980");
		pjdbc.addPerson(person);
                
                System.out.println("CRIANDO PESSOA");
                System.out.println("Nome: " + person.getName());
                System.out.println("Sobrenome: " + person.getSobrenome());
                System.out.println("Birthday: " + person.getBirthday());
                
                
                
                
                person.setName("Alessandra");
                person.setSobrenome("Avelino");
                person.setBirthday("23-01-2002");
                person.setId(1);
                
                System.out.println("ATUALIZANDO PESSOA");
                System.out.println("Nome: " + person.getName());
                System.out.println("Sobrenome: " + person.getSobrenome());
                System.out.println("Birthday: " + person.getBirthday());
                
                
                pjdbc.upPerson(person);
                
  
                
              
		
		System.out.println(pjdbc.getPerson("Alessandra").getName());
                System.out.println("DELETANDO PESSOA");
		pjdbc.removePerson(person);
                
                long tempoFinal = System.currentTimeMillis();

                System.out.printf("%.3f ms%n", (tempoFinal - tempoInicial) / 1000d);
	}

}
