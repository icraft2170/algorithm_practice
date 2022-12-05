package me.hero.str.p8;

import java.util.Scanner;

public class Main {
  public String solution(String str) {
    str = str.toLowerCase();
    str = str.replaceAll("[^a-z]", "");
    String tmp = new StringBuilder(str).reverse().toString();

    if (str.equals(tmp)) {
      return "YES";
    }
    else {
      return "NO";
    }
  }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String str = reader.nextLine();

    Main main = new Main();
    String solution = main.solution(str);
    System.out.println(solution);
  }
}
