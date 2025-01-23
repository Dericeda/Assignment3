package Interfaces;

public class Task9 {

    interface CanMove{
        Double speed();
    }

    interface CanFLy extends CanMove{
        Double speed(Double canFly);
    }

    public static void main(String[] args) throws Exception {

    }



}