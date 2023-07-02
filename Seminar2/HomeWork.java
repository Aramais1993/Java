// Task 1.
// Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации
// запишите в лог-файл.
// 1 3 4 2
// 1 3 2 4
// 1 2 3 4

// public class HomeWork {

// public static void main(String[] args) {
// int[] sortArr = { 1, 3, 4, 2, 6, -10, 8, -5 };
// System.out.println("\n");
// System.out.print("Заданная строка : ");
// for (int s = 0; s < sortArr.length; s++) {
// System.out.print(sortArr[s] + " ");
// }
// System.out.println("\n");
// for (int i = 0; i < sortArr.length; i++) {
// if (i == sortArr.length - 1)
// System.out.print("Регзультат : ");
// for (int s = 0; s < sortArr.length; s++) {
// System.out.print(sortArr[s] + " ");
// }
// System.out.println("\n");
// for (int j = 0; j < sortArr.length - i - 1; j++) {
// if (sortArr[j + 1] < sortArr[j]) {
// int swap = sortArr[j];
// sortArr[j] = sortArr[j + 1];
// sortArr[j + 1] = swap;
// }
// }
// }
// }
// }

// Task 2. Напишите метод, который определит тип (расширение) файлов из текущей
// папки и выведет в консоль результат вида:
// - Расширение файла: txt
// - Расширение файла: pdf
// - Расширение файла:
// - Расширение файла: jpg

// import java.io.File;
// import java.util.ArrayList;
// import java.util.List;

// public class HomeWork {
// public static void main(String[] args) {
// List<String> files = get_files();
// for (String file : files)
// System.out.println(file + " - Расширение: " + get_extention(file));
// }

//
// * получает расширение из имени файла
// * @param file название файла
// * @return строка содержащая расширение файла file
//
// public static String get_extention(String file) {
// int index = file.lastIndexOf(".");
// if (index == -1)
// return "";
// return file.substring(index + 1);
// }

// * Возвращает список из имен файлов в текущей дирректории.
// * @return список из имен файлов

// public static List<String> get_files() {

// File dir = new File(".");

// File[] files;
// try {
// files = dir.listFiles();
// } catch (Exception ex) {
// ex.printStackTrace();
// return null;
// }
// if (files == null)
// return null;

// List<String> list = new ArrayList<String>();
// for (File file : files)
// if (file.isFile())
// list.add(file.getName());

// return list;
// }
// }