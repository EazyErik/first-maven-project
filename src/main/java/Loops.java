

public class Loops {

public static int faculty(int number) {
    if (number == 0) {
        return 1;
    } else {
        int count = 1;
        for (int i = 1; i <= number; i++) {
            count *= i;

        }
        return count;
    }

}
}
