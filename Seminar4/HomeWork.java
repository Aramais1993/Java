
// Task1.
// Даны два Deque, представляющие два целых числа.
// Цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
// 1. Необходимо умножьте два числа и верните произведение в виде связанного
// списка.
// 2.Необходимо Сложить два числа и верните сумму в виде связанного списка Одно
// или два числа
// могут быть отрицательными.

// Task1.
// import java.util.LinkedList;

// public class HomeWork {
// public static void ReversLinkedList(LinkedList<Integer> ll) {
// System.out.print("Перевёрнутый список -> [");
// for (int i = ll.size() - 1; i >= 1; i--) {
// System.out.print(ll.get(i) + ", ");
// }
// System.out.print(ll.get(0) + "]");

// }

// public static void main(String[] args) {
// LinkedList<Integer> ll = new LinkedList<Integer>();
// for (int i = 0; i < 10; i++) {
// ll.add(0, i);
// }
// System.out.println("Обычный список -> " + ll);
// ReversLinkedList(ll);
// }
// }

// Task2.
// import java.util.LinkedList;
// import java.util.Scanner;

// public class HomeWork {
// public static LinkedList<Integer> Enqueue(LinkedList<Integer> ll) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Введите число: ");
// String element = sc.nextLine();
// ll.addLast(Integer.parseInt(element));
// // sc.close();
// return ll;
// }

// public static LinkedList<Integer> Denqueue(LinkedList<Integer> ll) {

// System.out.println("Первый элемент очереди удалён" + "[" + ll.pollFirst() +
// "]");
// return ll;
// }

// public static int First(LinkedList<Integer> ll) {

// System.out.println("Первый элемент " + "[" + ll.getFirst() + "]" + "
// очереди");
// int element = ll.getFirst();
// return element;
// }

// public static void Menu(LinkedList<Integer> ll) {
// System.out.println("Здравствуйте, эта программа поможет редактировать
// очередь.");
// // Scanner cs = new Scanner(System.in);
// // String choice = "";
// menu: while (true) {
// System.out.println("Введите 1 - что бы поместить элемент в конец очереди");
// System.out.println("Введите 2 - что бы посмотреть и удалить первый элемент");
// System.out.println("Введите 3 - что бы посмотреть первый элемент");
// System.out.println("Введите 4 - что бы посмотреть очередь");
// System.out.println("Введите 5 - что бы закрыть программу");
// System.out.print("Что хотите сделать? -> ");
// Scanner cs = new Scanner(System.in);
// String choice = cs.nextLine();
// // cs.close();

// switch (choice) {
// case ("1"):
// Enqueue(ll);
// System.out.println();
// break;

// case ("2"):
// Denqueue(ll);
// System.out.println();
// break;

// case ("3"):
// First(ll);
// System.out.println();
// break;

// case ("4"):
// System.out.println("Очередь -> " + ll);
// System.out.println();
// break;

// case ("5"):
// System.out.println("До новых встреч.");
// break menu;
// }
// }
// }
// public static void main(String[] args) {
// LinkedList<Integer> ll = new LinkedList<Integer>();
// for (int i = 1; i < 10; i++) {
// ll.add(i);
// }

// Menu(ll);

// }
// }