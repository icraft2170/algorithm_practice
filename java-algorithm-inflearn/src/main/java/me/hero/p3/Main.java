package me.hero.p3;

import java.util.Scanner;

public class Main {
  public void solution(String str) {
    int length = 0;
    int markIndex = 0;
    String[] strArray = str.split(" ");

    for (int i = 0; i < strArray.length; i++) {
      if (length < strArray[i].length()) {
        length = strArray[i].length();
        markIndex = i;
      }
    }
    System.out.print(strArray[markIndex]);
  }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String str = reader.nextLine();

    Main main = new Main();
    main.solution(str);

  }
}
