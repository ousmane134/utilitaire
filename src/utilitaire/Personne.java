package utilitaire;

public class Personne {
	
	private int m_age;
	private String m_nom;
	private String m_prenom;
	private char m_sexe;
	public static int nombre;
	private static int nombre_homme;
	private static int nombre_femme;
	private static int nombre_ni_femme_ni_femme;
	
	Personne(int age, String nom, String prenom, char sexe) {
		m_age = age;
		m_nom = nom;
		m_prenom = prenom;
		m_sexe = sexe;

	
		nombre++;
		if(sexe == 'M') {
			System.out.println("Il s'Agit s'un homme");
			nombre_homme++;
			m_sexe = 'm';
			
		}
		else if (sexe == 'F') {
			System.out.println("Il s'agit d'une femme");
			nombre_femme++;
			m_sexe = 'f';
			
		}
		else {
			System.out.print("La personne ne s'identifie pas comme un homme ni une femme");
			nombre_ni_femme_ni_femme++;
			m_sexe = 'u';
			
		}
	}
	
	Personne(String nom, String prenom) {
		m_nom = nom;
		m_prenom = prenom;

		m_sexe = 'u';
		nombre++;
		nombre_ni_femme_ni_femme++;
	}

	@Override
	public String toString() {
		return "Personne [m_age:" + m_age + ", m_nom:" + m_nom + ", m_prenom:" + m_prenom + ", m_sexe:" + m_sexe
				 + super.toString() + "]";
	}

	public int getM_age() {
		return m_age;
	}

	public void setM_age(int m_age) {
		this.m_age = m_age;
	}

	public String getM_nom() {
		return m_nom;
	}

	public void setM_nom(String m_nom) {
		this.m_nom = m_nom;
	}

	public String getM_prenom() {
		return m_prenom;
	}

	public void setM_prenom(String m_prenom) {
		this.m_prenom = m_prenom;
	}

	public char getM_sexe() {
		return m_sexe;
	}

	public void setM_sexe(char m_sexe) {
		this.m_sexe = m_sexe;
	}

	public static int getNombre() {
		return nombre;
	}

	public static void setNombre(int nombre) {
		Personne.nombre = nombre;
	}

	public static int getNombre_homme() {
		return nombre_homme;
	}

	public static void setNombre_homme(int nombre_homme) {
		Personne.nombre_homme = nombre_homme;
	}

	public static int getNombre_femme() {
		return nombre_femme;
	}

	public static void setNombre_femme(int nombre_femme) {
		Personne.nombre_femme = nombre_femme;
	}

	public static int getNombre_ni_femme_ni_femme() {
		return nombre_ni_femme_ni_femme;
	}

	public static void setNombre_ni_femme_ni_femme(int nombre_ni_femme_ni_femme) {
		Personne.nombre_ni_femme_ni_femme = nombre_ni_femme_ni_femme;
	}

}
