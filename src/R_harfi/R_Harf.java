package R_harfi;
public class R_Harf {
    public static void main() {
        int height = 7; // R harfinin yüksekliği
        int width = 5;  // R harfinin genişliği

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {

                // İlk sütun veya üst ve orta yatay çizgiler
                if (j == 0 || (i == 0 || i == height / 2) && j < width - 1) {
                    System.out.print("*");
                }
                // Sağ dikey çizgi
                else if (j == width - 1 && i > 0 && i < height / 2) {
                    System.out.print("*");

                }
                // Sağ alt diyagonal çizgi
                else if (i > height / 2 && i - j == height / 2 - 1) {
                    System.out.print("*");
                }
                // Boşluklar
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
