import java.util.Scanner;
import java.util.Random;

class PawelKozlowski {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] pytania = new String[100];
        Random rand = new Random();
        String odpowiedz;
        pytania[0] = "Z iloma krajami graniczy Polska?";
        pytania[1] = "Dokończ tytuł słynnego westernu: 'Dobry, zły i...'";
        pytania[2] = "Prosta w geometrii nie ma początku oraz nie ma końca?";
        pytania[3] = "Data terrorystycznego ataku na WTC to:";
        pytania[4] = "Pumba z filmu 'Król Lew' był:";
        pytania[5] = "Z kim graliśmy słynny 'mecz na wodzie' w półfinale Mistrzostw Świata w Piłce Nożnej 1974?";
        pytania[6] = "Równik dzieli kulę ziemską na dwie półkule. Które? ";
        pytania[7] = "Ile złotych medali olimpijskich zdobył Adam Małysz?";
        pytania[8] = "Największy ocean na Ziemi to?";
        pytania[9] = "'Parasite', zdobywca Oscara za najlepszy film, pochodzi z:";
        pytania[10] = "W której z wymienionych grup wyrazów WSZYSTKIE są napisane poprawnie?";
        pytania[11] = "Tradycyjne gruzińskie chinkali wypełnione są:";
        pytania[12] = "Stolicą Stanów Zjednoczonych Ameryki jest:";
        pytania[13] = "Kto został królem Anglii po bitwie pod Hastings?";
        pytania[14] = "Olga Tokarczuk NIE napisała:";
        pytania[15] = "Którego z tych filmów nie reżyserował Roman Polański?";
        pytania[16] = "Panczeniści do uprawiania swojego sportu potrzebują:";
        pytania[17] = "'Tron we krwi' to jeden z najważniejszych filmów wyprodukowanych:";
        pytania[18] = "Michael Jordan zdobył tytuły mistrza NBA z drużyną:";
        pytania[19] = "Najdłuższą rzeką w Polsce jest Wisła. Ile kilometrów mierzy?";
        pytania[20] = "Jak nazywał się brat Bolesława Krzywoustego?";
        pytania[21] = "Ilu sąsiadów Polski ma dostęp do morza?";
        pytania[22] = "Anita Włodarczyk zdobyła dwa złote medale olimpijskie w:";
        pytania[23] = "Temudżyn to znany później:";
        pytania[24] = "Janusz Sidło był jednym z czołowych światowych:";
        pytania[25] = "Kto zastąpił na tronie Władysława Łokietka?";
        pytania[26] = "Religią dominującą w Japonii jest buddyzm oraz...";
        pytania[27] = "'Różyczka' - to słowo klucz do filmu:";
        pytania[28] = " Jak nazywał się największy statek Krzysztofa Kolumba, na którym dotarł do Ameryki?";
        pytania[29] = "Na tablicy Mendelejewa symbolem P oznaczony jest...";
        pytania[30] = "Kto napisał słynną operę 'Carmen'?";
        pytania[31] = " Ile najwięcej złotych medali olimpijskich zdobyliśmy na jednych letnich igrzyskach?";
        pytania[32] = "Co zwyczajowo nazywana jest niezabudką:";
        pytania[33] = "'Dyktator' z wybitną rolą Charliego Chaplina parodiował postać:";
        pytania[34] = "Niemal cały obszar lądowy Japonii zajmują cztery główne wyspy: Hokkaido, Honsiu, Sikoku oraz Kiusiu. Która jest największa?";
        pytania[35] = "Stal jest stopem, jakich pierwiastków?";
        pytania[36] = "Kopernik brał udział w wojnie z:";
        pytania[37] = "Skąd wzięła się nazwa Pink Floyd?";
        pytania[38] = "Łaska pańska na... koniu jeździ";
        pytania[39] = "Na jakim kontynencie leżą Malediwy?";
        pytania[40] = "Trasa najdłuższego biegu, który rozgrywa się na stadionie, liczy:";
        pytania[41] = "Jednym z motywów filmu 'Aż poleje się krew' jest:";
        pytania[42] = "Rozwiąż zadanie: - 7 - (5 - 24) = ...";
        pytania[43] = "Kwitnące Wiśnie w Japonii zwiastują nadejście wiosny, a co symbolizują?";
        pytania[45] = "Wojna 30-letnia rozegrała się głównie na terenie:";
        pytania[46] = "Który turniej Wielkiego Szlema rozgrywa się na kortach Stade Roland Garros?";
        pytania[47] = "Prokrastynacja to:";
        pytania[48] = "Akcja 'Rękopisu znalezionego w Saragossie' rozgrywa się w czasie:";
        pytania[49] = "Rozwiąż zadanie: Kasia przygotowała z cukru i wody syrop do deseru. Stosunek masy cukru do masy wody w tym syropie jest równy 5:3. Ile procent masy tego syropu stanowi masa cukru?";
        pytania[50] = "W którym rozbiorze Polski nie brała udziału Austria?";
        pytania[51] = "Temperatury powyżej 10 stopni Celsjusza zimą oraz powyżej 20 stopni latem, bardzo duże dobowe i roczne amplitudy temperatury, dodatkowo opady małe lub bardzo małe, które występują wyłącznie   latem. Jakiego klimatu to opis?";
        pytania[52] = "Kim była tytułowa Jolka z największego przeboju Budki Suflera?";
        pytania[53] = "Ilu graczy liczy drużyna hokeja na lodzie? Chodzi oczywiście o liczbę graczy na lodowisku";
        pytania[54] = "Słynna bitwa pod Racławicami miała miejsce w czasie:";
        pytania[55] = "Rozwiąż zadanie: 4 * (8 * 2 - 10) = ...";
        pytania[56] = "Muł to krzyżówka:";
        pytania[57] = "Którego koloru nie było w słynnej trylogii Krzysztofa Kieślowskiego?";
        pytania[58] = "Jaki wynik uzyskamy z działania 50 - (50 - 5*5) - 125:5";
        pytania[59] = "Największy z rodzimych chrząszczy. Samce toczą walki o samice, używając swoich potężnych żuwaczek. Jak się nazywają?";
        pytania[60] = "Jedna z największych bitew II wojny światowej na Pacyfiku miała miejsce:";
        pytania[61] = " Słynny rajdowiec Niki Lauda był z pochodzenia:";
        pytania[62] = " Szczepan Twardoch nie jest autorem:";
        pytania[63] = "Kto grał rolę Pana Młodego w ekranizacji 'Wesela' Wyspiańskiego, wyreżyserowanej przez Andrzeja Wajdę?";
        pytania[64] = "Podaj właściwą kolejność planet pod względem odległości od Słońca:";
        pytania[65] = "Czy człowiek posiada chlorofil?";
        pytania[66] = "Rzeczownik odmienia się przez:";
        pytania[67] = "Kiedy siedzisz za kierownicą samochodu z manualną skrzynią biegów, gdzie znajduje się sprzęgło?";
        pytania[68] = "Dokończ przysłowie: Bliższa ciału koszula niż...";
        pytania[69] = "Rozwiąż zadanie: (39 + 26) : 13 + 3 · 12 = ...";
        pytania[70] = "Wilk szary to:";
        pytania[71] = "Mariusz Szczygieł nie jest autorem:";
        pytania[72] = "Strój w islamie, który zakrywa całkowicie ciało i twarz kobiety, pozostawiając niewielką siatkę na oczach, to:";
        pytania[73] = " Interlokutor to inaczej:";
        pytania[74] = "Bijelo dugme. Nazwa zespołu to po polsku:";
        pytania[75] = "Mama oraz babcia przygotowywały obiad. Słowo 'oraz' pełni funkcję...";
        pytania[76] = "Jaki włoski ser jest niezbędnym składnikiem tiramisu?";
        pytania[77] = "Freddie Mercury naprawdę nazywał się:";
        pytania[78] = "Na banknocie 20 zł widać profil...";
        pytania[79] = "Cuhę (in. czuhę) możemy:";
        pytania[80] = "Kto pierwszy raz zimą zdobył Lhotse (1988 r.)?";
        pytania[81] = "Z chorą wątrobą udasz się do:";
        pytania[82] = "Półtoraki, dwójniaki, trójniaki i czwórniaki to rodzaje:";
        pytania[83] = "Technika wokalna znana z bardziej ekstremalnych odmian muzyki metalowej:";
        pytania[84] = "Stany Zjednoczone posługują się dolarami. Ale nie tylko one. Gdzie jeszcze zapłacimy walutą o tej nazwie?";
        pytania[85] = "Główny składnik piwa to:";
        pytania[86] = "Ile to jest 2 plus 2?";
        pytania[87] = "X+Y=Y+X Prawda?";
        pytania[89] = "6*6 =";
        pytania[90] = "2+2*2=";
        pytania[91] = "MCMXCIX to rok";
        pytania[92] = "Ułamek 4/2 to";
        pytania[93] = "Obwód kwadratu o boku 4cm wynosi";
        pytania[94] = "3 godziny ile to minut";
        pytania[95] = "2+6*3=";
        pytania[96] = "Największy kraj świata";
        pytania[97] = "W którym roku urząd prezydenta objął Lech Wałęsa?";
        pytania[98] = "Co to jest planimetria?";
        pytania[99] = "Pacyfik to inna nazwa…";

        for (int petla = 0; petla < 10; petla++) {
            int losowaniepytania = rand.nextInt(99);
            System.out.println(pytania[losowaniepytania]);
            

        }

    }
}