import java.util.*;
public class Tester {
    public static void main(String[] args) {
        ArrayList<Character> listOfCharacters = new ArrayList<Character>();
        Character person1 = new Character();
        Character person2 = new Character("Nick", true);
        Character person3 = new Human(); // Cloaking Examples
        Character person4 = new Human("Jimmy", true, 200);
        Human person5 = new Human();
        Human person6 = new Wizard();
        Wizard person7 = new Wizard("Gandalf", true, 500, 1000);
        Character person8 = person5; // Aliasing Examples
        Human person9 = person6;
        Wizard person10 = person7;

        listOfCharacters.add(person1);
        listOfCharacters.add(person2);
        listOfCharacters.add(person3);
        listOfCharacters.add(person4);
        listOfCharacters.add(person5);
        listOfCharacters.add(person6);
        listOfCharacters.add(person7);
        listOfCharacters.add(person8);
        listOfCharacters.add(person9);
        listOfCharacters.add(person10);

        System.out.println(listOfCharacters);
    }
}
