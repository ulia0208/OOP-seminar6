package lsp;

import java.util.ArrayList;
import java.util.List;

public class Program {

    //Тип S будет подтипом Т тогда и только тогда, когда каждому объекту oS типа S
    // соответствует некий объект oT типа T таким образом, что для всех программ P,
    // реализованных в терминах T, поведение P не будет меняться, если oT заменить на oS.
    public static void main(String[] args) {

        Bird bird1=new Bird();
        Bird bird2=new Bird();
        Bird bird3=new Bird();

        Duck duck1=new Duck();
        Duck duck2=new Duck();
//
        Penguin penguin=new Penguin();
//
        List<Bird> birds=new ArrayList<>();

        birds.add(bird1);
        birds.add(duck1);
        birds.add(bird3);
//
        birds.add(penguin);
//
        processFly(birds);
    }
    public static void processFly(List<Bird> birds){
        for(Bird bird:birds){

            if(bird.isCanFly()){
                bird.fly();

            }
        }

    }
}
