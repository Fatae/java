package Enum1.EnumExercise02;

public enum Week {
    MONDAY("星期一"),FRIDAY("星期五"),
    TUESDAY("星期二"),WEDNESDAY("星期三"),
    THURSDAY("星期四"),SATURDAY("星期六"),
    SUNDAY("星期日");
    private String name;
private Week(String name){
    this.name=name;
}

    @Override
    public String toString() {
        return name;
    }
}
