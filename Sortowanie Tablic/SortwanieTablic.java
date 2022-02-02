import java.util.Random;
import java.util.Arrays;

class SortowanieTablic {
    public static void main(String[] args) {
        Random r = new Random();
        int[] tab = new int[100];

        for (int i = 0; i < 100; i++) {
            tab[i] = r.nextInt(1000000) + 1;
        }

        for (int i = 0; i < 100; i++) {
            System.out.println(tab[i]);
        }
        long millisActualTime = System.currentTimeMillis();
        for (int i = 0; i < tab.length; i++) {
            for (int j = 1; j < tab.length; j++) {
                if (tab[j] < tab[j - 1]) {
                    int wieksza = tab[j - 1];
                    tab[j - 1] = tab[j];
                    tab[j] = wieksza;
                }
            }
        }
        long executionTime = System.currentTimeMillis() - millisActualTime;
        System.out.println("Sortowanie bąbelkowe czas wykonania: " + executionTime);

        int[] tabQuick = Arrays.copyOf(tab, tab.length);
        millisActualTime = System.currentTimeMillis();
        Arrays.sort(tabQuick);
        executionTime = System.currentTimeMillis() - millisActualTime;
        System.out.println("Sortowanie quicksort czas wykonania: " + executionTime);

    }
}