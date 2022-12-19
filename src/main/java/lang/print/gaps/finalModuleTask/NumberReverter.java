package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {

        int lastDigit, reverse;

        reverse = 0;

        lastDigit = number % 10;
        reverse = reverse * 10 + lastDigit;
        number = number / 10;

        lastDigit = number % 10;
        reverse = reverse * 10 + lastDigit;
        number = number / 10;

        lastDigit = number % 10;
        lastDigit = reverse * 10 + lastDigit;

        System.out.println(lastDigit);
    }
}
