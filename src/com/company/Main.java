package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("What is your name?");
      String firstName = scanner.nextLine();

      System.out.println("Hello " + firstName);
      scanner.close();
    }
}
