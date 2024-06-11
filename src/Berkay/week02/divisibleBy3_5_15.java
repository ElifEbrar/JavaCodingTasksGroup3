package Berkay.week02;

public class divisibleBy3_5_15 {
    public static void main(String[] args) {

        divisibleby3515(100);







    }

    public static void divisibleby3515(int a){
        System.out.print("Divisible By 15- ");
        for (int i = 1; i < a+1; i++) {
            if (i%15==0){
                System.out.print(i+" ");
            }

            }
        System.out.println("");
        System.out.print("Divisible By 5- ");
        for (int i = 1; i < a+1; i++) {
            if (i%5==0&& i%15!=0){
                System.out.print(i+" ");

        }

        }
        System.out.println("");
        System.out.print("Divisible By 3- ");
        for (int i = 1; i < a+1; i++) {
            if (i%3==0 && i%15!=0){
                System.out.print(i+" ");
            }


        }





    }


}


