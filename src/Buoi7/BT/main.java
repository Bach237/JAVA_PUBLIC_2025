package Buoi7.BT;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
//        Shape[] shapes = new Shape[3];
//
//        shapes[0] = new Circle(4);
//        shapes[1] = new Rectangle(3, 4);
//        shapes[2] = new Circle(2);
//
//        for(int i = 0; i < 3; i++){
//            System.out.printf("%.2f\n", shapes[i].area());
//        }

//        ArrayList<Movable> arr = new ArrayList<>();
//        Movable car1 = new Car();
//        Movable car2 = new Car();
//        Movable car3 = new Car();
//        Movable bike1 = new Bike();
//        Movable bike2 = new Bike();
//        arr.add(car1);
//        arr.add(car2);
//        arr.add(car3);
//        arr.add(bike1);
//        arr.add(bike2);
//
//        for(int i = 0; i < arr.size(); i++){
//            arr.get(i).move();
//        }

        Animal[] animals= new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Bird();

        for(int i = 0; i < 3; i++){
            animals[i].makeSound();
        }

    }
}
