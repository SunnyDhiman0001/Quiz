// Task 4
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        int answer=0;
        int wanswer=0;
        Scanner scanner = new Scanner(System.in);
        // Question 1
        System.out.println("A. What is Java?");
        System.out.println("1. java is an Programming Language.");
        System.out.println("2. java is a person.");
        System.out.println("3. java is App");
        System.out.println("4. java is a car.");
        System.out.println("Select any Option: ");
        int ans1;
        ans1 = scanner.nextInt();
        if (ans1 == 1) {
            answer++;
        }
        else {
            System.out.println("wrong answer.");
        }
        // Question 2
        System.out.println("B. What is flutter?");
        System.out.println("1. Programming Language.");
        System.out.println("2. Framework");
        System.out.println("3. App");
        System.out.println("4. Software.");
        System.out.println("Select any Option: ");
        
        int ans2;
        ans2 = scanner.nextInt();
        if (ans2 == 2) {
            answer++;
        }
        else {
            wanswer++;
        }
        // Question 3
        System.out.println("C. Stands of AI?");
        System.out.println("1. Apple Intelligence");
        System.out.println("2. Automatic Intelligence");
        System.out.println("3. Artificial Intelligence");
        System.out.println("4. Auto Intelligence.");
        System.out.println("Select any Option: ");
        int ans3;
        ans3 = scanner.nextInt();
        if (ans3 == 3) {
            answer++;
        }
        else {
            wanswer++;
        }
        // Question 4
        System.out.println("D. what does HTML stands for?");
        System.out.println("1. Hyper Text Marking Language.");
        System.out.println("2. Hyper Text Markting Language.");
        System.out.println("3. Hyper Text Markup Language.");
        System.out.println("4. Hyper Text Markup Laveler.");
        System.out.println("Select any Option: ");
        int ans4;
        ans4 = scanner.nextInt();
        if (ans4 == 3) {
            answer++;
        }
        else {
            wanswer++;
        }
        // Question 5
        System.out.println("E. The Programming Process is a _____________?");
        System.out.println("1. System development process");
        System.out.println("2. Coding process");
        System.out.println("3. Testing process");
        System.out.println("4. problem solving process.");
        System.out.println("Select any Option: ");
        int ans5;
        ans5 = scanner.nextInt();
        if (ans5 == 2) {
            answer++;
        }
        else {
            wanswer++;
        }
        System.out.println("Correct Answers: "+answer+"/5");
        System.out.println("Incorrect Answers:"+wanswer+"/5");
        scanner.close();
    }
}
