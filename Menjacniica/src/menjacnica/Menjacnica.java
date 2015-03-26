package menjacnica;

import java.util.LinkedList;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {

	LinkedList<Datum> datumi = new LinkedList<Datum>();

	public void dodajKurs(String dan, int prodajni, int kupovni, int srednji) {
		Datum dat = new Datum();
		dat.setKupovniKurs(kupovni);
		dat.setProdajniKurs(prodajni);
		dat.setSrednjiKurs(srednji);
		dat.setDatum(dan);

		datumi.add(dat);

	}

	public void obrisiKurs(String dan) {
		for (int i = 0; i < datumi.size(); i++)
			if (datumi.get(i).getDatum().equals(dan))
				datumi.remove(datumi.get(i));

	}

	public String vratiKurs(String dan) {
		String kursevi = null;
		for (int i = 0; i < datumi.size(); i++)
			if (datumi.get(i).getDatum().equals(dan))
				kursevi = "Prodajni: " + datumi.get(i).getProdajniKurs()
						+ " Kupovni:" + datumi.get(i).getKupovniKurs()
						+ " Srednji:" + datumi.get(i).getSrednjiKurs();
		return kursevi;
	}

}
