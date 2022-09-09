package storage.custome;

import model.entity.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite implements DataFile {
    private ReadAndWrite(){}
    private static ReadAndWrite readAndWrite;

public  static  ReadAndWrite getInstance(){
    if (readAndWrite ==null) readAndWrite=new ReadAndWrite();
    return readAndWrite;
}
    @Override
    public List<Customer> readFile() {
        List<Customer> customList= new ArrayList<>();

        try {
            FileInputStream fis = new FileInputStream("customer.dat");
            ObjectInputStream ois= new ObjectInputStream(fis);
            Object obj = ois.readObject();
            customList=(List<Customer>) obj;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return customList;
    }

    @Override
    public void writeFile(List<Customer> customers) {
        try {
            FileOutputStream fos= new FileOutputStream("customer.dat");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(customers);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
