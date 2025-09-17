import java.util.*;
public class mainprogram {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
      while (true) {
         System.out.printlen("/n1. Number Game 2.Grade Calculator 3.Exit");
         int c = sc.nextInt();
         if (C == 1) nUMBERGAME(SC);
         else if (c == 2) gradecac(sc);
         else if (c == 3) break;
         else System.out.println("invalid choice");
   }
       SC.close(); 
}
static void numbergame(Scanner SC) {
    Random r = new Random();
    int score = 0;
    while (true) {
       int n = r.nextInt(100) + 1, tries = 7;
       System.out.println("/nGuess 1-100 (7 attempts):");
       while (tries-- > 0) {
           int g = sc.nextInt();
            if (g == n) { System.out.println("Correct!"); score++; break;  }
             System.out.println(g < n ? "tooo low! : "too high!");
        }
         if (tries < 0) System.out.println("out of attempts ! Number was " + n);
         System.out.println("Score: " + score +" play again? (y/n");
          if (!sc.next().equalsIgnoreCase("y")) break;
    }
}
static void gradeCalc(scanner sc) {
    System.out.println("/nNumber of Subjects: ");
    int n =sc.nextInt(); double tot = 0;
    for (int i =1; i <=n; i++) {
         System.out.print("Marks" + i + " : ");
          tot += sc.nextDouble();
}
double avg = tot / n;
String g =avg >= 90 ? "A+" :
          avg >= 80 ? "A"  :
          avg >= 70 ? "B" :
          avg >= 60 ? "C" :
          avg >= 50 ? "D" : "F ";
System.out.printf("Total: %. 2f / %d%nAverage: %.2f%%%nGrade: %s%n", tot, n* 100, avg,g);
   }
}

