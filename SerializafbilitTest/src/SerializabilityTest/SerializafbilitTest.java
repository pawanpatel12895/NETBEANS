/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SerializabilityTest;

import com.sun.corba.se.impl.io.IIOPOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author pawan
 */
public class SerializafbilitTest {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException 
    {
        MyObj O1 = new MyObj(),O2 = new MyObj();
        O1.setA("I am ");
        O1.setB("Groot");
    
        //Write Operation
        FileOutputStream fout  = new FileOutputStream("serializableTest.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fout);
        oos.writeObject(O1);
        
        //Read Operation
        FileInputStream fin = new FileInputStream("serializableTest.txt");
        ObjectInputStream ois = new ObjectInputStream(fin);
        O2 = (MyObj) ois.readObject();
    
        System.out.println(O1.getA() + O1.getB());
        System.out.println(O2.getA() + O2.getB());
    }
    
}
