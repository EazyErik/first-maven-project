public class Main {

    public static void main(String[] args) {
        System.out.println(checkString("asdfasdfasdfsadffancy"));
        System.out.println(Loops.faculty(3));

    }

    public static boolean checkString(String value) {

        return value.length() > 20 && value.contains("fancy");
    }


}
