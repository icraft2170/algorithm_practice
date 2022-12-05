package me.hero.str.p12;

import java.util.Scanner;

public class Main {
  public static final int UNIT_NUMBER = 7;

  public String solution(String str, int number) {
    StringBuilder answer = new StringBuilder();

    for (int i = 0; i < number; i++) {
      String substring = str.substring(0, UNIT_NUMBER).replace('#', '1').replace('*', '0');
      char ch = (char) Integer.parseInt(substring, 2);
      answer.append(ch);
      str = str.substring(7);
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
