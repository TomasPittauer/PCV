import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Slova mojeSlova = new Slova();

        System.out.println("Napis slova, která chceš přidat do listu. Pro ukončení psaní napiš abctru");
        boolean isOn = true;
        Scanner myObj = new Scanner(System.in);
        while (isOn){
            String slovo = myObj.nextLine();

            if (slovo.equals("abctru")){
                isOn = false;

            }
            else {
                mojeSlova.addSlovo(slovo);
                System.out.println("Napsal jsi slovo: " + slovo);
            }


        }


System.out.println("Výpis všech slov");
        mojeSlova.vypis();
        System.out.println("Unikátní slova");
        mojeSlova.unikatniSlova();
        System.out.println("Počet unikátních slov");
        mojeSlova.unikatniSlovaPocet();
        System.out.println("Napiš slova, kterého chceš zjistit počet");
        Scanner myScanner = new Scanner(System.in);
        String hledaneSlovo = myObj.nextLine();
        mojeSlova.pocetZadanehoSlova(hledaneSlovo);
        System.out.println("Nejkratsi slovo");
        mojeSlova.nejkratsiSlovo();
        System.out.println("Nejdelsi slovo");
        mojeSlova.nejdelsiSlovo();

    }
}