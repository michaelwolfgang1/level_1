import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws MyArraySizeException,MyArrayDataException {
        String[][] strings ={{"1","2","3","4"},
                             {"1","2","3","4"},
                             {"1","2","3","4"},
                             {"1","2","3","4"} };

        String[][] strings1 ={{"1","2","3"},
                              {"1","2","3"},
                              {"1","2","3"} };

        String[][] strings2 ={{"1","2","3","4"},
                              {"1","2","asdfs","4"},
                              {"1","2","3","4"},
                              {"1","2","3","4"} };

        somethingArray(strings);
        somethingArray(strings1);
        somethingArray(strings2);
    }

    //TODO 1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4, при подаче массива
    // другого размера необходимо бросить исключение MyArraySizeException.

    public static int somethingArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
         if (array.length != 4) {
             throw new MyArraySizeException();
         }
        System.out.println(" Успешно прошел по исключению MyArraySizeException ");

        //TODO 2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать.
        // Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или
        // текст вместо числа), должно быть брошено исключение MyArrayDataException, с детализацией в какой именно
        // ячейке лежат неверные данные.
         int count = 0;
for(int i = 0 ; i<array.length; i++){
    for (int j = 0; j< array[i].length; j++){
        try{
            count+=Integer.parseInt(array[i][j]);
        } catch (NumberFormatException e) {
            throw new MyArrayDataException(i,j);
        }
    }
        }
        System.out.println(" Успешно прошел по исключению MyArrayDataException ");
System.out.println(" Cумма всех чисел массива : " + count);
return count;
    }
}



