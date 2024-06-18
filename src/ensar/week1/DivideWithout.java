package ensar.week1;

public class DivideWithout {
    
    public static void main(String[] args) {
        
        withoutDivisionOperator(10, 10);
        withoutDivisionOperator(10, 0);
        withoutDivisionOperator(0, 0);
        
    }
    
    static void withoutDivisionOperator(int dividend, int divider) {
        
        int counter = 0;
        int container = 0;
        
        for (int i = 0; i < dividend; i++) {
            
            container += divider;
            
            if (container > dividend) {
                break;
            }
            
            counter++;
            
        }

        System.out.println(divider == 0 ? (dividend == 0 ? "Error" : "Infinity") : counter);
        
    }
    
}
