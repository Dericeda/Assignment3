package Interfaces;

public class Task16 {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        Color getColor();

        Integer getAge();
    }
     class Color{}

     abstract public static class Fox implements  Animal{
        public String getName() {
            return "Fox";
        }
    }
}