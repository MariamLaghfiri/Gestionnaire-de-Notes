# Gestionnaire-de-Notes

Gestion des Etudiants :
Ce projet implémente un système de gestion d'étudiants avec des fonctionnalités de base telles que l'ajout d'étudiants, l'affichage des étudiants, la recherche d'étudiants, l'ajout de matières à un étudiant existant, l'ajout de notes à une matière existante, le calcul de la moyenne d'une matière spécifique, et le calcul de la moyenne générale.

Classes : 
Etudiant
La classe Etudiant représente un étudiant avec un identifiant (ID), un nom, et une liste de matières associées.

Attributs :
cin : Identifiant de l'étudiant.
nom : Nom de l'étudiant.
matieres : Liste des matières associées à l'étudiant.
Méthodes :
getMatieres() : Renvoie la liste des matières de l'étudiant.
setMatieres(ArrayList<Matiere> newMatieres) : Modifie la liste des matières de l'étudiant.
Matiere
La classe Matiere représente une matière avec un nom et une liste de notes associées.

Attributs :
nomMatiere : Nom de la matière.
notes : Liste des notes associées à la matière.
Méthodes :
getNomMatiere() : Renvoie le nom de la matière.
setNomMatiere(String nomMatiere) : Modifie le nom de la matière.
getNotes() : Renvoie la liste des notes de la matière.
setNotes(Double note) : Ajoute une note à la liste des notes.
CRUDEtudiant
La classe CRUDEtudiant est une classe de gestion qui implémente les opérations CRUD (Create, Read, Update, Delete) sur les étudiants et les matières.

Méthodes :
addEtudiant(Etudiant e) : Ajoute un nouvel étudiant.
showEtudiant() : Affiche la liste des étudiants.
searchEtudiant(String name) : Recherche un étudiant par nom.
addMatiere(String etudiantNom, Matiere newMatiere) : Ajoute une nouvelle matière à un étudiant existant.
addNote(String etudiantNom, String matiereNom, Double newNote) : Ajoute une nouvelle note à une matière existante.
calculMoyenne(String etudiantNom, String matiereNom) : Calcule la moyenne des notes pour une matière spécifique d'un étudiant.
calculMoyenneGenerale(String etudiantNom) : Calcule la moyenne générale de toutes les matières pour un étudiant.
Utilisation
L'application utilise un menu interactif pour permettre à l'utilisateur d'effectuer différentes opérations sur les étudiants.

Ajouter un étudiant : L'utilisateur peut ajouter un nouvel étudiant en fournissant un ID, un nom et une liste de matières avec leurs notes associées.

Afficher un étudiant : L'utilisateur peut afficher la liste des étudiants.

Rechercher un étudiant : L'utilisateur peut rechercher un étudiant par nom.

Ajouter une matière à un étudiant : L'utilisateur peut ajouter une nouvelle matière à un étudiant existant.

Ajouter une note à un étudiant : L'utilisateur peut ajouter une nouvelle note à une matière existante d'un étudiant.

Calculer la moyenne d'une matière : L'utilisateur peut calculer la moyenne des notes pour une matière spécifique d'un étudiant.

Calculer la moyenne générale : L'utilisateur peut calculer la moyenne générale de toutes les matières pour un étudiant.

Quitter : L'utilisateur peut quitter l'application.
