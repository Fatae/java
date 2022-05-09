package com.spc.second;

import java.io.IOException;

public class test {
    public static void main(String[] args) {
        SerializerEvent serializerEvent = new SerializerEvent();
        try {
            serializerEvent.writeToFile(new Event("run","playground",new Athlete("spc",19,"China")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            serializerEvent.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
