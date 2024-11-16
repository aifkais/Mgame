import java.util.ArrayList;

public class FieldLib {

    // Initialisierung der ArrayList
    private ArrayList<Feld> f1 = new ArrayList<>();
    private int x = 0;
    private int y = 0;
    private int maxx = 0;
    private int maxy= 0;
    private int ny = 0;
    private int nx = 0;
    private int s = 0;
    
    

    public FieldLib() {
        // Der Konstruktor bleibt leer, es sei denn, du m�chtest etwas initialisieren
    }

    
    public static void main(String[] args) {
    	
		FieldLib fl1 = new FieldLib();
		fl1.field1();
		fl1.printField2();
        //ArrayList<String> map = new ArrayList<>();
        ArrayList<Feld> f2 = new ArrayList<>();
        String [][] map = new String[21][17];
        System.out.println("start");
        for (int i = 0; i < fl1.f1.size(); i++){
            System.out.println(fl1.f1.get(i).getX() +" + "+fl1.f1.get(i).getY());
        }
        System.out.println(fl1.ny +" "+fl1.nx);
        for (int i = 0; i < 21; i++){
            for (int e = 0; e< 17;e++){
                map[i][e] = "O";
                System.out.print(map[i][e]+"   ");
            }
            System.out.println();
        }
		fl1.fieldtoMap(fl1.f1, map);
        for (int i = 0; i < 21; i++){
            for (int e = 0; e< 17;e++){
                System.out.print(map[i][e]+"   ");
            }
            System.out.println();
        }
	}
    
    public void field1() {
        // F�lle die ArrayList mit 30 neuen `Feld`-Objekten
        /*int a = 0;
        for (int i = 0; i < 27; i++) {
            f1.add(new Feld(a,1,0,0, ">", new ArrayList<Feld>(),new ArrayList<Feld>()));
            a++;
        }
        for (int i = 0; i < 5; i++) {
            f1.add(new Feld(a,1,0,0, "<", new ArrayList<Feld>(),new ArrayList<Feld>()));
            a++;
        }
        for (int i = 0; i < 5; i++) {
            f1.add(new Feld(a,1,0,0, "^", new ArrayList<Feld>(),new ArrayList<Feld>()));
            a++;
        }
        for (int i = 0; i < 5; i++) {
            f1.add(new Feld(a,1,0,0, "v", new ArrayList<Feld>(),new ArrayList<Feld>()));
            a++;
        }
        a++;
        */
        //street2(24,24,"^");// =1 Schritt
        //street2(0,1,">");// =2 Schritt
       
        

    }
    public void street4(ArrayList <Feld> f1, int x , int y , int xl, int yl){
        for(int i = 0; i < xl; i++){
            for (int e = 0 ; e < yl ; e++){
                f1.add(new Feld(0,1,x+i,y+e, ">", new ArrayList<Feld>(),new ArrayList<Feld>()));

            }
        }
    }



    public void fieldtoMap( ArrayList <Feld> f1, String[][] m1){
        System.out.println(m1.length);
        System.out.println(f1.size());
        for (int i = 0; i < f1.size(); i++){
            m1[f1.get(i).getX()][f1.get(i).getY()]=f1.get(i).getDirection();
        }
    }


    public void printField() {
        x = 0;
        
        nx = 0;
        maxx =0;
        ny = 0;
        y = 0;
        maxy = 0;
        
        for (int i = 0; i<f1.size(); i++) {
        	System.out.println(f1.get(i).getDirection());
        	if (f1.get(i).getDirection().equals(">")){
                if(x==maxx){
                    x++;
                
                    maxx++;
                }else{
                    x++;
                }
                
            } else if(f1.get(i).getDirection().equals("^")){
                if(y==maxy){
                    y++;
                    maxy++;
                } else{
                    y++;
                }
                
            }else if (f1.get(i).getDirection().equals("<")){
                if(x==0){
                    maxx++;
                    x++;

                }
            }else if (f1.get(i).getDirection().equals("v")){
                if(y==0){
                    maxy ++;
                    y++;
                }
            }
        }
    }

    public void printField2() {
        x = 0;
        
        nx = 0;
        maxx =0;
        ny = 0;
        y = 0 ;
        maxy = 0;
        System.out.println("Hallllo");
        for (int i = 0; i<f1.size(); i++) {
        	System.out.println(f1.get(i).getDirection());
        	if (f1.get(i).getDirection().equals(">")){
                x++;
                f1.get(i).setX(x);
                f1.get(i).setY(y);
                
                
                
            } else if(f1.get(i).getDirection().equals("^")){
                y++;
                f1.get(i).setX(x);
                f1.get(i).setY(y);
            }else if (f1.get(i).getDirection().equals("<")){
                x--;
                if(x<this.getNx()){
                    this.setNx(x);;
                }
                f1.get(i).setX(x);
                f1.get(i).setY(y);                
            }else if (f1.get(i).getDirection().equals("v")){
                y--;
                if(y<this.getNy()){
                    this.setNy(y);
                }
                f1.get(i).setX(x);
                f1.get(i).setY(y);                
            }
        }
    }


    public void isyZero(int y, Feld f1){
    }

    public void street2(int start, int end, String dir){
        for (int i = start; i < end+1; i++) {
            f1.get(i).setDirection(dir); // Setze die Richtung f�r das Feld
            
        }
    }

    public void street3(int step, String dir){
        setS(getS()+1);
        for (int i = getS(); i < getS()+step; i++) {
            f1.get(i).setDirection(dir); // Setze die Richtung f�r das Feld
            
        }
        
    }  
    public void street( int start, int end, String dir) {
        for (int i = start; i < end+1; i++) {
            f1.get(i).setDirection(dir); // Setze die Richtung f�r das Feld
            if(i>0&&i != end) {
				f1.get(i).getNext().add(f1.get(i+1));
				f1.get(i).getPrev().add(f1.get(i-1));
				System.out.println(1);
			}
			else if(i ==0) {
				f1.get(i).getNext().add(f1.get(i+1));
				System.out.println(2);
			} else if(i ==f1.size()) {
				f1.get(i).getPrev().add(f1.get(i-1));
				System.out.println(3);
			}
            
        }
    }


    public ArrayList<Feld> getF1() {
        return f1;
    }


    public int getX() {
        return x;
    }


    public int getY() {
        return y;
    }


    public int getMaxx() {
        return maxx;
    }


    public int getMaxy() {
        return maxy;
    }


    public int getNy() {
        return ny;
    }


    public int getNx() {
        return nx;
    }

    public void setF1(ArrayList<Feld> f1) {
        this.f1 = f1;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setMaxx(int maxx) {
        this.maxx = maxx;
    }

    public void setMaxy(int maxy) {
        this.maxy = maxy;
    }

    public void setNy(int ny) {
        this.ny = ny;
    }

    public void setNx(int nx) {
        this.nx = nx;
    }

    public int getS() {
        return s;
    }


    public void setS(int s) {
        this.s = s;
    }
}
