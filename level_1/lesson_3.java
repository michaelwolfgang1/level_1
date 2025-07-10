import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n" + "Задача 1:");

        /*TODO 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
            С помощью цикла и условия заменить 0 на 1, 1 на 0;*/
        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array1.length; i++) {

            if (array1[i] == 1) {
                array1[i] = 0;
            } else {
                array1[i] = 1;
            }
            System.out.print(array1[i] + " ");
        }
        System.out.println("\n" + "Задача 2:");



        /*TODO 2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить
         * его значениями 1 2 3 4 5 6 7 8 … 100;**/
        int[] array2 = new int[100];
        for (int h = 0; h < 100; h++) {
            array2[h] = h + 1;
            System.out.print(array2[h] + " ");
        }
        System.out.println("\n" + "Задача 3:");



        /*TODO 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
         * пройти по нему циклом, и числа меньшие 6 умножить на 2;*/
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int a = 0; a < array3.length; a++) {
            if (array3[a] < 6) {
                array3[a] *= 2;
            }
            System.out.print(array3[a] + " ");
        }
        System.out.println("\n" + "Задача 4:");



        /*TODO 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью
         * цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
         * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть
         * [0][0], [1][1], [2][2], …, [n][n];*/
        int[][] array4 = new int[5][5];
        for (int d = 0; d < array4.length; d++) {
            for (int c = 0; c < array4.length; c++) {
                if (d == c) {
                    array4[d][c] = 1;
                } else if ((d + c) == array4.length - 1) {
                    array4[d][c] = 1;
                }
                System.out.print(array4[d][c] + " ");
            }
            System.out.println();
        }

        System.out.println("\n Задача 5:");
        System.out.println(Arrays.toString(lenValue(3, 6)));


        System.out.println("\n Задача 6:");
        /*TODO 6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;*/
        int[] array5 = {-4, 5, 1, 2, 6, 4, -6, 2, 9, 1};
        int max = array5[0];
        int min = array5[0];
        for (int z = 0; z < array5.length; z++) {
            if (array5[z] > max) {
                max = array5[z];
            } else if (array5[z] < min) {
                min = array5[z];
            }
        }
        System.out.print(max + " Максимум\n");
        System.out.print(min + " Минимум\n");


        System.out.print(" Задача 7:\n "+ checkBalanced(new int[]{2, 3, 4, 5, 6, 7})+"\n");


        System.out.println(" Задача 8:\n" + Arrays.toString(tikitaki(new int[]{1, 8, 3, 4}, 2)));
    }



    /*TODO 5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный
           массив типа int длиной len, каждая ячейка которого равна initialValue;*/
    static public int[] lenValue(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    /**
     * TODO 7. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть
     * true, если в массиве есть место, в котором сумма левой и правой части массива равны.
     * *Примеры:
     * checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
     * checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
     * граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.
     */
    public static boolean checkBalanced(int[] array5) {
        for (int i = 0; i < array5.length; i++) {
            int left = 0;
            int right = 0;
            for (int j = 0; j < i + 1; j++) {
                left += array5[j];
            }
            for (int h = array5.length - 1; h > i; h--) {
                right += array5[h];
            }
            if (left == right)
                return true;
        }
        return false;
    }
    /**TODO 8. *** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или
     *  отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
     *  Для усложнения задачи нельзя пользоваться вспомогательными массивами. Примеры:
     *  [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
     *  При каком n в какую сторону сдвиг можете выбирать сами.
     Если выполнение задач вызывает трудности, можете обратиться к последней странице методического пособия. Для задач
     со * не нужно искать решение в интернете, иначе нет смысла их выполнять.*/
    public static int[] tikitaki (int[] array, int n) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int lastArl = array[array.length - 1];
                for (int j = array.length - 1; j > 0; j--) {
                    array[j] = array [j - 1];
                }
                array[0] = lastArl;
            }
        } else if (n < 0) {
            for (int i = 0; i > n; i--) {
                int firstArl = array[0];
                for (int j = 0; j < array.length - 1; j++) {
                    array[j] = array [j + 1];
                }
                array[array.length - 1] = firstArl;
            }
        }
        return array;
    }
}