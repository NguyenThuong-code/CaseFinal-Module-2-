package storage.food;


import model.entity.RestaurantFood;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFood implements FoodData{
    private ReadAndWriteFood(){}
    private static ReadAndWriteFood readAndWriteFood;

    public  static ReadAndWriteFood getInstance(){
        if (readAndWriteFood ==null) readAndWriteFood=new ReadAndWriteFood();
        return readAndWriteFood;
    }
    @Override
    public List<RestaurantFood> readFile() {
        List<RestaurantFood> foods= new ArrayList<>();

        try {
            FileInputStream fis = new FileInputStream("food.dat");
            ObjectInputStream ois= new ObjectInputStream(fis);
            Object obj = ois.readObject();
            foods=(List<RestaurantFood>) obj;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return foods;
    }

    @Override
    public void writeFile(List<RestaurantFood> foods) {
        try {
            FileOutputStream fos= new FileOutputStream("food.dat");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(foods);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
