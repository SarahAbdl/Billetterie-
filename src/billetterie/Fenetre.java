package billetterie;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Fenetre extends JFrame {
  private JButton bouton = new JButton("Effectuer ma r�servation");
  

  public Fenetre(){      
    this.setTitle("Ma R�servation");
    this.setSize(400, 200);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);      
    this.getContentPane().setLayout(new FlowLayout());
    this.getContentPane().add(bouton);
    bouton.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent arg0) {
        FDialog zd = new FDialog(null, "Ma r�servation", true);
        FDialogInfo zInfo = zd.showZDialog(); 
        JOptionPane jop = new JOptionPane();
        jop.showMessageDialog(null, zInfo.toString(), "Informations r�servation", JOptionPane.INFORMATION_MESSAGE);
      }         
    });      
    this.setVisible(true);      
  }
   
   }
