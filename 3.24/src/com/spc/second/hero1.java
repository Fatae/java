package com.spc.second;

public class hero1 extends Hero{
    private String ID;


    public hero1(String name, int blood, String rank, int fight, String ID) {
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
        System.out.println(getName()+ID+"释放将进酒技能");
        blood-=5;
    }
}
