package com.spc.second;

public class Hero {

        private String name;
        public int blood;
        private String rank="倔强青铜";
        private int fight;

        public Hero(String name, int blood, String rank, int fight) {
            this.name = name;
            this.blood = blood;
            this.rank = rank;
            this.fight = fight;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getFight() {
        return fight;
    }

    public void setFight(int fight) {
        this.fight = fight;
    }

    public void skill(){

        }
 }

