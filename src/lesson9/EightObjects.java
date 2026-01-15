package lesson9;

public class EightObjects {

    void createObjects(){
        EightObjects o4 = new EightObjects();
        EightObjects o5 = new EightObjects();
        EightObjects o6 = new EightObjects();
    }

    
    public static void main(String[] args) {
        EightObjects o1 = new EightObjects();
        EightObjects o2 = new EightObjects();
        EightObjects o3 = new EightObjects();
        o3 = new EightObjects();
        o3 = new EightObjects();
        o2 = null;        
        o1.createObjects();

    }

}
