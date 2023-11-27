import java.util.Scanner;
public class Kubus15 {
    
    static int hitungVolume (int s){
        int Volume = s*s*s;
        return Volume;
    }

    static int hitungLuasPermukaan (int s){
        int LuasPermukaan = 6*(s*s);
        return LuasPermukaan;
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int s, vol, luasPer;

        System.out.print("Masukkan sisi kubus : ");
        s = input.nextInt();

        // dengan fungsi
        System.out.println("\n--DENGAN FUNGSI--");
        vol = hitungVolume(s);
        System.out.println("Volume kubus adalah " + vol );
        luasPer = hitungLuasPermukaan(s);
        System.out.println("Luas Permukaan kubus adalah " + luasPer ) ;

        // tanpa fungsi
        System.out.println("\n--TANPA FUNGSI--");
        vol = s*s*s;
        System.out.print("Volume kubus adalah " +vol);
        luasPer = 6*(s*s);
        System.out.println("\nLuas permukaan kubus adalah "+luasPer);
       
    }
}


