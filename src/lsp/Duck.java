package lsp;

public class Duck extends Bird{

    public Duck() {
        flySpeed=15;
    }



    public void fly(){
        System.out.printf("Утка летит со скоростью %d \n", flySpeed);
    }
}
