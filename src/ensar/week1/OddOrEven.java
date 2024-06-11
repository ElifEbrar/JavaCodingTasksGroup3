package ensar.week1;

public class OddOrEven {
    
    public static void main(String[] args) {
        
        System.out.println(identify(0));
        System.out.println(identify(1));
        
    }
    
    static String identify(int num) {
        String result = "";
        return num % 2 == 0 ? result = "Even" : "Odd";
    }
    
}
