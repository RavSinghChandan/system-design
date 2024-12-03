package singleton.singleton;

public class Singleton {
     private static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getSingleton(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
    public  void showSingletonCreated(String message){
        System.out.println("Singleton is object is created with instance :- "+singleton.toString());
    }

}
