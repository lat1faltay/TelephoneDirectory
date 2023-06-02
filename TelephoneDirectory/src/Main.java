import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int selection = -1;
        while(selection != 0){
            selection = scan.nextInt();
            if(selection == 0){
                System.out.println("Çıkış yapmak İçin: 0");
            }else if(selection == 1){
                System.out.println("Rehbere Kayıt Eklemek İçin: 1");
            }else if(selection == 2){
                System.out.println("Rehberden Kayıt Silmek İçin: 2");
            }else if(selection == 3){
                System.out.println("Rehberi Görüntülemek İçin: 3");
            }
        }
    }
}