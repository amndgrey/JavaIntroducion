public class Hw1 {
    //    1. Создать пустой проект в IntelliJ IDEA и прописать метод main()
    public static void main(String[] args) {
    }

    //    2. Создать переменные всех пройденных типов данных, и инициализировать их значения
    public static void second (){
        byte b = 100;
        short sh = 2;
        int i = 1;
        long l = 3;
        float fl = 23423f;
        double d = 3.0;
        char ch = '0';
        boolean bul = true;
        String s = "df";
    }

    //    3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
    public static float thrid (float a, float b, float c, float d){
        return a * (b + (c / d));
    }

    //    4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    public static boolean fouth(int a, int b){
        return 10 <= a + b && a + b <= 20;
    }

    //    5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
    public static void fifth(int a){
        System.out.println(a < 0 ? "-" : "+");
    }

    //    6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
    public static boolean sixth(int i){
        return i < 0;
    }

    //    7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    public static void seventh(String name){
        System.out.printf("Hey, %s!", name);
    }

}