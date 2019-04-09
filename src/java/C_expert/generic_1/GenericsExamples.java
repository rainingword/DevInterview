package generic;

import java.util.List;

class Fruit {
    @Override
    public String toString() {
        return "I am a Fruit !!";
    }
}

class Banana extends Fruit {
    @Override
    public String toString() {
        return "I am an Banana !!";
    }
}

class Apple extends Fruit {
    @Override
    public String toString() {
        return "I am an Apple !!";
    }
}

class AsianApple extends Apple {
    @Override
    public String toString() {
        return "I am an AsianApple !!";
    }
}

class BlueApple extends Apple {
    @Override
    public String toString() {
        return "I am an BlueApple !!";
    }
}

public class GenericsExamples
{
    public static void main(String[] args)
    {

        List<? super Apple> basket = null;

        basket.add(new Apple());      //Successful
        basket.add(new AsianApple()); //Successful
        //basket.add(new Fruit());      //Compile time error ,why?


    }
}
