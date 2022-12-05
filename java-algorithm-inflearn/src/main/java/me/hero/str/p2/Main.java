package me.hero.str.p2;

import java.util.Scanner;

public class Main {
  public String solution(String str) {
    StringBuilder builder = new StringBuilder();
    for (char ch : str.toCharArray()) {
      if (Character.isUpperCase(ch)) {
        builder.append(Character.toLowerCase(ch));
      } else {
        builder.append(Character.toUpperCase(ch));
      }
    }
    return builder.toString();
  }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String str = reader.next();

    Main main = new Main();
    System.out.print(main.solution(str));
  }
}
