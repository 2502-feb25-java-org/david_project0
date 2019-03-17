public class Customer{

    private String name;
    private int age;
    private double weight;
    private final String planet;
    private static double gravity;

    public Customer(){

    }

    public Customer(String name){
        this.name = name;
        this.weight = 12.0;
        this.age = 220;        
    }

    public static String speak(String s){
        return "hello, " + s; 
    }

    public static void main(String[] args) {
            
    }
}