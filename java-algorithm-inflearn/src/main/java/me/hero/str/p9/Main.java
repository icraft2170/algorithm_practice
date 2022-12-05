package me.hero.str.p9;

import java.util.Scanner;

public class Main {
  public int solution(String str) {
    int answer = 0;
    char[] chars = str.toCharArray();
    for (char ch : chars) {
      if (ch >= 48 && ch <= 57) {
        answer = answer * 10 + (ch - 48);
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String str = reader.nextLine();

    Main main = new Main();
    int result = main.solution(str);
    System.out.print(result);
  }
}
