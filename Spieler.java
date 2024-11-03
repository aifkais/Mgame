import java.util.ArrayList;

public class Spieler {

	
	private String name = "";
	private ArrayList <Integer> wuerfel= new ArrayList<>();
	private int sterne = 0;
	private ArrayList <Integer> deBuffs= new ArrayList<>();
	private Feld f1  = new Feld(0,sterne, name, null, null);
	

	
	
	
	public Spieler(String name, ArrayList<Integer> wuerfel, int sterne, ArrayList<Integer> deBuffs, Feld f1) {
		super();
		this.name = name;
		this.wuerfel = wuerfel;
		this.sterne = sterne;
		this.deBuffs = deBuffs;
		this.f1 = f1;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the wuerfel
	 */
	public ArrayList<Integer> getWuerfel() {
		return wuerfel;
	}
	/**
	 * @param wuerfel the wuerfel to set
	 */
	public void setWuerfel(ArrayList<Integer> wuerfel) {
		this.wuerfel = wuerfel;
	}
	/**
	 * @return the sterne
	 */
	public int getSterne() {
		return sterne;
	}
	/**
	 * @param sterne the sterne to set
	 */
	public void setSterne(int sterne) {
		this.sterne = sterne;
	}
	/**
	 * @return the deBuffs
	 */
	public ArrayList<Integer> getDeBuffs() {
		return deBuffs;
	}
	/**
	 * @param deBuffs the deBuffs to set
	 */
	public void setDeBuffs(ArrayList<Integer> deBuffs) {
		this.deBuffs = deBuffs;
	}
	/**
	 * @return the f1
	 */
	public Feld getF1() {
		return f1;
	}
	/**
	 * @param f1 the f1 to set
	 */
	public void setF1(Feld f1) {
		this.f1 = f1;
	}

	

}
