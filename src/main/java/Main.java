public class Main {

    public static void main(String[] args) {
        System.out.println(checkString("asdfasdfasdfsadffancy"));

    }

    public static boolean checkString(String value) {

        return value.length() > 20 && value.contains("fancy");
    }


}
