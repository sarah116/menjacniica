package menjacnica;

import java.util.LinkedList;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {

	LinkedList<Datum> datumi = new LinkedList<Datum>();

	public void dodajKurs(String dan, int prodajni, int kupovni, int srednji) {
		Datum d = new Datum();
		d.setKupovniKurs(kupovni);
		d.setProdajniKurs(prodajni);
		d.setSrednjiKurs(srednji);
		d.setDatumKursa(dan);
		datumi.add(d);
	}

	public void obrisiKurs(String dan) {
		for (int i = 0; i < datumi.size(); i++)
			if (datumi.get(i).getDatumKursa().equals(dan))
				datumi.remove(i);

	}

	public String vratiKurs(String dan) {
		String kursevi=null;
		for (int i = 0; i < datumi.size(); i++)
			if (datumi.get(i).getDatumKursa().equals(dan))
				kursevi = "Kupovni kurs: " + datumi.get(i).getKupovniKurs()
						+ "Prodajni kurs: " + datumi.get(i).getProdajniKurs()
						+ "Srednji kurs: " + datumi.get(i).getSrednjiKurs();
		return kursevi;
	}

}
