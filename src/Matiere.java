import java.util.ArrayList;

public class Matiere{
	private String nomMatiare;
	private ArrayList<Double> notes;		

	
	public Matiere(String m, ArrayList<Double> notes) {
	    this.nomMatiare = m;
	    this.notes = notes;
	}
	
	public String getNomMatiare() {
		return nomMatiare;
		
	}

	public void setNomMatiare(String nomMatiare) {
		this.nomMatiare = nomMatiare;
	}

	public ArrayList<Double> getNotes() {
		return notes;
	}

	public void setNotes(Double newNotes) {
	    notes.add(newNotes);
	}

	@Override
	public String toString() {
		return "Matiere ["
				+ "{nomMatiare : " + nomMatiare + ", notes : " + notes + "} | ";
	}



	
	
}
