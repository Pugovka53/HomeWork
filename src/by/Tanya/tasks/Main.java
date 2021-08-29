package by.Tanya.tasks;

public class Main {
    public static void main(String args[]) {

    }


    static void resultWeek() {
        double distance = 10;
        int persent = 10;

        double sum = distance;
        for (int count = 1; count < 7; count++) {
            distance += distance / 100 * persent;
            sum = sum + distance;
        }
        System.out.println(sum);
    }


    static void mult(int a, int b) {
        int count = 0;
        int sum = 0;
        int limit = b;
        if (b < 0) {
            limit = b * -1;
        }

        for (count = 0; count < limit; count++) {
            sum += a;
        }
        if (b < 0) {
            sum = -sum;
        }
        System.out.println(sum);
    }


    static void sumOfOddNumbers() {
        int start = 1;
        int end = 99;
        int sum = 0;
        while (start <= end) {

            if (start % 2 == 1) {
                System.out.println(start);
                sum += start;
            }

            ++start;
        }
        System.out.println(sum);
    }


    static void evenNumbers() {
        int start = 2;
        int end = 100;
        while (start <= end) {
            System.out.println(start);
            start += 2;
        }
    }


    static void cells() {
        int cells = 1;
        int hourLimit = 24;
        int currenthour = 3;

        while (currenthour < hourLimit) {
            currenthour += 3;
            cells *= 2;

            System.out.printf("%d h - %d cells\n", currenthour, cells);


        }
    }


    static void sum() {
        long y = 1;
        long sum = 0;

        while (y <= 256) {
            System.out.println(y);
            sum += y;
            y *= 2;
        }
        System.out.println(sum);
    }


    static void doesTriangleExist(int a, int b, int c) {
        if (
                a < b + c &&
                        b < a + c &&
                        c < b + a) {
            System.out.println("Треугольни существует! :)");
        } else {
            System.out.println("\"Треугольни не существует! :((");
        }
    }


    static void compare(int x, int y) {
        if (x > y) {
            System.out.println(x);
        } else {
            System.out.println(y);
        }
    }


    static void posNeg(long a, long b, long c) {
        int counterPos = 0;
        int counterNeg = 0;
        if (a > 0) {
            counterPos++;
        }
        if (a < 0) {
            counterNeg++;
        }
        if (b > 0) {
            counterPos++;
        }
        if (b < 0) {
            counterNeg++;
        }
        if (c > 0) {
            counterPos++;
        }
        if (c < 0) {
            counterNeg++;
        }
        System.out.printf("%d,%d,%d - %d положителных, %d отрицательных\n", a, b, c, counterPos, counterNeg);
    }


    static void posNumber(int a, int b, int c) {
        int counterBobo = 0;
        if (a > 0) {
            counterBobo++;
        }
        if (b > 0) {
            counterBobo++;
        }
        if (c > 0) {
            counterBobo++;
        }
        System.out.printf("%d, %d, %d - %d положительных\n", a, b, c, counterBobo);
    }

    static void funNumber(int num) {
        int resultNumber = num;
        if (resultNumber > 0) {
            ++resultNumber;
        } else if (resultNumber < 0) {
            resultNumber -= 2;
        } else {
            resultNumber = 10;
        }


        System.out.printf("%d - %d\n", num, resultNumber);

    }


    static void countNumberOfDigitsAndPrintResult(long number) {
        String posNeg = "";
        if (number > 0) {
            posNeg = "положительное";
        } else if (number < 0) {
            posNeg = "отрицательное";
        }
        long num = number;
        long count = number == 0 ? 1 : 0;
        while (num != 0) {
            num = num / 10;
            ++count;
        }

        System.out.printf("%d - %s %d-значное число\n", number, posNeg, count);
    }

}