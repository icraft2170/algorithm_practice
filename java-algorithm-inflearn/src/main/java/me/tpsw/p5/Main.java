import java.util.Scanner;
public class Main {
  public int solution(int n) {
    int count = 0, cnt = 1;
    n--;
    while (n > 0) {
      cnt++;
      n -= cnt;
      if (n % cnt == 0) count++;
    }
    return count;
  }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int n = reader.nextInt();

    Main main = new Main();
    int result = main.solution(n);
    System.out.print(result);
  }
}