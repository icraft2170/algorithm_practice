package me.hero.str.p1;

import java.util.Scanner;

public class Main {
  public void solution(String str, char ch) {
    int count = 0;
    String st = str.toUpperCase();
    char c = Character.toUpperCase(ch);
    for (int i = 0; i < st.length(); i++) {
      if (st.charAt(i) == c) count++;
    }

    System.out.print(count);
  }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    String str = reader.next();
    char ch = reader.next().charAt(0);

    Main main = new Main();
    main.solution(str, ch);
  }
}
