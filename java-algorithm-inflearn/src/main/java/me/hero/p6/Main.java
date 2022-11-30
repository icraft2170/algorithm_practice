package me.hero.p6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public String solution(String str) {
    StringBuilder answer = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
      if (i == str.indexOf(str.charAt(i))) {
        answer.append(str.charAt(i));
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
