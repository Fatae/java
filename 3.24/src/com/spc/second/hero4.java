package com.spc.second;

public class hero4 extends Hero{
    private String ID;

    public hero4(String name, int blood, String rank, int fight, String ID) {
        super(name, blood, rank, fight);
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void skill(){

        System.out.println(getName()+ID+"释放天动万象技能");
        blood-=5;
    }
}
