import java.util.Scanner;

class Zadanie1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj haslo");
        String haslo = sc.nextLine();
        int dlugosc = haslo.length();
        String pierwszeHaslo = haslo.substring(0, dlugosc);
        System.out.println("Powtórz haslo");
        haslo = sc.nextLine();
        dlugosc = haslo.length();
        dlugosc = haslo.length();
        String drugieHaslo = haslo.substring(0, dlugosc);

        if (pierwszeHaslo.equals(drugieHaslo)) {
            System.out.println("Hasla sa poprawne");

        } else {
            System.out.println("Hasla sa rozne");
        }

    }
}