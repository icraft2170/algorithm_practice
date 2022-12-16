import java.util.Scanner;
public class Main {
  public int solution(int n) {
    int p1 = 1, p2 = 1, count = 0, sum = 0;
    while ((n/2 + 1) >= p1) {
      sum += p1++;
      if (sum == n) {
        count++;
      }
      while (sum > n) {
        sum -= p2++;
        if (sum == n) {
          count++;
          break;
        }
      }
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