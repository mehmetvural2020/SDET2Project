package week2;

public class PostPreFix {
    int total;

    public static void main(String[] args) {
        int a = 7;
        int b = 3;

        System.out.println("Postfix a++ : " + a++ + a);     // Postfix a++ : 78
        System.out.println("Prefix ++b : " + ++b + b);     // Prefix ++b  : 44
        // Java is executing from left to right in the same line and top to bottom.
        // If there is a string or text and then int or any number continue in the same code line(as the same line 7 and 8)
        // Java is converting int to String automatically.

        //** if there is an int variable and then string is coming in the same line(as the same line 15 and 16)
        // Java is keeping int variable as an int.
        System.out.println(a++ + a + "Postfix a++ : " );    // 15Postfix a++ :
        System.out.println(++b + b + "Prefix ++b : ");     // 8Prefix ++b  :

    }

    void sum(int x, int y){
        int a =0;
        int b =0;
        System.out.println(x+y);
        total = x + y;
        total = a + b;
    }
}
