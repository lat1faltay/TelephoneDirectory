import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int selection = -1;

        PersonList personList = new PersonList();
        Scanner scanner = new Scanner(System.in);

        while(selection != 0){
            System.out.println();
            System.out.println("Çıkış yapmak İçin: 0");
            System.out.println("Rehbere Kayıt Eklemek İçin: 1");
            System.out.println("Rehberden Kayıt Silmek İçin: 2");
            System.out.println("Rehberi Görüntülemek İçin: 3");
            selection = scanner.nextInt();

            if(selection == 1){
                personList.ekle();
            } else if (selection == 2) {
                personList.sil();
            } else if (selection == 3) {
                personList.yazdir();
            }else if (selection > 3){
                System.out.println("Hatalı sayı girişi yaptınız");
            }

        }
    }
}
