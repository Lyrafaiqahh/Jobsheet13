public class halo {
    public static void main(String[] args) {
        String[] namaMAHASISWA = { "Sari", "Rina", "Yani", "Dwi", "Lusi" };
            int[][] nilaiMAHASISWA = {
      { 20, 19, 25, 20, 10, 0, 10 },
      { 30, 30, 40, 10, 15, 20, 25 },
      { 5, 0, 20, 25, 10, 5, 45 },
      { 50, 0, 7, 8, 0, 30, 60 },
      { 15, 10, 16, 15, 10, 10, 5 }
  };

 System.out.printf("%-8s", "Nama");
        for (int i = 1; i <= nilaiMAHASISWA[0].length; i++) {
            System.out.printf("%-6s", "M - " + i);
        }
        System.out.println();

        for (int i = 0; i < namaMAHASISWA.length; i++) {
            System.out.printf("%-8s", namaMAHASISWA[i]);
            for (int j = 0; j < nilaiMAHASISWA[i].length; j++) {
                System.out.printf("%-6d", nilaiMAHASISWA[i][j]);
            }
            System.out.println();
        }
    }
}