package Enum1;

import Enum1.EnumExercise02.Week;

public class test {
    public static void main(String[] args) {
        System.out.println(Enum_.AUTUMN);
        Week[] weeks = Week.values();
        for(Week week:Week.values()){
            System.out.println(week);
        }

    }
}
