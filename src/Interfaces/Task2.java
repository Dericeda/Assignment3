package Interfaces;

public class Task2 {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public class Dog implements CanEat, CanMove {
        @Override
        public void move(){

        }

        @Override
        public void eat(){

        }

    }

    public class Duck implements CanEat, CanFly, CanMove{
        @Override
        public void eat(){

        }

        @Override
        public void fly(){

        }

        @Override
        public void move(){

        }
    }

    public class Car implements CanMove{
        @Override
        public void move(){

        }
    }

    public class Airplane  implements CanMove, CanFly{
        @Override
        public void move(){

        }

        @Override
        public void fly(){

        }
    }
}