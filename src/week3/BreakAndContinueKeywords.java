package week3;

public class BreakAndContinueKeywords {
    public static void main(String[] args) {
        /**
         * break : when we use break keyword, it will stop the
         * loop and will exit from loop.
         * We cannot write any code after break.
         * If we write, it will give compile error.
         */
        /**
         * continue: it jumps directly to the beginning of the loop
         * After continue statement, we cannot write any code.
         * If we write, it will give compile error.
         */

        int a = 5;
        while(a > 0){
            a--;
            System.out.println("Count # " + (a ));
            System.out.println("hi, I am infinite.");
            if(a ==3){
                continue;  // After "continue" keyword the code execution will end in this line
                            // and then it's going to beginning of the LOOP
            }
            System.out.println("Test");
            System.out.println("Test2");
            System.out.println("Test");
            System.out.println("Test2");
            System.out.println("Test");
            if(a == 1) continue;
            System.out.println("Test2");
            System.out.println("Test");
            System.out.println("Test2");
            System.out.println("Test");
            System.out.println("Test2");
        }

        // Find the sum of 1 to 10 without 5.

        int sum = 0;
        int num =1;
        while (num<11){
            num++;
            if(num-1 == 5) continue;
            sum += num-1;
            System.out.println(num-1);
        }
        System.out.println(sum);

        // Print the even numbers only from 1 to 100.
        // 2,4,6,8,10...98,100

        int number = 1;

        while(number <= 100){
            number ++;
            if(number ==100) {
                System.out.print(number);
                continue;
            }
            if(number % 2 != 0 ) {
                continue;
            }
            System.out.print(number + ", ");

        }


    }
}
