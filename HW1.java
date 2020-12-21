import java.io.IOException;

public class HW1 {
    public static void main(String[] args) throws IOException {
        byte bt = 1;
        int in = 20;
        short sh = 300;
        long lg = 4000;
        float fl = 0.5f;
        double db = 0.000006d;
        System.out.println("Переменная типа byte равна " + bt + "\n" +
                "Переменная типа int равна " + in + "\n" + "Переменная типа short равна " +
                sh + "\n" + "Переменная типа long равна " + lg + "\n" +
                "Переменная типа float равна " + fl + "\n" + "Переменная типа double равна " + db + "\n");

        float a = 0.7f, b = 0.8f, c = 0.9f, d = 1.0f; // 3
        float result = result(a, b, c, d);
        System.out.println(result + "\n");

        int e = 11, f = 12; // 4
        boolean sum = sum(e, f);
        if (sum == true)
            System.out.println("Сумма чисел находится в промежутке от 10 до 20" + "\n");
        else
            System.out.println("Сумма чисел находится вне промежутка от 10 до 20" + "\n");

        int g = -13; // 5
        boolean num = positiveNum(g);
        if (num == true)
            System.out.println("Число положительное" + "\n");
        else
            System.out.println("Число отрицательное" + "\n");

        int h = -14;
        boolean num2 = positiveNum2(h); // 6
        System.out.println(num2 + "\n");

        String name = "Вася"; // 7
        String hello = name(name);
        System.out.println(hello + "\n");

        int year = 2020; // 8
        boolean leapYear = year(year);
        //System.out.println(leapYear);
        if (leapYear == true)
            System.out.println("Год является високосным" + "\n");
        else
            System.out.println("Год не является високосным" + "\n");
    }

    public static float result(float a, float b, float c, float d){ // 3
        float result = a * (b + c / d);
        return result;
    }

    public static boolean sum(int a, int b){ // 4
        if (a + b >= 10 && a + b <= 20)
            return true;
        else
            return false;
    }

    public static boolean positiveNum(int a){ // 5
        return a >= 0;
    }

    public static boolean positiveNum2(int a){ // 6
        if (a < 0)
            return true;
        else
            return false;
    }

    public static String name(String name){ // 7
        String hello = "Привет, " + name;
        return hello;
    }

    public static boolean year(int year){ // 8
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
            return true;
        else
            return false;
    }
}
