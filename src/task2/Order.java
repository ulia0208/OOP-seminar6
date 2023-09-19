package task2;

import task1.SquareDrawer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Order{

    private String clientName;

    private String product;
    private int qnt;
    private int price;


    public Order(String clientName, String product, int qnt, int price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }

    public Order() {

    }

    public String getClientName() {

        return clientName;
    }

    public String getProduct() {

        return product;
    }

    public int getQnt() {

        return qnt;
    }

    public int getPrice() {

        return price;
    }

    public void inputFromConsole(){
        clientName=Prompt.prompt("Client name: ");
        product=Prompt.prompt("Product: ");
        qnt=Integer.parseInt(Prompt.prompt("Quantity: "));
        price=Integer.parseInt(Prompt.prompt("Prise: "));

    }




//
//    private String prompt(String message){
//        Scanner in=new Scanner(System.in);
//        System.out.println(message);
//        return  in.nextLine();
//    }



}
