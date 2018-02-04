
class ClasseMain {

	public static void main(String[] args) {
		
		Ville V = new Ville("Lyon", 654, "France");
		System.out.println(Ville.getNombreInstances());
		
		Ville V2 = new Ville("Lille", 123, "France");
		System.out.println(Ville.getNombreInstances());
		
		Ville V3 = new Ville();
		System.out.println(Ville.getNombreInstances());
		
	}

}
