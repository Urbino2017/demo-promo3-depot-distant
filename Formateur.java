public class Formateur{
	private String nom; 
	private String prenm; 
	private int matricule; 
	
	public Formateur(){}
	// Contructeur avec deux parametres
	public Formateur(String nom, String prenom){
		this.nom=nom; 
		this.prenom=prenom; 
	}
	
		// Contructeur avec 1 parametres
	public Formateur(String nom){
		this.nom=nom; 

	}

	// Ajout des Ascesseurs
public String getNom(){
	return this.nom;
	
}

public String getPrenom(){
	return this.prenom; 
}

public int getMatricule(){
	return this.matricule; 
}
// Ajout des modificateurs

public void setNom(String nom){
	return this.nom= nom; 
}
public void setPrenom(String prenom){
	return this.prenom=prenom;
}

public void setAnneExperience(int a){
	this.anneExperience=a; 

}
// Un test de manipulation
}