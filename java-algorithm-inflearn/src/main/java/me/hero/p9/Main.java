package me.hero.p9;

import java.util.Scanner;

public class Main {
  public int solution(String str) {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
      char codePoint = str.charAt(i);
      if (!Character.isAlphabetic(codePoint)) {
        builder.append(codePoint);
      }
    }

    return Integer.parseInt(builder.toString());
  }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String str = reader.nextLine();

    Main main = new Main();
    int result = main.solution(str);
    System.out.print(result);
  }
}
