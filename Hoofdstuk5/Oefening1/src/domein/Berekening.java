package domein;

public class Berekening {
	
	private int x;
	private int y;

	public Berekening(int x, int y) {
		setX(x);
		setY(y);
	}
	
	public String geefSom() {
		return "De som van " + getX() + " en " + getY() + " is " + (getX()+getY());
	}
	
	public String geefVerschil() {
		return "Het verschil tussen " + getX() + " en " + getY() + " is " + (getX()-getY());
	}
	
	public String geefProduct() {
		return "Het product van " + getX() + " en " + getY() + " is " + (getX()*getY());
	}
	
	public String geefQuotient() {
		if (getY() == 0) {
			return "Fout: deling door nul";
		} else {
			return "Het quotiënt van " + getX() + " en " + getY() + " is " + (getX()/getY());
		}
		
	}
	
	
	public int getX() {
		return x;
	}

	private void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	private void setY(int y) {
		this.y = y;
	}

}
