import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int selection = -1;

        //PersonNode personNode = new PersonNode();
        Scanner scanner = new Scanner(System.in);

        while(selection != 0){
            System.out.println();
            System.out.println("Çıkış yapmak İçin: 0");
            System.out.println("Rehbere Kayıt Eklemek İçin: 1");
            System.out.println("Rehberden Kayıt Silmek İçin: 2");
            System.out.println("Rehberi Görüntülemek İçin: 3");
            selection = scanner.nextInt();
        }
    }
}
