package Int101w8;
import java.util.Random;

public class Repetition {
    public static void main(String[] args) {
        demoRandom();
        demoWhileLoop();
        demoWhileLoop2();
        demoWhileLoop3();
        demoDoWhileLoop();
        demoForLoop();
        demoStudent();
    /*
write a utility class (final class + private contructor)
named MyUtil with the following methods
(1) static int factorial (int i) :
    1.1 return 1 if i =0
    1.2 reurn 1* 2 * 3 * ... * i if i > 0
    1.3 throw IllegalArgumentExcpetion if i < 0
(2) static int summation(int i, int j):
    2.1 return the summation of i + (i+1)
    2.2 if i > j, swap the value of i and j
    2.3 if i = j, return i
(3) static int finbonacci(int i) :
    return n(th) of the fibonacci squence: 1,1,2,3,5,8,13,21,...
     */
        System.out.println("Factorial of 5 = " + MyUtil.factorial(5));
        System.out.println("Summation of 6 to 4 = " + MyUtil.summation(6, 4));
        System.out.println("Fibonacci sequence of 7 = " + MyUtil.fibonacci(7));
    }

    static void demoStudent() {
        Student s = new Student(10, "Somchai", "DeeDee");
        System.out.println("Student: " + s);
    }

    //Example
    static void demoRandom() {
        System.out.println("Random from Math: " + Math.random()); // pseudorandom number generator
        Random r = new Random();
        System.out.println("Random double(0,1) from Random: " + r.nextDouble());
        System.out.println("Random boolean from Random: " + r.nextBoolean());
        System.out.println("Random int(0,max) from Random: " + r.nextInt());
        System.out.println("Random int (1,10) from Random: " + (1 + r.nextInt(10)));
    }

    //Example
    static void demoWhileLoop() {
        int i = 0;
        int sum = 0;
        while (i < 10) {
            sum += ++i;
            if (sum < 1) {
                break;
            }
        }
        System.out.println("Sum of 1 to 10 = " + sum);
    }

    // without Continue
    static void demoWhileLoop2() {
        int i = 1;
        int sum = 0;
        while (i <= 100) {
            if (i % 5 != 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("Result = " + sum);
    }

    //Use Continue
    static void demoWhileLoop3() {
        int j = 1;
        int sum = 0;
        while (j <= 100) {
            if (j % 5 == 0) {
                j++;
                continue;
            }
            sum += j;
            j++;
        }
        System.out.println("Result = " + sum);
    }

    static void demoDoWhileLoop() {
        int i = 0;
        int sum = 0;
        do {
            i++;
            sum += i;
        } while (i < 100);
        System.out.println("Sum = " + sum);
    }

    static void demoForLoop() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                continue;
            }
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }


}
