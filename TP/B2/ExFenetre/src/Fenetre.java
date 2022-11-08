import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;


public class Fenetre extends JFrame {

	private JPanel contentPane;
	private Fenetre fen_suiv;
	private Fenetre fen_prec;


	
	
	
	
	
	public Fenetre getFen_suiv() {
		return fen_suiv;
	}


	public void setFen_suiv(Fenetre fen_suiv) {
		this.fen_suiv = fen_suiv;
	}

	
	
	
	
	

	public Fenetre getFen_prec() {
		return fen_prec;
	}

	
	

	public void setFen_prec(Fenetre fen_prec) {
		this.fen_prec = fen_prec;
	}


	
	
	
	
	
	public void clic_suiv() {
		System.out.println("clic suivant");
		this.fen_suiv.setVisible(true);
	}
	
	
	public void clic_prec() {
		System.out.println("clic precedent");
		this.fen_prec.setVisible(true);
	}
	
	
	
	
	
	
	
	
	public Fenetre() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JButton btnSuivant = new JButton("Suivant");
		btnSuivant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				clic_suiv();
				
				
				
			}
		});
		
		btnSuivant.setBounds(267, 168, 117, 25);
		contentPane.add(btnSuivant);
		
		
		
		
		
		
		JButton btnPrcdent = new JButton("Précédent");
		btnPrcdent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				clic_prec();
				
			}
		});
		btnPrcdent.setBounds(49, 168, 117, 25);
		contentPane.add(btnPrcdent);
		
		
		
		
		JLabel lblFenetre = new JLabel("Fenetre");
		lblFenetre.setBounds(188, 82, 56, 15);
		contentPane.add(lblFenetre);
		
		
		
		
		
		JButton btnNouvelleFenetre = new JButton("Nouvelle fenetre");
		btnNouvelleFenetre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				Fenetre Fenetre= new Fenetre();
				Fenetre.setVisible(true); 
				Fenetre.setBounds(100, 100, 450, 300);
				Fenetre.setTitle("Fenetre");
					
				
				
				
				
				
				
				
				
			}
		});
		
		
		btnNouvelleFenetre.setBounds(130, 218, 177, 25);
		contentPane.add(btnNouvelleFenetre);
		
		
	
		
		
	}
}
