
// // Task 1. Вычислить n-ое треугольного число (сумма чисел от 1 до n),
// // n! (произведение чисел от 1 до n)

// import java.util.Scanner;

// public class task_1 {
// public static void main(String[] args) {

// Scanner sc = new Scanner(System.in);
// System.out.println("");
// System.out.print("Введите число (0-15): ");
// int n = sc.nextInt();
// int p = 1;
// int t = 0;
// if (n<16){
// for (int i = 0; i <= n; i++) {
// if (i != 0) {
// p = p * i;
// t = t + i;
// }
// }
// System.out.printf("треугольное число = %d \n", p);
// System.out.printf("произведение числа = %d\n", t);
// sc.close();
// }
// System.out.println("");
// }
// }25 changes:25 additions&0 deletions25 task_2.java @@-0,0+1,25 @@

// // Task 2. Вывести все простые числа от 1 до 1000

// import java.util.Scanner;

// public class task_2 {
// public static void main(String[] args) {

// Scanner sc = new Scanner(System.in);
// System.out.print("Введите число (0-10000): ");
// int kont = sc.nextInt();
// sc.close();
// // int[] arr = new int[] {2,3,5,7};
// for (int i = 1; i < kont; i++) {
// if ((i % 2) != 0) {
// if ((i % 3) != 0) {
// if (i % 5 != 0) {
// if (i % 7 != 0) {
// System.out.printf(" %d\t", i);
// }
// }
// }
// }
// }
// }
// }
// // Task 3.Реализовать простой калькулятор
// import java.util.Scanner;

// public class task_3 {
// public static void main(String[] args) {
// double num1;
// double num2;
// double ans;
// char op;
// Scanner reader = new Scanner(System.in);
// System.out.println("\n");
// System.out.print("Введите первое число: ");
// num1 = reader.nextDouble();
// System.out.print("Введите второе число: ");
// num2 = reader.nextDouble();
// System.out.print("\n Введите оператор (+, -, *, /): ");
// op = reader.next().charAt(0);
// reader.close();
// switch (op) {
// case '+':
// ans = num1 + num2;
// break;
// case '-':
// ans = num1 - num2;
// break;
// case '*':
// ans = num1 * num2;
// break;
// case '/':
// ans = num1 / num2;
// break;
// default:
// System.out.printf("Такой оператор не используется");
// return;
// }
// System.out.print("\n Результат равер : ");
// System.out.printf(num1 + " " + op + " " + num2 + " = " + "%.2f", ans);
// System.out.println("\n");
// }
// }