public class MyArrayDataException extends Exception{
    public MyArrayDataException(int a, int b){
        System.out.println(" неверные данные в ячейке "+ a +" "+ b);
    }
}
