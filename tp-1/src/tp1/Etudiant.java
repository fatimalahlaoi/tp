package tp1;

/**
 * @author Lahlaoi fatima ezzahra
 *
 */
public class Etudiant {

	String nom;
	String email;
	Integer nummerEtudiant;
	public Etudiant(String a,String b, Integer c){
		a=this.nom;
		b=this.email;
		c=this.nummerEtudiant;}
	
	public Etudiant() {
		this.nom="lahlaoi";
		this.email="lahlaoi.a@gmail.com";
		this.nummerEtudiant=141235463325;
	}
	public String getnom() {
		return nom;
	}
	public int getnummerEtudiant() {
		return nummerEtudiant;
	}
	public String getemail() {
		return email;
	}
	public void setnom(String nom) {
		nom=this.nom;
	}
	public void setemail(String email) {
		email=this.email;
	}
	public void setnummerEtudiant(Integer num) {
		num=this.nummerEtudiant=;
	}
	public void affiche(Etudiant e) {
		System.out.println("le nom de l etudiant est : " + e.nom);
		System.out.println("l email de l etudiant est : " + e.email);
		System.out.println("le nummero  de l etudiant est : " + e.nummerEtudiant);
		
	}
		
	

	
	
}
