package third.seminar.hw;

public class EvenOddNumberChecker {

    public String evenOddNumber(int numberToCheck) {
        if (numberToCheck % 2 == 0) {
            return "четное";
        } else {
            return "нечетное";
        }
    }
}
