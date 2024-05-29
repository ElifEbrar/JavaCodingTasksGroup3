package Berkay.Week_1;

public class finra {
    public static void main(String[] args) {
        //hello

        for (int i = 1; i <31 ; i++) {
            if (i%15==0){
                System.out.print("FINRA ");
            } else if (i%3==0) {
                System.out.print("FIN ");

            } else if (i%5==0) {
                System.out.print("RA ");

            }else
             System.out.print(i+" ");

        }


    }

    //public static String finra(){


}
