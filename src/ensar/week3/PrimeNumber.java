package ensar.week3;

public class PrimeNumber {

    public static void main(String[] args) {

        boolean result = isPrime(2);

        System.out.println(result);

    }

    static boolean isPrime(int num) {

        if (num == 2) {
            return true;
        }
        
        for (int i = 2; i < num; i++) {
            
            if (num % i == 0) {
                return false;
            }
            
        }
        
        return true;
        
    }

}
