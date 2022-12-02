package me.hero.p10;

import java.util.Scanner;

public class Main {
  public void solution(String str) {
    String[] strArray = str.split(" ");
    String st = strArray[0];
    int[] answer = new int[st.length()];
    char t = strArray[1].charAt(0);
    StringBuilder result = new StringBuilder();

    int distance = 1000;
    for (int i = 0; i < st.length(); i++) {
      if (st.charAt(i) == t) {
        distance = 0;
        answer[i] = distance;
      } else {
        ++distance;
        answer[i] = distance;
      }
    }

    distance = 1000;
    for (int i = st.length() - 1; i >= 0; i--) {
      if (st.charAt(i) == t) {
        distance = 0;
      } else {
        ++distance;
        answer[i] = Math.min(distance, answer[i]);
      }
    }


    for (int i : answer) {
      result.append(i).append(" ");
    }
    System.out.print(result.toString().trim());
  }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String str = reader.nextLine();

    Main main = new Main();
    main.solution(str);
  }
}
