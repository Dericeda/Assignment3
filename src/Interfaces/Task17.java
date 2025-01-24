package Interfaces;

public class Task17 {

    public static void main(String[] args) throws Exception {
        Fox bigFox = new BigFox();
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());
    }

    public interface Animal {
        String getColor();
    }
    public class Color {
        public static final String RED = "RED";
        public static final String GREEN = "GREEN";
        public static final String BLUE = "BLUE";
    }
    abstract public static class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }

    public  static class BigFox extends Fox{
        @Override
        public String getColor() {
            return Color.RED;
        }
    }

}