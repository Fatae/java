package com.spc.list_.Exercise;

import java.util.ArrayList;
import java.util.List;

public class Exercise02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book("红楼梦",24.9,"曹雪芹"));
        list.add(new Book("西游记",22.9,"吴承恩"));
        list.add(new Book("水浒传",20.9,"施耐庵"));
        for (Object o :list) {
            System.out.println(o);
        }
        sort(list);
        System.out.println("排序后");
        for (Object o :list) {
            System.out.println(o);
        }

    }
    public static void sort(List list){
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = 0; j < list.size()-1-i; j++) {
                Book book1=(Book)list.get(j);
                Book book2=(Book)list.get(j+1);
                if(book1.getPrice()> book2.getPrice()){
                    list.set(j,book2);
                    list.set(j+1,book1);
                }
            }
        }
    }//对集合进行排序，要先进行向下转型
    // ，后比较大小，最后利用list的set方法交换位置
}
