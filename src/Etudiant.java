import java.util.ArrayList;

public class Etudiant {

	private String cin;
	private  String nom;
	private ArrayList<Matiere> matieres;		
	

	public Etudiant(String cine, String nom,ArrayList<Matiere> matiere) {
		this.cin = cine;
		this.nom = nom;
		this.matieres=matiere;
	}
	
	
	public ArrayList<Matiere> getMatieres() {
		return matieres;
	}


	public void setMatieres(ArrayList<Matiere> newMatiere) {
		this.matieres = newMatiere;
	}
	    

	public String getCin() {
		return cin;
	}

	public void setCin(String i) {
		cin = i;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String n) {
		nom = n;
	}
	
	
	
	@Override
	public String toString() {
		return "ID : "+cin +" | nom :  " + nom +" | Matiere : "+matieres.toString();
	}
}
