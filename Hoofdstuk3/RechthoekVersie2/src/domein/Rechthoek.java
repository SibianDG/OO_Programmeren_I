package domein;

public class Rechthoek {
	private double lengte;
	private double breedte;
	
	public Rechthoek(double lengthe, double breedte) {
		setBreedte(breedte);
		setLengte(lengthe);

	}
	
	public double berekenOmtrek(){
		return 2*(lengte+breedte);
	}
	
	public double berekenOppervlakte() {
		return lengte*breedte;
	}
	
	public final void setLengte(double lengte) {
		if (lengte > 0 && lengte < 20) {
			this.lengte = lengte;
		} else {
			this.lengte = 1;
		}
	}
	
	public final void setBreedte(double breedte) {
		if (breedte > 0 && breedte < 20) {
			this.breedte = breedte;
		} else {
			this.breedte = 1;
		}
	}

	public double getBreedte() {
		return breedte;
	}
	
	public double getLengte() {
		return lengte;
	}

}
