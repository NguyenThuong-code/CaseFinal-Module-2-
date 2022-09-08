package storage.beverage;

import model.Customer;
import model.RestaurantBeverage;
import model.RestaurantFood;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteBeverage implements BeverageData{
    private ReadAndWriteBeverage(){}
    private static ReadAndWriteBeverage readAndWriteBeverage;

    public  static ReadAndWriteBeverage getInstance(){
        if (readAndWriteBeverage ==null) readAndWriteBeverage=new ReadAndWriteBeverage();
        return readAndWriteBeverage;
    }
    @Override
    public List<RestaurantBeverage> readFile() {
        List<RestaurantBeverage> beverages= new ArrayList<>();

        try {
            FileInputStream fis = new FileInputStream("beverage.dat");
            ObjectInputStream ois= new ObjectInputStream(fis);
            Object obj = ois.readObject();
            beverages=(List<RestaurantBeverage>) obj;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return beverages;
    }

    @Override
    public void writeFile(List<RestaurantBeverage> customers) {
        try {
            FileOutputStream fos= new FileOutputStream("beverage.dat");
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
