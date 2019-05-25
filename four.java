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
public class four {

    public static void main(String[] args) {
        four test = new four();
        Scanner input = new Scanner(System.in);
        System.out.println("Input angka ganjil : ");
        int angka = input.nextInt();
        if (angka % 2 == 1) {
            test.cetakGambar(angka);
        } else {
            System.out.println("Error, input angka ganjil!");
        }

    }

    public void cetakGambar(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j <= x - 1; j++) {
                if (i == 1 || i == x || j == x / 2 || j == x / 2) {
                    System.out.print("x");
                } else {
                    System.out.print("=");
                }
            }
            System.out.println("");
        }

    }

}
