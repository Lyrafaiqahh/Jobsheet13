import java.util.Scanner;
public class Percobaan615 {
    
    static int hitungLuas (int pjg, int lb){
        int Luas = pjg*lb;
        return Luas;
    }

    static int hitungVolume (int tinggi, int a, int b){
        int volume = hitungLuas(a, b)* tinggi;
        return volume;
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p,l,t,L,vol;

        System.out.print("Masukkan panjang : ");
        p = input.nextInt();
        System.out.print("Masukkan lebar : ");
        l = input.nextInt();
        System.out.print("Masukkan tinggi : ");
        t = input.nextInt();

        // dengan fungsi
        System.out.println("--DENGAN FUNGSI--");
        L=hitungLuas(p, l);
        System.out.println("Luas Persegi Panjang adalah " +L);
        vol = hitungVolume(t, p, l);
        System.out.println("Volume balok adalah " + vol);

        // tanpa fungsi
        System.out.println("------------------------------------------");
        System.out.println("--TANPA FUNGSI--");
        L=p*l;
        System.out.print("Luas Persegi panjang adalah " +L);

        vol = p*l*t;
        System.out.println("\nVolume balok adalah "+vol);
    }
}
