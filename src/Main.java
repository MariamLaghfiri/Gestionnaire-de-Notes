import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CRUDEtudiant crudEtudiant = new CRUDEtudiant();
		
		int option = 0;
		
		
			
			do {
				
				
				System.out.println("menu");
		        System.out.println("1: Add Etudiant");
		        System.out.println("2: Show Etudiant");
		        System.out.println("3: Search Etudiant");
		        System.out.println("4: Add matiere to exist etudiant");
		        System.out.println("5: Add note to exist etudiant");
		        System.out.println("6: calcul Moyenne ");
		        System.out.println("7: calcul Moyenne Generale");
		        System.out.println("0: Exit");
		        System.out.print("Enter your selection : ");
				option = scanner.nextInt();
				scanner.nextLine();
				
				switch (option) {
					//Add
					case 1:
						
						System.out.print("ID : ");
						String cin = scanner.next();
						
						System.out.print("Nom : ");
						String nom = scanner.next();
						
						System.out.print("combien de matier que vous voulez entrer ");
						int nombreMatiere = scanner.nextInt();
						
						ArrayList<Matiere> listeDeMatiere = new ArrayList();
						for (int i = 0; i < nombreMatiere; i++) {

    						System.out.print("Matiere n° "+ (i+1));
    						String matiere = scanner.next();
    						
    						System.out.print("combien de notes que vous voulez entrer pour cette matiere  : ");
    						int nombreN = scanner.nextInt();
    						
    						ArrayList<Double> listeDeNote = new ArrayList();
    						
                        	for (int j = 0; j < nombreN; j++) {
                        		System.out.print("note n° "+ (j+1));
                        		Double note = scanner.nextDouble();
        						if (note >= 0 && note <= 20) {
                                    listeDeNote.add(note);
                                }
        						else {
                                    System.out.println("entrer une note valid entre 0 et 20");
                                    j -= 1;
                                }
                            }
                        	Matiere newMatiere = new Matiere(matiere,listeDeNote);
                        	
    						listeDeMatiere.add(newMatiere);
    						
                        }
						
							Etudiant newEtudiant = new Etudiant(cin,nom,listeDeMatiere);
	
							crudEtudiant.addEtudiant(newEtudiant);
							System.out.println(newEtudiant.toString());
	                   
	                    break;
					//Search
					case 2 :
						System.out.print("id searched");
						String nameSearched = scanner.next();
						if(crudEtudiant.searchEtudiant(nameSearched) == null) {
							System.out.print("Etudiant not exist ");
							break;
						}
						System.out.println(crudEtudiant.searchEtudiant(nameSearched).toString());
						break;

	                case 3 :
	                    crudEtudiant.showEtudiant();
	                    break;
	                case 4:
	                    // Add matiere to an existing etudiant
	                    System.out.println("Enter the name of the etudiant");
	                    String etudiantNom = scanner.next();
	                    System.out.println("Enter the name of the matiere");
	                    String matiereNom = scanner.next();
	                    crudEtudiant.addMatiere(etudiantNom, new Matiere(matiereNom, new ArrayList<>()));
	                    break;
	                case 5:
	                    System.out.println("Enter the name of the etudiant");
	                    String etudiantNom5 = scanner.next();
	                    System.out.println("Enter the name of the matiere");
	                    String matiereNom5 = scanner.next();
	                    System.out.println("Enter the new note");
	                    Double newNote5 = scanner.nextDouble();
	                    
	                    crudEtudiant.addNote(etudiantNom5, matiereNom5, newNote5);
	                    break;
	                case 6 :
	                	
	                	
                        System.out.println("entrer le nom de l'etudiant");
                        String etudiantNom6 = scanner.next();

                        System.out.println("entrer le nom de la matiere");
                        String matiereNom6 = scanner.next();
                        
	                    crudEtudiant.calculMoyenne(etudiantNom6, matiereNom6);
	                    
	                    break;
	                case 7 :
	                	
                        System.out.println("entrer le nom de l'etudiant");
                        String etudiantNom1 = scanner.next();
                        
	                    crudEtudiant.calculMoyenneGenerale(etudiantNom1);
	                    break;
					case 0:
		                System.out.println("EXIT");
		                System.exit(0);
		 
		                break;
					default:
		                System.out.println("\nInvalid input\n");
		                break;
				}
			}
			while (option != 0);
			
			scanner.close();

	}
}
