package me.hero.str.p4;

import java.util.Scanner;
public class Main {
  public String solution(String str) {
    String answer;
    char[] chars = str.toCharArray();
    int lt = 0;
    int rt = str.length() - 1;
    while (lt < rt) {
      char tmp;
      tmp = chars[lt];
      chars[lt] = chars[rt];
      chars[rt] = tmp;
      lt++;
      rt--;
    }
    return String.valueOf(chars);
  }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int index = reader.nextInt();
    reader.nextLine();
    String[] strArray = new String[index];
    for (int i = 0; i < index; i++) {
      strArray[i] = reader.nextLine();
    }

    Main main = new Main();
    for (String str : strArray) {
      System.out.println(main.solution(str));
    }
  }
}

//public class Main {
//  public void solution(String[] strArray) {
//    for (String str : strArray) {
//      StringBuilder reverse = new StringBuilder(str).reverse();
//      System.out.println(reverse);
//    }
//  }
//
//  public static void main(String[] args) {
//    Scanner reader = new Scanner(System.in);
//    int index = reader.nextInt();
//    reader.nextLine();
//    String[] strArray = new String[index];
//    for (int i = 0; i < index; i++) {
//      strArray[i] = reader.nextLine();
//    }
//
//    Main main = new Main();
//    main.solution(strArray);
//  }
//}
