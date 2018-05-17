public class Formateur{
	private String nom; 
	private String prenm; 
	private int matricule; 
	
	public Formateur{}

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
}