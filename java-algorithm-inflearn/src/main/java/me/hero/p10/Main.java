package me.hero.p10;

import java.util.Scanner;

public class Main {
  public void solution(String str) {
    String[] strArray = str.split(" ");
    String st = strArray[0];
    int[] numbers1 = new int[st.length()];
    int[] numbers2 = new int[st.length()];
    int[] answer = new int[st.length()];
    char ch = strArray[1].charAt(0);
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < st.length(); i++) {
      numbers1[i] = 0;
      numbers2[i] = 0;
      answer[i] = 0;
    }

    int count = 0;
    for (int i = 0; i < st.length(); i++) {
      if (st.charAt(i) == ch) {
        count = 0;
      } else {
        numbers1[i] = ++count;
      }
    }


    for (int i = st.length() - 1; i >= 0; i--) {
      if (st.charAt(i) == ch) {
        count = 0;
      } else {
        numbers2[i] = ++count;
      }
    }

    for (int i = 0; i < st.length(); i++) {
      if (numbers1[i] < numbers2[i]) {
        answer[i] = numbers1[i];
      } else {
        answer[i] = numbers2[i];
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
