package me.hero.p11;

import java.util.Scanner;

public class Main {
  public String solution(String str) {
    StringBuilder answer = new StringBuilder();
    char[] chars = str.toCharArray();
    int count = 1;
    char tmp = ' ';

    for (int i = 0; i < chars.length; i++) {
      tmp = chars[i];
      if ((chars.length - 1) == i) {
        if (count == 1) {
          answer.append(chars[chars.length - 1]);
        } else {
          answer.append(chars[chars.length - 1]).append(count);
        }
        break;
      }

      if (chars[i] == chars[i + 1]) {
        count++;
      } else {
        if (count == 1) {
          answer.append(tmp);
          continue;
        }
        answer.append(tmp).append(count);
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
