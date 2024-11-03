import java.util.ArrayList;

public class MainGame {
	
	private ArrayList<Spieler> spielerq = new ArrayList<>();
	private ArrayList<Integer> wuerfelq = new ArrayList<>();
	private int endflag = 0;
	
	
	public static void main(String[] args) {
		System.out.println("Hello");
		MainGame g1 = new MainGame();
		//(Feldart,Feldrichtung,PrevArrayList, NextArrayList)
		//(1,>)
		ArrayList<Feld> sF = new ArrayList<Feld>();
		g1.initField(sF);
		Spieler sp1 = new Spieler("Mario", new ArrayList<>(), 0, new ArrayList<>(),null);
		Spieler sp2 = new Spieler("Toad", new ArrayList<>(), 0, new ArrayList<>(), null);
		Spieler sp3 = new Spieler("Peach", new ArrayList<>(), 0, new ArrayList<>(), null);
		Spieler sp4 = new Spieler("Lugi", new ArrayList<>(), 0, new ArrayList<>(), null);
		g1.spielerq.add(sp1);
		g1.spielerq.add(sp2);
		g1.spielerq.add(sp3);
		g1.spielerq.add(sp4);
		
		g1.game();
		
		
		
		
		
	}
	
	private void initField(ArrayList<Feld> sF) { //sF = Spielfeld, Spielfeld = Liste aus Feld
		sF.add(new Feld(1,1,">", null, null));
		sF.add(new Feld(1,1,">", null, null));
		
	}

	private void game() {
		
		do {
			for(int i = 0; i < spielerq.size(); i++) {
				
				turn(spielerq.get(i));
			}
			
			
		} while(endflag == 1);
		
	}
	
	
	private void turn(Spieler sp) {
		dice(sp.getWuerfel());
		move();
		event();
		
		
	}
	
	
	private void dice(ArrayList<Integer> wuerfel) {
		
	}
	
	
	private void move() {
		
	}
	
	private void event() {
		
	}
	
}
