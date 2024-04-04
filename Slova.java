import java.util.ArrayList;

public class Slova {

    ArrayList<String> slova = new ArrayList<>();

    public void addSlovo(String slovo){

        slova.add(slovo.toLowerCase().trim());
    }
    public void vypis(){
        System.out.println(slova);
    }

    public void unikatniSlova(){
        ArrayList<String> unikatniSlova = new ArrayList<>();
        for (int i = 0; i < slova.size();i++){
            if (!unikatniSlova.contains(slova.get(i))){
                unikatniSlova.add(slova.get(i));
            }
        }
        System.out.println(unikatniSlova);
        unikatniSlova.clear();
    }

public void unikatniSlovaPocet(){
        ArrayList<String> unikatniSlova = new ArrayList<>();
        for (int i = 0; i < slova.size();i++){
            if (!unikatniSlova.contains(slova.get(i))){
                unikatniSlova.add(slova.get(i));
            }
        }
        System.out.println(unikatniSlova.size());
        unikatniSlova.clear();
    }

public void pocetZadanehoSlova(String zadaneSlovo){
        int pocetZadanehoSlova = 0;

        for (int i = 0; i < slova.size();i++){
            if (slova.get(i).equals(zadaneSlovo.toLowerCase())){
            pocetZadanehoSlova++;
            }
        }
        System.out.println(pocetZadanehoSlova);
        pocetZadanehoSlova = 0;
    }
    public void nejkratsiSlovo(){
        String nejkratsiSlovo = slova.get(0);
        for (int i = 1; i < slova.size();i++){
            if (slova.get(i).length() < nejkratsiSlovo.length()){
              nejkratsiSlovo =  slova.get(i);
            }
        }
        System.out.println(nejkratsiSlovo);
    }

public void nejdelsiSlovo(){
        String nejdelsiSlovo = slova.get(0);
        for (int i = 1; i < slova.size();i++){
            if (slova.get(i).length() > nejdelsiSlovo.length()){
              nejdelsiSlovo = slova.get(i);
            }
        }
        System.out.println(nejdelsiSlovo);
    }



}