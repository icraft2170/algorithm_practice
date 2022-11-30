package me.hero.p6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public String solution(String str) {
    char[] chars = str.toCharArray();
    ArrayList<Character> characters = new ArrayList<>();

    for (char ch : chars) {
      if (characters.contains(ch)) continue;
      characters.add(ch);
    }
    char[] result = new char[characters.size()];
    for (int i = 0; i < characters.size(); i++) {
      result[i] = characters.get(i);
    }
    return String.valueOf(result);
  }


  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String str = reader.nextLine();

    Main main = new Main();
    String result = main.solution(str);
    System.out.print(result);
  }
}
