package Interfaces;

public class Task4 {
    public static void main(String[] args) {
    }
    //add public interfaces and a public class here - добавь public интерфейсы и public класс тут

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }

    abstract public class Human implements CanRun, CanSwim {

    }

}