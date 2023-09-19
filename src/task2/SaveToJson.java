package task2;

import java.io.FileWriter;
import java.io.IOException;

public abstract class SaveToJson{
     static void saveToJson(Order order){
        String filename="order.json";

        System.out.println();

        try(FileWriter writer=new FileWriter(filename,false)){
            writer.write("{\n");
            writer.write("\"clientName - имя\":\""+order.getClientName()+"\",\n");
            writer.write("\"product\":\""+order.getProduct()+"\",\n");
            writer.write("\"qnt\":\""+order.getQnt()+"\",\n");
            writer.write("\"price\":\""+order.getPrice()+"\",\n");
            writer.write("}\n");
            writer.flush();
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }

    }

//    static void saveToJson() {
//    }
}
