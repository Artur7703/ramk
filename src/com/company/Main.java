package com.company;

import java.util.Scanner;

class RamkaSlovo {
    public class Main {

        public static void main(String[] args) {
            var input = new Scanner(System.in);
            var vertikal = input.nextInt();
            var horizontal = input.nextInt();
            System.out.print("Type a word:");
            var word = input.next();
            var m = word.length();
            if (horizontal < m + 2) {
                System.out.print("Error");
            } else if (vertikal < 3) {
                System.out.print("Error");
            } else {
                for (var i = 1; i <= vertikal; i++) {
                    System.out.print("*");

                    if (i == 1 || i == vertikal) {
                        for (var h = 2; h < horizontal; h++) {
                            System.out.print("*");
                        }
                    } else {
                        if (i == vertikal / 2 && vertikal % 2 == 0) {

                            var d = horizontal - 2 - m;
                            var p = d / 2;
                            var u = d - p;
                            for (var y = 0; y < p; y++) {
                                System.out.print(" ");

                            }
                            System.out.print(word);

                            for (var s = 0; s < u; s++) {
                                System.out.print(" ");

                            }
                        } else if (i == vertikal / 2 + 1 && vertikal % 2 != 0) {

                            var d = horizontal - 2 - m;
                            var p = d / 2;
                            var u = d - p;
                            for (var y = 0; y < p; y++) {
                                System.out.print(" ");

                            }
                            System.out.print(word);

                            for (var s = 0; s < u; s++) {
                                System.out.print(" ");

                            }
                        } else if (vertikal == 3) {
                            var d = horizontal - 2 - m;
                            var p = d / 2;
                            var u = d - p;
                            for (var y = 0; y < p; y++) {
                                System.out.print(" ");

                            }
                            System.out.print(word);

                            for (var s = 0; s < u; s++) {
                                System.out.print(" ");

                            }
                        } else {
                            for (var h = 2; h < horizontal; h++) {
                                System.out.print(" ");

                            }

                        }

                    }
                    System.out.println("*");
                }
            }

        }
    }
}
