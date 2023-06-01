import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int selection = 1;
        while(selection != 0){
            System.out.println("Çıkış yapmak İçin: 0");
            System.out.println("Rehbere Kayıt Eklemek İçin: 1");
            System.out.println("Rehberden Kayıt Silmek İçin: 2");
            System.out.println("Rehberi Görüntülemek İçin: 3");
        }

        HashMap<String,String> directory = new HashMap<String, String>();

        System.out.print("Lütfen isim giriniz: ");
        String name = scan.nextLine();
        System.out.print("Lütfen Numara giriniz: ");
        String number = scan.nextLine();

        directory.put(name,number);



    }
}