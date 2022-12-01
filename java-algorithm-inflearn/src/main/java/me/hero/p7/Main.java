package me.hero.p7;

import java.util.Scanner;
public class Main {
  public boolean solution(String str) {
    char[] chars = str.toLowerCase().toCharArray();
    boolean result = true;
    int lt = 0;
    int rt = chars.length - 1;

    while (lt < rt) {
      if (chars[lt] != chars[rt]) {
        result = false;
      }
      lt++;
      rt--;
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String str = reader.nextLine();
    Main main = new Main();
    boolean result = main.solution(str);

    if (result) {
      System.out.print("YES");
    } else {
      System.out.print("NO");
    }
  }
}
