package task2;

public class Program {

    public static void main(String[] args) {

        System.out.println("Введите заказ:");
        //SaveToJson saveToJson = new SaveToJson();
        Order order=new Order();
        order.inputFromConsole();

       SaveToJson.saveToJson(order);



    }

}
