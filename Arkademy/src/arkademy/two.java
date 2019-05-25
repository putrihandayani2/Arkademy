/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arkademy;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class two {

    public static void main(String[] args) {
        two test = new two();
        Scanner inputDate = new Scanner(System.in);
        System.out.println("Input Tanggal dengan Format yyyy-mm-dd (Ex : 2019-11-01");
        System.out.println("Input Tanggal Awal : ");
        String inDate1 = inputDate.next();
        System.out.println("Input Tanggal Akhir : ");
        String inDate2 = inputDate.next();
        System.out.println("Hari antara tanggal " + inDate1 + " sampai " + inDate2 + " adalah ");
        test.setTanggal(inDate1, inDate2);
    }

    public void setTanggal(String a, String b) {
        LocalDate awal = LocalDate.parse(a),
                akhir = LocalDate.parse(b);
        String[] saveDate;

        LocalDate next = awal.minusDays(1);
        while ((next = next.plusDays(1)).isBefore(akhir.plusDays(1))) {
            System.out.println(next);
        }
    }

}
