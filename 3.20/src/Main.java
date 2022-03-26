import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NotePad notePad = new NotePad();
        notePad.color = "红色";
        notePad.brand = "联想";
        notePad.CPU = "ss";
        notePad.harddisk = "d";
        notePad.memory = "sanxing";
        System.out.println(notePad.show());

    }
}

class computer {
    String CPU;
    String memory;
    String harddisk;

    public String getDetails() {
        return "CPU=" + CPU + "内存=" + memory + "硬盘=" + harddisk;
    }
}

class PC extends computer {
    String brand;
}

class NotePad extends PC {
    String color;

    public String show() {
        return "cpu=" + CPU + "内存=" + memory + "硬盘=" + harddisk
                + "brand=" + brand + "color=" + color;
    }
}


