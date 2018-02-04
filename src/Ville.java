
public class Ville {

	private String nomVille ; // Stocke le nom de la ville
	private String nomPays ; // Stocke le nom du pays
	private int nbreHabitants ; // Stocke le nombre d'habitants
	private char categorie ; // Catégorie de la ville
	private static int nbreInstances = 0 ; // Nombre d'instances de la classe Ville
	
	public Ville() {
		System.out.println("Création d'une ville !");
		this.nomVille = "inconnu";
		this.nomPays = "inconnu";
		this.nbreHabitants = 0;
		this.setCategorie();
		nbreInstances++;
	}
	
	public Ville(String pNom, int pNbre, String pPays) {
		System.out.println("Création d'une ville avec des paramètres !");
		this.nomVille = pNom;
		this.nomPays =  pPays;
		this.nbreHabitants = pNbre;
		this.setCategorie();
		nbreInstances++;
	}
	
	// Accesseurs
	
	public String getNom() {
		return nomVille ;
	}
	
	public String getNomPays() {
		return nomPays ;
	}
	
	public int getNombreHabitants() {
		return nbreHabitants ;
	}
	
	public char getCategorie() {
		return categorie ;
	}
	
	public static int getNombreInstances() {
		return nbreInstances;
	}
	
	// Mutateurs
	
	public void setNom(String pNom) {
		nomVille = pNom;
	}
	
	public void setNomPays(String pPays) {
		nomPays = pPays;
	}
	
	public void setNombreHabitants(int pNbre) {
		nbreHabitants = pNbre;
		this.setCategorie();
	}
	
	private void setCategorie() {
		int bornesSuperieures[] = {0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000};
	    char categories[] = {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
	    int i = 0;
	    while(this.nbreHabitants > bornesSuperieures[i] && i < bornesSuperieures.length) {
	    	i++;
	    }
	    this.categorie = categories[i];
	}
	
	// Retourne la description de la ville
	public String decristToi() {
		return this.nomVille+", "+this.nomPays+", est une ville de "+this.nbreHabitants+" habitants."
				+"\nCatégorie : "+this.categorie;
	}
	
	// Retourne une chaîne de caractères selon le résultat de la comparaison
	public String comparer(Ville v) {
		String str = new String();
		if(v.getNombreHabitants()<this.nbreHabitants)
			str = this.nomVille+" est une ville plus peuplée que "+v.getNom();
		else
			str = v.getNom()+" est une ville plus peuplée que "+this.nomVille;
		return str;
	}
}
