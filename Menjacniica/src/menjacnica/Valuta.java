package menjacnica;

public class Valuta {

	private String imeValute;
	private String skracenoIme;

	public String getImeValute() {
		return imeValute;
	}

	public void setImeValute(String imeValute) {
		if (imeValute == null || imeValute.isEmpty())
			throw new RuntimeException("Morate uneti imeValute");
		this.imeValute = imeValute;
	}

	public String getSkracenoIme() {
		return skracenoIme;
	}

	public void setSkracenoIme(String skracenoIme) {
		if (skracenoIme == null || skracenoIme.isEmpty())
			throw new RuntimeException("Morate uneti skraceno ime");
		this.skracenoIme = skracenoIme;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((imeValute == null) ? 0 : imeValute.hashCode());
		result = prime * result
				+ ((skracenoIme == null) ? 0 : skracenoIme.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valuta other = (Valuta) obj;
		if (imeValute == null) {
			if (other.imeValute != null)
				return false;
		} else if (!imeValute.equals(other.imeValute))
			return false;
		if (skracenoIme == null) {
			if (other.skracenoIme != null)
				return false;
		} else if (!skracenoIme.equals(other.skracenoIme))
			return false;
		return true;
	}

	public String toString() {
		return "Valuta [imeValute=" + imeValute + ", skracenoIme="
				+ skracenoIme + "]";
	}

}