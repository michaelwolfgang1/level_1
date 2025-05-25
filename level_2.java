
public class Main {
    public static void main(String[] args) {
        System.out.println(summStr(12, 20));
        summS2(30);
        System.out.println(summM(20));
        summStr2("Michael\n", 5);
        System.out.println(sumYear(1900)+"\n");
    }


    /**
     *  1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от
     * // 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    public static boolean summStr(int a, int b) {
        int c = a + b;
        return c >= 10 && c <= 20;
    }

    /** 2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать
        в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным
        числом.*/
    public static void summS2(int a) {
        if (a < 0) {
            System.out.println("Отрицательно");
        } else {
            System.out.println("Положительно");
        }

    }
    /** 3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
     *  если число отрицательное, и вернуть false если положительное.*/
    public static boolean summM(int a) {
        return a < 0;
    }
    /**4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать
     *  в консоль указанную строку, указанное количество раз;*/
    public static void summStr2(String s ,int a) {
        for(int i=0;i<a;i++) {
            System.out.print(s+" ");
        }
    }
    /**5. * Написать метод, который определяет, является ли год високосным, и возвращает
     * boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным,
     * кроме каждого 100-го, при этом каждый 400-й – високосный.*/
    public static boolean sumYear(int a) {
        if (a % 400 == 0) {
            return true;
        } else if (a % 100 == 0) {
            return false;
        } else if (a % 4 == 0) {
            return true;
        } else {
            return false;
        }

    }
}


