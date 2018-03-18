package billeterie;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
//import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;

public class ZDialog extends JDialog {
  private ZDialogInfo zInfo = new ZDialogInfo();
  private boolean sendData;
  private JLabel nomLabel, prenomLabel, civiliteLabel, concertLabel, placeLabel, mailLabel;
  private JRadioButton place1, place2;
  private JComboBox civilite, concert;
  private JTextField nom, prenom, mail;

  public ZDialog(JFrame parent, String title, boolean modal){
    super(parent, title, modal);
    this.setSize(600, 800);
    this.setLocationRelativeTo(null);
    this.setResizable(false);
    this.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
    this.initComponent();
  }

  public ZDialogInfo showZDialog(){
    this.sendData = false;
    this.setVisible(true);      
    return this.zInfo;   }   
  

 private void initComponent(){
//    //Icône
//    icon = new JLabel(new ImageIcon("images/icone.jpg"));
//    JPanel panIcon = new JPanel();
//    panIcon.setBackground(Color.white);
//    panIcon.setLayout(new BorderLayout());
//    panIcon.add(icon);
	 
	//Civilité
	    JPanel panCivilite = new JPanel();
	    panCivilite.setBackground(Color.white);
	    panCivilite.setPreferredSize(new Dimension(220, 100));
	    panCivilite.setBorder(BorderFactory.createTitledBorder("Civilité"));
	    civilite = new JComboBox();
	    civilite.addItem("Mme");
	    civilite.addItem("Mr");
	    civiliteLabel = new JLabel("Civilité :  ");
	    panCivilite.add(civiliteLabel);
	    panCivilite.add(civilite);

    //Le nom
    JPanel panNom = new JPanel(); 
    panNom.setBackground(Color.white);
    panNom.setPreferredSize(new Dimension(250, 150));
    nom = new JTextField();
    nom.setPreferredSize(new Dimension(200, 60));
    panNom.setBorder(BorderFactory.createTitledBorder("Nom"));
    nomLabel = new JLabel("Saisir un nom :");
    panNom.add(nomLabel);
    panNom.add(nom);

  //Le prenom
    JPanel panPrenom = new JPanel();
    panPrenom.setBackground(Color.white);
    panPrenom.setPreferredSize(new Dimension(250, 150));
    prenom = new JTextField();
    prenom.setPreferredSize(new Dimension(200, 60));
    panPrenom.setBorder(BorderFactory.createTitledBorder("Prenom"));
    prenomLabel = new JLabel("Saisir un prénom :");
    panPrenom.add(prenomLabel);
    panPrenom.add(prenom);
    
  //Le mail 
    JPanel panMail = new JPanel();
    panMail.setBackground(Color.white);
    panMail.setPreferredSize(new Dimension(250, 150));
    panMail.setBorder(BorderFactory.createTitledBorder("Adresse Mail : "));
    mailLabel = new JLabel("Mail : ");
    mail = new JTextField();
    mail.setPreferredSize(new Dimension(200, 60));
    panMail.add(mailLabel);
    panMail.add(mail);
    
    
    //place
    JPanel panPlace = new JPanel();
    panPlace.setBackground(Color.white);
    panPlace.setBorder(BorderFactory.createTitledBorder("Place : "));
    panPlace.setPreferredSize(new Dimension(440, 100));
    place1 = new JRadioButton("Assise");
    place1.setSelected(true);
    place2 = new JRadioButton("Debout");
    
    ButtonGroup bg = new ButtonGroup();
    bg.add(place1);
    bg.add(place2);
    panPlace.add(place1);
    panPlace.add(place2);
    

    //Concert
    JPanel panConcert = new JPanel();
    panConcert.setBackground(Color.white);
    panConcert.setPreferredSize(new Dimension(220, 100));
    panConcert.setBorder(BorderFactory.createTitledBorder("Choix du concert "));
    concert = new JComboBox();
    concert.addItem("Arctic Monkeys - 09/07/2018");
    concert.addItem("AC/DC - 24/08/2018");
    concert.addItem("Bruno Mars - 12/09/2018");
    concert.addItem("Cardi B - 16/10/2018");
    concertLabel = new JLabel("Concert");
    panConcert.add(concertLabel);
    panConcert.add(concert);

    JPanel content = new JPanel();
    content.setBackground(Color.white);
    content.add(panCivilite);
    content.add(panNom);
    content.add(panPrenom); 
    content.add(panMail);
    content.add(panPlace);    
    content.add(panConcert);

    JPanel control = new JPanel();
    JButton okBouton = new JButton("OK");
    
    okBouton.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent arg0) {        
        zInfo = new ZDialogInfo((String)civilite.getSelectedItem(),nom.getText(), prenom.getText(), mail.getText(), getPlace(), (String)concert.getSelectedItem() );
        setVisible(false);
      }
      public String Mail(){
        return (mail.getText().equals("")) ? "exemple@email.com" : mail.getText();
      }    
      
      public String getPlace(){
        return (place1.isSelected()) ? place1.getText() : 
               (place2.isSelected()) ? place2.getText() : 
                place1.getText();  
      }

        
    });

    JButton cancelBouton = new JButton("Annuler");
    cancelBouton.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent arg0) {
        setVisible(false);
      }      
    });

    control.add(okBouton);
    control.add(cancelBouton);

    //this.getContentPane().add(panIcon, BorderLayout.WEST);
    this.getContentPane().add(content, BorderLayout.CENTER);
    this.getContentPane().add(control, BorderLayout.SOUTH);
  }  
}
