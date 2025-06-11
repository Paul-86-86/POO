package Autos;

public class Auto{
	
	private int auto;
	private int vel = 0;
	
	public Auto(int auto, int vel) {
		super();
		setVel(vel);
		setAuto(auto);
	}
	
	public int getAuto() {
		return auto;
	}
	public void setAuto(int auto) {
		this.auto = auto;
	}
	public int getVel() {
		return vel;
	}
	public void setVel(int vel) {
		this.vel = vel;
	}

}
