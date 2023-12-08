import java.util.ArrayList;

public class CRUDEtudiant implements Gestionnaire{
	ArrayList<Etudiant> etudiantlist = new ArrayList<>();
	ArrayList<Matiere> matierelist = new ArrayList<>();


    public void addEtudiant(Etudiant e) {
    	
    	if (etudiantlist.contains(e)) {
            System.out.println("Etudiant already exists");
        } else {
            etudiantlist.add(e);
            System.out.println("Etudiant added successfully!");
        }
    }

    public void showEtudiant() {
        for (Etudiant e : etudiantlist) {
            System.out.println(e.toString());
        }
    }

    /* 
     * public Etudiant updateEtudiant(Etudiant e, String nom) {
        for (int i = 0; i < etudiantlist.size(); i++) {
            if (nom.equals(etudiantlist.get(i).getNom())) {
                 return etudiantlist.set(i, e);
            }
        }
        return null;

    }


    public void deleteEtudiant(String nom){
        for (Etudiant e : etudiantlist){
            if (e.getNom().equals(nom)){
            	etudiantlist.remove(e);
                System.out.println("deleted successfuly");
                return;
            }
        }
        System.out.println("not exist");
    }*/
    
    public ArrayList<Etudiant> searchEtudiant(String name)
    {
        ArrayList<Etudiant> listE = new ArrayList<>();
        for (Etudiant e : etudiantlist){
            if (!e.getNom().equals(name)){
                listE.add(e);
            }
        }
        return listE;

    }
		
	
	 public void addMatiere(String etudiantNom, Matiere newMatiere) {
	        for (Etudiant etudiant : etudiantlist) {
	            if (etudiant.getNom().equals(etudiantNom)) {
	                etudiant.getMatieres().add(newMatiere);
	                System.out.println("Matiere added successfully to Etudiant: " + etudiantNom);
	                return;
	            }
	        }
	        System.out.println("Etudiant not found: " + etudiantNom);
	    }

	    public void addNote(String etudiantNom, String matiereNom, Double newNote) {
	        for (Etudiant etudiant : etudiantlist) {
	            if (etudiant.getNom().equals(etudiantNom)) {
	                for (Matiere matiere : etudiant.getMatieres()) {
	                    if (matiere.getNomMatiare().equals(matiereNom)) {
	                        matiere.setNotes(newNote);
	                        System.out.println("Note added successfully to Matiere: " + matiereNom);
	                        return;
	                    }
	                }
	                System.out.println("Matiere not found: " + matiereNom);
	                return;
	            }
	        }
	        System.out.println("Etudiant not found: " + etudiantNom);
	    }
	
	
    public void calculMoyenne(String etudiantNom, String matiereNom) {
    	 for (Etudiant etudiant : etudiantlist) {
             if (etudiant.getNom().equals(etudiantNom)) {
                 for (Matiere matiere : etudiant.getMatieres()) {
                     if (matiere.getNomMatiare().equals(matiereNom)) {
                         ArrayList<Double> notes = matiere.getNotes();
                         if (notes.isEmpty()) {
                             System.out.println("No notes available for Matiere: " + matiereNom);
                         } else {
                             double sum = 0;
                             for (Double note : notes) {
                                 sum += note;
                             }
                             double moyenne = sum / notes.size();
                             System.out.println("Average for Matiere " + matiereNom + ": " + moyenne);
                         }
                         return;
                     }
                 }
                 System.out.println("Matiere not found: " + matiereNom);
                 return;
             }
         }
         System.out.println("Etudiant not found: " + etudiantNom);
     }
	
    
	public void calculMoyenneGenerale(String etudiantNom) {
		for (Etudiant etudiant : etudiantlist) {
            if (etudiant.getNom().equals(etudiantNom)) {
                ArrayList<Matiere> matieres = etudiant.getMatieres();
                if (matieres.isEmpty()) {
                    System.out.println("No matieres available for Etudiant: " + etudiantNom);
                } else {
                    double totalAverage = 0;
                    int matieresWithNotes = 0;

                    for (Matiere matiere : matieres) {
                        ArrayList<Double> notes = matiere.getNotes();

                        if (!notes.isEmpty()) {
                            double sum = 0;
                            for (Double note : notes) {
                                sum += note;
                            }
                            double average = sum / notes.size();
                            totalAverage += average;
                            matieresWithNotes++;
                        }
                    }

                    if (matieresWithNotes > 0) {
                        double overallAverage = totalAverage / matieresWithNotes;
                        System.out.println("Overall Average for Etudiant " + etudiantNom + ": " + overallAverage);
                    } else {
                        System.out.println("No notes available for any Matiere for Etudiant: " + etudiantNom);
                    }
                }
                return;
            }
        }
        System.out.println("Etudiant not found: " + etudiantNom);
    
	}


}
