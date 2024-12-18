package singleton.singleton;

public class Chandan {

    private static Chandan chandan;

    private Chandan(){}

    public synchronized static Chandan getChandanObject(){
        if(chandan == null){
            chandan = new Chandan();
        }
        System.out.println("Chandan is created :) "+chandan.toString());
        return chandan;
    }
}
