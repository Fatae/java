package com.spc.second;

public class hero3 extends Hero{
   private String ID;


    public hero3(String name, int blood, String rank, int fight, String ID) {
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
        System.out.println(getName()+ID+"释放花之印记技能");
        blood-=5;

    }
}
