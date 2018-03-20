package billeterie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import billeterie.ZDialogInfo; 




public class Test {

	public static void main(String[] args) {
		
	Fenetre fn = new Fenetre ();
	
	try {
	      Class.forName("org.postgresql.Driver");
	      System.out.println("Driver O.K.");

	      String url = "jdbc:postgresql://localhost:5432/billets";
	      String user = "postgres";
	      String passwd = "sarahabd";
	      Connection conn = DriverManager.getConnection(url, user, passwd); 

	      
	      System.out.println("Connexion effective !");  
	      
	        Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			
//	        state.executeUpdate("INSERT INTO billets (civilite, prenom, nom, mail, concert, place) VALUES('"civilite.getText()
//	        		+"','"+billets.getCivilite()+"','"+nom.getText()+"','"+mail.getText()+"','"+concert.getSelectedItem()+"','"+place.isSelected()+"')");
//	        
//	        		System.out.println("Informations rentrées dans la BDD");
	      } 
	 catch (Exception e) {
		 e.printStackTrace();
	 	}
	}	
	}



