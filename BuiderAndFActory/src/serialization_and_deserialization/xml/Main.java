package serialization_and_deserialization.xml;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args)  {
        XMLEncoder e = null;
        File file = new File("C:\\Users\\Aram_Vanyan\\Desktop\\Epam\\Java\\DesignPatterns\\BuiderAndFActory\\data\\serial.xml");
//        try {
//            e = new XMLEncoder(
//                    new BufferedOutputStream(
//                            new FileOutputStream("C:\\Users\\Aram_Vanyan\\Desktop\\Epam\\Java\\DesignPatterns\\BuiderAndFActory\\data\\serial.xml")));
//            Demo demo = new Demo();
//            demo.setA(20);
//            demo.setB("Aram");
//            e.writeObject(demo);
//            e.close();
//        } catch (FileNotFoundException ex) {
//            ex.printStackTrace();
//        }
        Demo demo = null;
        try(XMLDecoder xmlDecoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(file)))) {
            demo = (Demo)xmlDecoder.readObject();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

        System.out.println(demo);
    }
}
