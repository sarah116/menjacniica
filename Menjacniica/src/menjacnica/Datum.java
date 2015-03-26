package menjacnica;

public class Datum {

	private String datumKursa;
	private int prodajniKurs;
	private int kupovniKurs;
	private int srednjiKurs;

	public int getProdajniKurs() {
		return prodajniKurs;
	}

	public void setProdajniKurs(int prodajniKurs) {
		if (prodajniKurs <= 0)
			throw new RuntimeException("Kurs ne sme biti 0 ili manji");
		this.prodajniKurs = prodajniKurs;
	}

	public int getKupovniKurs() {
		return kupovniKurs;
	}

	public void setKupovniKurs(int kupovniKurs) {
		if (kupovniKurs <= 0)
			throw new RuntimeException("Kurs ne sme biti 0 ili manji");
		this.kupovniKurs = kupovniKurs;
	}

	public int getSrednjiKurs() {
		return srednjiKurs;
	}

	public void setSrednjiKurs(int srednjiKurs) {
		if (srednjiKurs <= 0)
			throw new RuntimeException("Kurs ne sme biti 0 ili manji");
		this.srednjiKurs = srednjiKurs;
	}

	public String toString() {
		return "Datum [datumKursa=" + datumKursa + ", prodajniKurs="
				+ prodajniKurs + ", kupovniKurs=" + kupovniKurs
				+ ", srednjiKurs=" + srednjiKurs + "]";
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((datumKursa == null) ? 0 : datumKursa.hashCode());
		result = prime * result + kupovniKurs;
		result = prime * result + prodajniKurs;
		result = prime * result + srednjiKurs;
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Datum other = (Datum) obj;
		if (datumKursa == null) {
			if (other.datumKursa != null)
				return false;
		} else if (!datumKursa.equals(other.datumKursa))
			return false;
		if (kupovniKurs != other.kupovniKurs)
			return false;
		if (prodajniKurs != other.prodajniKurs)
			return false;
		if (srednjiKurs != other.srednjiKurs)
			return false;
		return true;
	}

	public String getDatum() {
		return datumKursa;
	}

	public void setDatum(String datumKursa) {
		if(!datumKursa.contains("."))  throw new RuntimeException("Datum neispravno unet");
		this.datumKursa = datumKursa;
	}

	
}
