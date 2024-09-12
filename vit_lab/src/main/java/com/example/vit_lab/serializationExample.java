package com.example.vit_lab;
import java.io.*;
class objSerialization implements Serializable{
    String name;
    String designation;
    objSerialization(String name,String designation)
    {
        this.name=name;
        this.designation=designation;
    }


    public String toString() {
        System.out.println("emp name: "+name);
        System.out.println("emp designation: "+designation);
        return super.toString();
    }

}
public class serializationExample {
    public static void main(String[] args) {
        try{
            objSerialization obj=new objSerialization("badmosh","chaprasi");
            FileOutputStream fos=new FileOutputStream("objdemo.txt");
            ObjectOutputStream o=new ObjectOutputStream(fos);
            o.writeObject(obj);
            o.flush();
            o.close();

            FileInputStream fis=new FileInputStream("objdemo.txt");
            ObjectInputStream i=new ObjectInputStream(fis);

            objSerialization obj2=new objSerialization(obj.name, obj.designation);
            i.readObject();
            System.out.println("value of obj 2:"+ obj2);


        }catch(NotSerializableException e1){

            System.out.println("io expectoin has occured "+e1.getMessage());
        }
        catch(ClassNotFoundException e2){

            System.out.println("io expectoin has occured "+e2.getMessage());
        }
        catch(IOException e3){

            System.out.println("io expectoin has occured "+e3.getMessage());
        }
    }
}
