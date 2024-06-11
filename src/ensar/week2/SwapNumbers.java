package ensar.week2;

public class SwapNumbers {
    
    public static void main(String[] args) {
        
        int num1 = 1, num2 = 10;
        
        num1 = num2 - num1;
        num2 = num2 - num1;
        num1 = num1 + num2;

        System.out.println(num1 + " | " + num2);        
        
    }
    
}
