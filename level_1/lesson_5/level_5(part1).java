public class Main {
    public static void main(String[] args) {
        Personal[] persArray = new Personal[5];
        persArray[0] = new Personal("Пупкинос Антов Вячеславович ", "Священник ", "pedobear@gmail.com ", 7777777777l, 1000000, 65);
        persArray[1] = new Personal("Лещев Петя Акробатович ", " подрятчик ", "slonovaya@gmail.com ", 423152314l, 57000, 25);
        persArray[2] = new Personal("Морозов Олежа Макаронович ", "Бандитский Апекс ", "бывалый@gmail.com ", 6456456456l, 50000, 33);
        persArray[3] = new Personal("Петров Вова Лопоухивоч ", "Смотрящий за толчком ", "petrovskiy525@gmail.com ", 439068342l, 15000, 30);
        persArray[4] = new Personal("Труханов Витя Поm ", "помощник бурильщика ", "mks_true_victor@gmail.com ", 443534453, 56000, 44);
        //*******************************************************************************************************
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].oldAge() > 40) {
                System.out.println(persArray[i]);
            }
        }
    }
}


