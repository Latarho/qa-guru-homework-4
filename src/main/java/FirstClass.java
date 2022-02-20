public class FirstClass {
    // Примитивы
    byte aByte; // 8 bit -128 ... 127
    short aShort = 100 ; // 16 bit -32768 ... 32767

    // самый используемый
    int aInt = 1_100_000; // 32 bit -2 ^ 31 ... (2 ^ 31) -1
    long aLong = 100L; // 64 bit -2 ^ 63 ... (2 ^ 63) -1

    float aFloat = 0.0F; // 32 bit
    // самый используемый (если просто хранить, но не использовать арифметику)
    double aDouble = 0.0D; // 64 bit

    char aChar = 'c';
    boolean aBoolean = false;

    // Ссылочный тип или объект
    String aString = "hello, qa.guru!";

    public static void main(String[] args) {
        int a = 8;
        int b = 9;
        int c = 5;
        int d = 6;

        // Логическими операторы
        // Вернет ТРУ
        if ((a != b) || (c < d)) {
            System.out.println("ТРУ");
        } else {
            System.out.println("ФОЛС");
        }
        // Вернет ФОЛС
        if ((a | b) < (c | d)) {
            System.out.println("ТРУ");
        } else {
            System.out.println("ФОЛС");
        }

        System.out.println(a < b);

        // Арифметические операторы
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a + 1);
        System.out.println(a++);
        System.out.println(a);

        System.out.println(--a);
        System.out.println(a--);
        System.out.println(a);

        // Переполнение int
        int e = 2147483647;
        int i = 1;
        // Отрицательное число
        System.out.println("Переполнение " + (e + i));
        // Положительное число
        int f = -2147483648;
        int j = -1;
        System.out.println("Переполнение " + (f + j));
    }
}