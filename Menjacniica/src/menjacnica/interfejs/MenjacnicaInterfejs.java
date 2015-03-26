package menjacnica.interfejs;

public interface MenjacnicaInterfejs {
	
	public void dodajKurs(String dan, int prodajni, int kupovni, int srednji);
	public void obrisiKurs(String dan);
	public int vratiKurs(String dan);
}
