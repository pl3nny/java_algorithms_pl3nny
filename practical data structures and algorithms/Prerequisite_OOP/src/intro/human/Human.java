package intro.human;

public class Human {

    public String name;
    public String eyeColor;
    public int height_in_feet;

    public void speak()
    {
        System.out.println("Hi there my name is " + name);
        System.out.println("My eye color is " + eyeColor);
        System.out.println("and i am " + height_in_feet + " feet tall");
    }
}
