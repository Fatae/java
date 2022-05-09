package com.spc.second;

import java.io.*;

public class SerializerEvent {
    public void writeToFile(Event event) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream
                (new FileOutputStream("d:\\ss.dat"));
        objectOutputStream.writeObject(event);
        objectOutputStream.close();
    }
    public void readObject() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("d:\\ss.dat"));
        System.out.println(objectInputStream.readObject());
        objectInputStream.close();
    }
}
