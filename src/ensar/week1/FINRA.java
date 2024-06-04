package ensar.week1;

public class FINRA {
    public static void main(String[] args) {
        finra();
    }
    
    static void finra() {
        for (int i = 1; i < 31; i++) {
            String result = "";
            if (i % 3 == 0) {
                result += "FIN";
            } 
            if (i % 5 == 0) {
                result += "RA";
            }
            if (i % 3 != 0 && i % 5 != 0) {
                result = String.valueOf(i);
            }
            System.out.println(result);
        }
    }
}
