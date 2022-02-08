import java.util.Scanner;
import java.util.Random;

class Milionerzy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] pytania = new String[10];
        Random rand = new Random();
        pytania[0] = "Ilu sasiadow ma Polska?";
        pytania[1] = "Największy ocean na Ziemi to?";
        pytania[2] = "Stolicą Stanów Zjednoczonych Ameryki jest?";
        pytania[3] = "Na tablicy Mendelejewa symbolem P oznaczony jest?";
        pytania[4] = "Stal jest stopem, jakich pierwiastków?";
        pytania[5] = "Na jakim kontynencie leżą Malediwy?";
        pytania[6] = "Rozwiąż zadanie: - 7 - (5 - 24) = ?";
        pytania[7] = " W którym rozbiorze Polski nie brała udziału Austria?";
        pytania[8] = "Ilu graczy liczy drużyna hokeja grająca  na lodzie? ";
        pytania[9] = "Jaki wynik uzyskamy z działania 50 - (50 - 5*5) - 125:5";

        for (int petla = 0; petla < 5; petla++) {
            int losowaniepytania = rand.nextInt(6);
            System.out.println(pytania[losowaniepytania]);

        }

    }
}