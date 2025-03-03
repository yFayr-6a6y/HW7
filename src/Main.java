public class Main {
    public static void main(String[] args) {

        //
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }


        //
        for (int a = 10; a >= 0; a--) {
            System.out.println(a);
        }


        //
        for (int d = 0; d <= 17; d = d + 2) {
            System.out.println(d);
        }


        //
        for (int f = 10; f >= -10; f--) {
            System.out.println(f);
        }


        //
        for (int r = 1904; r < 2096; r = r + 4) {
            System.out.println(r + " год является високосным");
        }


        //
        for (int g = 7; g <= 100; g = g + 7) {
            System.out.println(g);
        }


        //
        for (int k = 1; k <= 512; k = k * 2) {
            System.out.println(k);
        }


        //
        int salary = 29000;
        int total = 0;
        for (int v = 0; v < 12; v++) {
            total = total + salary;
            System.out.println("Месяц " + v + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println(total);


        //
        int salarySecond = 29000;
        int totalSecond = 0;
        for (int i = 0; i < 12; i++) {
            totalSecond = totalSecond + totalSecond / 100;
            totalSecond = totalSecond + salarySecond;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalSecond + " рублей");
        }
        System.out.println(totalSecond);


        //
        int number = 2;
        for (int l = 1; l <= 10; l++) {
            int result = number * l;
            System.out.println(number + "*" + l + "=" + result);
        }
    }
}