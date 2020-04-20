package threads;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created by prategar on 5/18/17.
 */
public class SaveObject {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Reyan Ali";
        e.address = "Phokka Kuan, Ambehta Peer";
        e.SSN = 11122333;
        e.number = 101;

        try {
            FileOutputStream fileOut =
                    new FileOutputStream("/Users/prategar/Downloads/employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in /tmp/employee.ser");
        }catch(IOException i) {
            i.printStackTrace();
        }


        try {
            FileInputStream fis = new FileInputStream("/Users/prategar/Downloads/employee.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Employee e1 = (Employee) ois.readObject();
            e1.mailCheck();
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        }
    }
}

class Employee implements Serializable {
    public String name;
    public String address;
    public transient int SSN;
    public int number;

    public void mailCheck() {
        System.out.println("Mailing a check to " + name + " " + address);
    }
}