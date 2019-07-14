package com.sdp.beans;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) throws Exception {

		DateFormatter df1 = DateFormatter.getInstance();

		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(df1);
		System.out.println("Serialization completed....");

		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		DateFormatter df2 = (DateFormatter) ois.readObject();
		System.out.println("De-Serialization complete...");

		System.out.println("df1==df2 ? :" + (df1 == df2));

	}
}
