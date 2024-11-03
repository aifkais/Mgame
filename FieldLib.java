import java.util.ArrayList;

public class FieldLib {

    // Initialisierung der ArrayList
    private ArrayList<Feld> f1 = new ArrayList<>();
    
    

    public FieldLib() {
        // Der Konstruktor bleibt leer, es sei denn, du möchtest etwas initialisieren
    }

    
    public static void main(String[] args) {
    	
		FieldLib fl1 = new FieldLib();
		fl1.field1();
		fl1.printField();
		
	}
    
    public void field1() {
        // Fülle die ArrayList mit 30 neuen `Feld`-Objekten
        for (int i = 0; i < 30; i++) {
            f1.add(new Feld(i,1, "-", new ArrayList<Feld>(),new ArrayList<Feld>()));
        }
        street(0,12,">");
        street(13,14,"^");
        
        System.out.println();

    }

    public void printField() {
        for (int i = 0; i<f1.size(); i++) {
        	System.out.println(f1.get(i).getDirection());
        	
        }
    }
    
    public void street( int start, int end, String dir) {
        for (int i = start; i < end+1; i++) {
            f1.get(i).setDirection(dir); // Setze die Richtung für das Feld
            if(i>0&&i != end) {
				f1.get(i).getNext().add(f1.get(i+1));
				f1.get(i).getPrev().add(f1.get(i-1));
				System.out.println(1);
			}
			else if(i ==0) {
				f1.get(i).getNext().add(f1.get(i+1));
				System.out.println(2);
			} else if(i ==end) {
				f1.get(i).getPrev().add(f1.get(i-1));
				System.out.println(3);
			}
            
        }
    }
}
