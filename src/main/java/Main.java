import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] argc){
    }
    public static int[] zad691(String[] osobniki){
        int[] liczebnosci = new int[501];
        int ileGatunkow = 0;
        int[] out = new int[2];
        int max = 0;
        for(int i = 0; i<osobniki.length; i++){
            liczebnosci[osobniki[i].length()] += 1;
        }
        for(int i = 0; i<liczebnosci.length; i++){
            if(liczebnosci[i] != 0)
                ileGatunkow += 1;
            if(liczebnosci[i] > max)
                max = liczebnosci[i];
        }
        out[0] = ileGatunkow;
        out[1] = max;
        return out;
    }
    public static ArrayList<String> wyodrebnijGeny(String osobnik){
        ArrayList<String> geny = new ArrayList<String>();
        for(int i = 0; i+1<osobnik.length(); i++){
            String gen = "";
            if(osobnik.charAt(i) == 'A' && osobnik.charAt(i+1) == 'A') {
                while (i + 1 < osobnik.length() && (osobnik.charAt(i) != 'B' || osobnik.charAt(i + 1) != 'B')) {
                    gen += osobnik.charAt(i);
                    i++;
                }
                if(i + 1 < osobnik.length()) {
                    gen += "BB";
                    geny.add(gen);
                }
            }
        }
        return geny;
    }
    public static ArrayList<String> wyodrebnijGenySB(String osobnik){
        ArrayList<String> geny = new ArrayList<String>();
        for(int i = 0; i+1<osobnik.length(); i++){
            StringBuilder sb = new StringBuilder();
            if(osobnik.charAt(i) == 'A' && osobnik.charAt(i+1) == 'A') {
                while (i + 1 < osobnik.length() && (osobnik.charAt(i) != 'B' || osobnik.charAt(i + 1) != 'B')) {
                    sb.append(osobnik.charAt(i));
                    i++;
                }
                if(i + 1 < osobnik.length()) {
                    sb.append("BB");
                    geny.add(sb.toString());
                }
            }
        }
        return geny;
    }
    public static int zad692(String[] osobniki){
        int slabeOsobniki = 0;
        for(int i = 0; i<osobniki.length; i++) {
            //if(wyodrebnijGeny(osobniki[i]).contains("BCDDC") == true)
                ArrayList<String> geny = wyodrebnijGeny(osobniki[i]);
                for(String j: geny){
                    if(j.contains("BCDDC")) {
                        slabeOsobniki += 1;
                        break;
                    }
                }
        }
        return slabeOsobniki;
    }
    public static int[] zad693(String[] osobniki){
        int[] out = new int[2];
        int max = 0;
        int maxGenow = 0;
        for(int i = 0; i<osobniki.length; i++) {
            ArrayList<String> geny = wyodrebnijGeny(osobniki[i]);
            if(geny.size() > maxGenow)
                maxGenow = geny.size();
            for(String j: geny){
                if(j.length()> max)
                    max = j.length();
            }
        }
        out[0] = maxGenow;
        out[1] = max;
        return out;
    }
    public static boolean odporny(String osobnik){
        String czescKodujaca = "";
        String czescKodujacaRev = "";
        StringBuilder sb = new StringBuilder(osobnik).reverse();
        ArrayList<String> geny = wyodrebnijGeny(osobnik);
        ArrayList<String> genyRev = wyodrebnijGeny(sb.toString());
        for(String i: geny){
            czescKodujaca += i;
        }
        for(String i: genyRev){
            czescKodujacaRev += i;
        }
        return czescKodujaca.equals(czescKodujacaRev);
    }
    public static boolean silnieOdporny(String osobnik){
        if(new StringBuilder(osobnik).reverse().toString().equals(osobnik))
            return true;
        else
            return false;
    }
    public static void zad694(String[] osobniki){
        int silnieOdpowrny = 0;
        int odporny = 0;
        int[] out = new int[2];
        for(int i = 0; i<osobniki.length; i++){
            if(silnieOdporny(osobniki[i]) == true)
                silnieOdpowrny++;
            if(odporny(osobniki[i]) == true)
                odporny++;

        }
        System.out.println(silnieOdpowrny);
        System.out.print(odporny);
    }

}//metoda z wykorzystaniem substring(wyodrebnij geny)
