package singleton.singleton;

public class Singleton {
    //1.  Make the instance variable static
     private static Singleton singleton;
    // 2. Make the constructor private
    private Singleton() {
    }

    // 3. Make the method access public
    //4. Make the method thread safe (Optional)
    public synchronized static Singleton getSingleton(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
    public  void showSingletonCreated(String message){
        System.out.println("Singleton is object is created with instance :- "+singleton.toString());
    }

}
