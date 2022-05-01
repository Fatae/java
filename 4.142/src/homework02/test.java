package homework02;

public class test {
    public static void main(String[] args) {
        try {
            landing.use("spc","123456","spc@.com");
            System.out.println("victory");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
