package Basic;
import java.util.Scanner;
public class HavaSicaklikEtkinlik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Sıcaklık değerini girin: ");
        int heat = input.nextInt();
        if (heat < 5) {
            System.out.println("Kayak yapabilirmisiniz");
        } else if (heat <= 25) {
            if (heat <= 15) {
                System.out.println("Sinemaya gitmelisin");
            }

            if (heat >= 10) {
                System.out.println("Pikniğe gidebilirsin.");
            }
        } else {
            System.out.println("Yüzmeye gidebilirsin.");
        }
    }
}
