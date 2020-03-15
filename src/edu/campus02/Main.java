package edu.campus02;

public class Main {

    public static void main(String[] args) {

        String s1 = "bussi";
        String s2 = "dannhaltnichtbussi";
        int ergebnis = vergleiche(s1,s2);
        System.out.println( " Ergebnis " + ergebnis );
	// write your code here
    }
    public static int vergleiche (String s1, String s2) {

        if (s2.contains(s1)) {
            return 1;
        }else if (s1.contains(s2)){
            return 2;
        } else if (s1.contains(s2) && (s2.contains(s1))) {
            return 3;
        }  else {
            return 4;

        }
    }
}


