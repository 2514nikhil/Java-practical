//Q3. Write a program to find a greater number among given three numbers using a) ternary operator and b)nested if.

public class Greater {
    public static void main(String[] args) {
        int a = 10, b = 14, c = 19;
        int greatestnum = (a > b) ? ((a > c) ? a : c) : ((b < c) ? b : c);
        System.out.println("Greatest number is :" + greatestnum);
    }
}

// public class Greater {
//     public void GreaterNum(int a, int b, int c) {
//         if (a == b && b == c) {
//             System.out.println("All numbers are same");
//         } else if (a > b && a > c) {

//             System.out.println("a is Greater among Three");

//         } else if (b > a && b > c) {
//             System.out.println("b is Greater among Three");

//         } else {
//             System.out.println("c is Greater among Three");

//         }
//     }

//     public static void main(String[] args) {
//         Greater great = new Greater();
//         great.GreaterNum(30, 30, 30);
//     }
// }

