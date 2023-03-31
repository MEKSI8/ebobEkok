import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("1. Sayı : ");
        int say1=input.nextInt();
        System.out.print("2. Sayı : ");
        int say2=input.nextInt();


        int i=1;
        int kucuk=0;
        int ebob=0;


        if (say1>say2){
            kucuk=say2;
        }else {
            kucuk=say1;
        }

        while (i<=kucuk){
            if (say1%i==0 && say2%i==0){
                ebob=i;
            }

            i++;
        }
        int ekok=(say1*say2)/ebob;
        System.out.println("Bu sayıların EBOB'u :"+ebob);
        System.out.println("Bu sayıların EKOK'u :"+ekok);



    }
}