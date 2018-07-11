import java.util.Scanner;

public class PetQuestions
{
    public static void main( String[] args )
    {
        Scanner mouse = new Scanner (System.in);

        String name;
        String breed;
        int age;

        System.out.print( "Greetings. What is your pet's name? " );
        name = mouse.next();

        System.out.print( "What kind of animal is " + name + "? " );
        breed = mouse.next();

        System.out.print( "How old is " + name + "? ");
        age = mouse.nextInt();


        System.out.println( name + " is your " + breed + " and it is " + age );
    }
}
