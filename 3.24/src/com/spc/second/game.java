package com.spc.second;

import java.util.Scanner;

public class game {
        public static void main(String[] args) {
            Hero[] hero=new Hero[4];
            hero[0]=new hero1("李白",100,"",30,"12345");
            hero[1]=new hero2("百里守约",90,"",35,"12346");
            hero[2]=new hero3("貂蝉",110,"",27,"12347");
            hero[3]=new hero4("钟离",1000,"",100,"66666");
            System.out.println("请选择英雄");
            System.out.println("1.李白"+"\t"+"2.百里守约"+"\t"+"3.貂蝉"+"\t"+"4.钟离");
             Scanner scanner = new Scanner(System.in);
            int a=scanner.nextInt();
            switch (a){
                case 1:
                    ((hero1)hero[0]).skill();
                    break;
                case 2:
                    ((hero2)hero[1]).skill();
                    break;
                case 3:
                    ((hero3)hero[2]).skill();
                    break;
                case 4:
                    ((hero4)hero[3]).skill();
            }

        }
    }

