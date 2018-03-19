package billeterie;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class Test {

	public static void main(String[] args) {
		
	Fenetre fn = new Fenetre ();
		
		try {
	      Class.forName("org.postgresql.Driver");
	      System.out.println("Driver O.K.");

	      String url = "jdbc:postgresql://localhost:5432/billet";
	      String user = "postgres";
	      String passwd = "sarahabd";

	      Connection conn = DriverManager.getConnection(url, user, passwd);
	      System.out.println("Connexion effective !");         
	         
	    } catch (Exception e) {
	      e.printStackTrace();
	    }   		

	}

}
