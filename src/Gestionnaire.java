
public interface Gestionnaire {
	public void calculMoyenne(String etudiantNom, String matiereNom);
	public void calculMoyenneGenerale(String etudiantNom);
	public void addEtudiant(Etudiant e);
	public void showEtudiant();
	public void addMatiere(String etudiantNom, Matiere newMatiere);
	public void addNote(String etudiantNom, String matiereNom, Double newNote);
	/*public Etudiant updateEtudiant(Etudiant e, String nom);
	public void deleteEtudiant(String nom);*/
}
