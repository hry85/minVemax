import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,sayi,max=0,min=0;

        System.out.print("Kac tane sayi gireceksiniz : ");

        n=sc.nextInt();

        for (int i=1;i<=n;i++){
            System.out.print(i+ " . sayiyi giriniz: ");
            sayi= sc.nextInt();

            if (sayi>max){
                if (min == 0){
                    min = sayi;
                }
                    max = sayi;

            }
            if (sayi<min){
                if (max == 0) {
                    max = sayi;
                }
                    min = sayi;
                }
            }
            System.out.println("En buyuk sayi : " +max);
            System.out.println("En kucuk sayi : " +min);
        }
    }

