/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arkademy;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class five {

    public static void main(String[] args) {

        Scanner inputKata = new Scanner(System.in);
        System.out.println("Input kata/kalimat : ");
        String inKata1 = inputKata.next();
        System.out.println("Input huruf yang diganti : ");
        String inKata2 = inputKata.next();
        System.out.println("Input huruf sebagai pengganti : ");
        String inKata3 = inputKata.next();

        char[] stringArray, stringArray2, stringArray3;
        stringArray = inKata1.toCharArray();
        stringArray2 = inKata2.toCharArray();
        stringArray3 = inKata3.toCharArray();

        for (int i = 0; i < stringArray.length; i++) {

            if (stringArray[i] == stringArray2) {
                stringArray[i] == stringArray3;
            }
        }

        System.out.println("Hasil : " + inKata1);
    }
}
