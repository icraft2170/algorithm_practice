package me.hero.str.p12;

import java.util.Scanner;

public class Main {
  public static final int COMMON_RATIO = 7;

  public String solution(String str, int number) {
    str = str.replaceAll("[*]", "0");
    str = str.replaceAll("[#]", "1");
    StringBuilder answer = new StringBuilder();

    for (int i = 0; i < number; i++) {
      String substring = str.substring(i * COMMON_RATIO, (i * COMMON_RATIO) + COMMON_RATIO);
      char ch = (char) Integer.parseInt(substring, 2);
      answer.append(ch);
    }

    return answer.toString();
  }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int i = Integer.parseInt(reader.nextLine());
    String str = reader.nextLine();

    Main main = new Main();
    String result = main.solution(str, i);
    System.out.print(result);
  }
}
