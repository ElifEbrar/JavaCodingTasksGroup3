package ensar.week2;

public class DivisibleBy {
    public static void main(String[] args) {
        StringBuilder by3 = new StringBuilder();
        StringBuilder by5 = new StringBuilder();
        StringBuilder by15 = new StringBuilder();

        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0) {
                by3.append(i).append(" ");
            } 
            if (i % 5 == 0) {
                by5.append(i).append(" ");
            } 
            if (i % 15 == 0) {
                by15.append(i).append(" ");
            }
        }

        System.out.println("Divisible By 15 " + by15);
        System.out.println("Divisible By 5 " + by5);
        System.out.println("Divisible By 3 " + by3);
    }
}
