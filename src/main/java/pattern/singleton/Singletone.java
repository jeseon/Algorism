package pattern.singleton;


public class Singletone {
    private volatile static  Singletone singletone;
    
    private Singletone() {}
    
    public static Singletone getInstance() {
        if (singletone == null) {
            synchronized (Singletone.class) {
                if (singletone == null) {
                    singletone = new Singletone();
                }
            }
        }
        
        return singletone;
    }

    public static void main(String[] args) {
        Singletone s1 = Singletone.getInstance();
        Singletone s2 = Singletone.getInstance();
        Singletone s3 = Singletone.getInstance();
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
