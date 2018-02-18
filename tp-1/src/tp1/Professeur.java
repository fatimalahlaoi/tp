package tp1;

public class Professeur {
	
String nom;
Integer nummerSomme;
String email;
String grade;
	public Professeur(String a, Integer b,String c, String d ) {
		a=this.nom;
		b=this.nummerSomme;
		c=this.email;
		d=this.grade;
		
	}
	public Professeur() {
		this.nom="lahlaoi";
		this.nummerSomme=0;
		this.email="lahlaoi.f@gmail.com";
		this.grade="chef de departement";
	}
	public String getnom() {
		return nom;
	}
	public String getgrade() {
		return grade;
	}
	public String getemail() {
		return email;
	}
	public Integer getnummerSomme() {
		return nummerSomme;
	}
	public void setnom(String nom) {
		nom=this.nom;
	}
	public void setemail(String email) {
		email=this.email;
	}
	public void setnummerSomme(Integer nummerSomme) {
		nummerSomme=this.nummerSomme;
	}
	public void setgrade(String grade) {
	grade=this.grade;
	}
	public void affiche(Professeur p) {
		System.out.println("le nom du professeur est : " + p.nom);
		System.out.println("l email du professeur est : " + p.email);
		System.out.println("le numero est : " + p.nummerSomme);
		System.out.println("le grade est : " + p.grade);
		
	}
		
}






