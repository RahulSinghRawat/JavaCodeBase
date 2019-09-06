package com.string.rahul;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class FirstA {

	  int x;
	    FirstA (int x){
	        System.out.print("A");
	        this.x  = x;
	    }
	    FirstA ( ) {
	        System.out.print ("B");
	    }
	}
	class Second extends FirstA implements Serializable {
	    int y;
	    Second(int y){
	        this.y = y;
	        System.out.print("C");
	    }
	    Second(){
	        this(42);
	        System.out.print("D");
	    }
	    public String getUR() {
	        return "["+ x + y + "]";
	    }

	}
	public class Mobile {
	    public  static void main(String[] args) throws Exception {
	        File f = new File("doc2.mmf");
	        FileOutputStream fos = new FileOutputStream(f);
	        ObjectOutputStream obs = new ObjectOutputStream(fos);
	        Second b = new Second();
	        obs.writeObject(b);
	        obs.flush();
	        obs.close();
	        fos.flush();
	        fos.close();
	        Thread.sleep(500);
	        FileInputStream fis = new FileInputStream(f);
	        ObjectInputStream ois = new ObjectInputStream(fis);
	        Second b2 = (Second)ois.readObject();
	        System.out.print(b2.getUR());
	    }
	}