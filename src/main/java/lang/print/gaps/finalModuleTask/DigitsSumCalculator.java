package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {

        int sum = 0;
        int lastDigit;

        lastDigit = number % 10; // 4
        sum = sum + lastDigit; // 4
        number = number / 10; // 123

        lastDigit = number % 10; // 3
        sum = sum + lastDigit; // 7
        number = number / 10; // 12

        lastDigit = number % 10; // 2
        sum = sum + lastDigit; // 9
        number = number / 10; // 1

        lastDigit = number % 10; // 1
        sum = sum + lastDigit; // 10

        System.out.println(sum);


    }

    }
