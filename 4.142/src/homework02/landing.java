package homework02;

public class landing {
    public static void use(String name, String psd, String email) {
        int l = name.length();
        if (!(l >= 2 && l <= 4)) {
            throw new RuntimeException("长度不对");
        }
        if (!(psd.length() == 6 && isDigital(psd))) {
            throw new RuntimeException("密码长度或格式不对");
        }
        int i = email.indexOf('@');
        int j = email.indexOf('.');
        if(!(i>0&&j>i)){
            throw new RuntimeException("邮箱格式不对");
        }

    }

    public static boolean isDigital(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i <chars.length; i++) {
            if (chars[i]<'0'||chars[i]>'9'){
                return false;
            }
        }
        return true;
    }
}
