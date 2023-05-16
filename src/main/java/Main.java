import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.sql.Connection;
import java.sql.DriverManager;
import tn.esprit.spring.controller.Controllerlog4j;
@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Controllerlog4j log4j =new Controllerlog4j();
	log4j.Greeting();

	

  
	}
	
	
	
}
