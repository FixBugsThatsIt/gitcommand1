public class AppTest {
    public static void main(String[] args) {
        int result = App.add(2, 3);
        if (result != 5) {
            System.out.println("TEST FAILED: expected 5 but got " + result);
            System.exit(1);
        }
        System.out.println("TEST PASSED");
    }
}
