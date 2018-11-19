package utilitaire;

public class operation {
	
	private int m_a;
	private int m_b;
	operation(int a, int b) {
		m_a = a;
		m_b = b;
		
	}
	public int getM_a() {
		return m_a;
	}
	public void setM_a(int m_a) {
		this.m_a = m_a;
	}
	public int getM_b() {
		return m_b;
	}
	public void setM_b(int m_b) {
		this.m_b = m_b;
	}
	public int somme(int a, int b) {return a+b;};
	public int soustraction(int a, int b) {return a-b;};
	
	public int quotient(int a, int b) {
		if(b !=0) return a/b;
		else return 0;
		
		};
	public int modulo(int a, int b) {return a%b;};
	public int multiplication(int a, int b) {return a*b;};
	
	
		
		


}
