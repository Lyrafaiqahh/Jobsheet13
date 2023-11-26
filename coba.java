import java.util.Scanner;
public class coba {
    static void isianArray (int angka){
        Scanner sc = new Scanner(System.in);
            System.out.println("Masukkan input nilai :" );
            int arr = sc.nextInt();

            int array [] = new int [arr];
        
            for (int i = 0; i < array.length; i++){
                System.out.println(array[i]);
            }
        
    }

    static void tampilArray (int [] arr){
        for (int i = 0; i<array.length; i++){
            System.out.println(array[i] + " " );
        }
    }
}