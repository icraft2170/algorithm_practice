package me.hero.p11;

import java.util.Scanner;

public class Main {
  public String solution(String str) {
    StringBuilder answer = new StringBuilder();
    str = str + " ";
    char[] chars = str.toCharArray();
    int count = 1;

    for (int i = 0; i < chars.length - 1; i++) {
      if (chars[i] == chars[i + 1]) {
        count++;
      } else {
        answer.append(chars[i]);
        if (count > 1) {
          answer.append(count);
        }
        count = 1;
      }
    }
    return answer.toString();
  }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String str = reader.nextLine();

    Main main = new Main();
    String result = main.solution(str);
    System.out.print(result);
  }
}
