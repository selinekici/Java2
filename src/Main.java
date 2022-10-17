public class Main {

    public static void main(String[] args) {
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();
    }
    public static void sayiBulmaca() {
            int[] numbers = new int[]{1, 2, 5, 7, 9, 0};
            int aranacak = 9;
            boolean varMi = false;

            for (int number : numbers) {
                if (number == aranacak) {
                    varMi = true;
                    break;
                }
            }

            String mesaj = "";
            if (varMi) {
                mesaj = "Sayi mevcuttur:" +aranacak;
                mesajVer(mesaj);
            } else {
                System.out.println("Sayi mevcut degildir: "+aranacak);
            }
        }
        public static void mesajVer(String mesaj){
            System.out.println(mesaj);
        }
}
