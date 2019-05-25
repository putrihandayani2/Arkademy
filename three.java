/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arkademy;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class three {

    public static void main(String[] args) {

        Scanner inputKata = new Scanner(System.in);
        System.out.println("Input kata : ");
        String inKata = inputKata.nextLine();

        System.out.println("Huruf vokal pada kata " + inKata + " berjumlah : " + hitungVokal(inKata));
    }

    public static int hitungVokal(String inKata) {
        int hitung = 0;
        for (int i = 0; i < inKata.length(); i++) {

            if (inKata.charAt(i) == 'a' || inKata.charAt(i) == 'i' || inKata.charAt(i) == 'u' || inKata.charAt(i) == 'e' || inKata.charAt(i) == 'o' || inKata.charAt(i) == 'A' || inKata.charAt(i) == 'I' || inKata.charAt(i) == 'U' || inKata.charAt(i) == 'E' || inKata.charAt(i) == 'O') {
                hitung++;
            }
        }

        return hitung;

    }

}
