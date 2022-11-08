
public class Main{

	public static void main(String[] args) {
		
		
		
		Fenetre Fenetre1= new Fenetre();
		Fenetre1.setVisible(true);
		Fenetre1.setTitle("Fenetre1");
		
		
		
		
		Fenetre Fenetre2 = new Fenetre();
		Fenetre2.setVisible(false);
		Fenetre2.setTitle("Fenetre2");
		
		
		
		
		
		Fenetre Fenetre3 = new Fenetre();
		Fenetre3.setVisible(false);
		Fenetre3.setTitle("Fenetre3");
		
		
		
		
		Fenetre1.setFen_suiv(Fenetre2);
		Fenetre2.setFen_suiv(Fenetre3);
		Fenetre3.setFen_suiv(Fenetre1);
		
		
		
		
		Fenetre1.setFen_prec(Fenetre3);
		Fenetre3.setFen_prec(Fenetre2);
		Fenetre2.setFen_prec(Fenetre1);
		
		
	
		
		
		
		
		
	}

}
