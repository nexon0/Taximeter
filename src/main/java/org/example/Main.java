package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int km;
        double perkm = 7.0, total , StartPrice = 30;

        Scanner input = new Scanner(System.in);
        System.out.println("Gidilecek Km cinsi Mesafe : ");
        km = input.nextInt();

        total = (km * perkm);
        total += StartPrice ;
        total = (total < 60) ? 60 : total;
        System.out.println("Toplam tutar : " + total );



        }
    }
