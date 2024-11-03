import java.util.ArrayList;

public class Feld {
	
	private int index = 0;
	private int feldArt = 0;
	private String direction = ">";
	private ArrayList <Feld> prev = new ArrayList <>();
	private ArrayList <Feld> next = new ArrayList <>();
	
	
	
	public Feld(int index ,int feldArt, String direction, ArrayList<Feld> prev, ArrayList<Feld> next) {
		this.index = index;
		this.feldArt = feldArt;
		this.direction = direction;
		this.prev = prev;
		this.next = next;
	}
	
	/**
	 * @return the feldArt
	 */
	public int getFeldArt() {
		return feldArt;
	}
	/**
	 * @param feldArt the feldArt to set
	 */
	public void setFeldArt(int feldArt) {
		this.feldArt = feldArt;
	}
	/**
	 * @return the direction
	 */
	public String getDirection() {
		return direction;
	}
	/**
	 * @param direction the direction to set
	 */
	public void setDirection(String direction) {
		this.direction = direction;
	}
	/**
	 * @return the prev
	 */
	public ArrayList<Feld> getPrev() {
		return prev;
	}
	/**
	 * @param prev the prev to set
	 */
	public void setPrev(ArrayList<Feld> prev) {
		this.prev = prev;
	}
	/**
	 * @return the next
	 */
	public ArrayList<Feld> getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(ArrayList<Feld> next) {
		this.next = next;
	}

	/**
	 * @return the index
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * @param index the index to set
	 */
	public void setIndex(int index) {
		this.index = index;
	}
	
	

}
