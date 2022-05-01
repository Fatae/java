public class Plane1 {
//    static String s = "-";
//    public static void main(String[] args) {
//        new Plane1().s1();
//        System.out.println(s);
//    }
//    void s1() {
//        try {
//            s2();
//        } catch (Exception e) {
//            s += "c";
//        }
//    }
//    void s2() throws Exception {
//        s3();
//        s += "2";
//        s3();
//        s = "2b";
//    }
//    void s3() throws Exception {
//        throw new Exception();
//    }
}
class Test {
    static void procedure() {
        try {
            int c[] = { 1 };
            c[42] = 99;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组超越界限异常：" + e);
        }
    }
    public static void main(String args[]) {
        try {
            procedure();
            int a = args.length;
            int b = 42 / a;
            System.out.println("b=" + b);
        } catch (ArithmeticException e) {
            System.out.println("除0异常：" + e);
        }
    }
}