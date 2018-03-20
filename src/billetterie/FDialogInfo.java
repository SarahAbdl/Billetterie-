package billetterie;

public class FDialogInfo {
	  private static String nom, prenom, civilite, place, concert, mail;
	
	  

	  public static String getNom() {
		return nom;
	}
	public static String getPrenom() {
		return prenom;
	}
	
	public static String getCivilite() {
		return civilite;
	}
	
	public static String getPlace() {
		return place;
	}
	
	public static String getConcert() {
		return concert;
	}

	public static String getMail() {
		return mail;
	}
	
	public FDialogInfo(){}
	  public FDialogInfo(String civilite, String nom, String prenom, String mail, String place, String concert){
	    this.civilite = civilite;
	    this.nom = nom;
	    this.prenom=prenom; 
	    this.mail = mail;
	    this.place = place;
	    this.concert = concert;
	    
	  }

	  public String toString(){
	    String str;
	    if(this.nom != null && this.prenom != null && this.civilite != null && this.mail != null && this.place != null && this.concert != null){
	      str = "Description de votre Réservation" + "\n" + "\n";
	      str += "Civilité : " + this.civilite + "\n";
	      str += "Nom : " + this.nom + "\n";
	      str += "Prénom : " + this.prenom + "\n";
	      str += "Mail : " + this.mail + "\n";
	      str += "Concert : " + this.concert + "\n";
	      str += "Place : " + this.place + "\n";
	      	      
	    }
	    else{
	      str = "Aucune information !";
	    }
	    return str;
	  }
	}