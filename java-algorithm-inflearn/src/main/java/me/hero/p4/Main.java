package me.hero.p4;

import java.util.Scanner;
public class Main {
  public void solution(String[] strArray) {
    for (String str : strArray) {
      StringBuilder reverse = new StringBuilder(str).reverse();
      System.out.println(reverse);
    }
  }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int index = reader.nextInt();
    reader.nextLine();
    String[] strArray = new String[index];
    for (int i = 0; i < index; i++) {
      strArray[i] = reader.nextLine();
    }

    Main main = new Main();
    main.solution(strArray);
  }
}
