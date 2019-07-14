package com.sdp.bean;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSDP {

	public static void main(String[] args) throws Exception {
		DateFormatter df1 = DateFormatter.getInstance();
		System.out.println(df1.hashCode());

		FileOutputStream fos = new FileOutputStream("fmt.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(df1);
		System.out.println("=====serialization completed....");

		FileInputStream fis = new FileInputStream("fmt.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		DateFormatter df2 = (DateFormatter) ois.readObject();
		System.out.println(df2.hashCode());

	}

}
