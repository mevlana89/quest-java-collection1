import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
        ArrayList<Hero> heroes = new ArrayList<>();

        // TODO 2 : Add those heroes to the list
        // name: Black Widow, age: 34
        // name: Captain America, age: 100
        // name: Vision, age: 3
        // name: Iron Man, age: 48
        // name: Scarlet Witch, age: 29
        // name: Thor, age: 1500
        // name: Hulk, age: 49
        // name: Doctor Strange, age: 42

        Hero hero1 = new Hero("Black Widow", 34);
        Hero hero2 = new Hero("Captain America", 100);
        Hero hero3 = new Hero("Vision", 3);
        Hero hero4 = new Hero("Iron Man", 48);
        Hero hero5 = new Hero("Scarlet Witch", 29);
        Hero hero6 = new Hero("Thor", 1500);
        Hero hero7 = new Hero("Hulk", 49);
        Hero hero8 = new Hero("Doctor Strange", 42);
        heroes.add(hero1);
        heroes.add(hero2);
        heroes.add(hero3);
        heroes.add(hero4);
        heroes.add(hero5);
        heroes.add(hero6);
        heroes.add(hero7);
        heroes.add(hero8);

        // TODO 3 : It's Thor birthday, now he's 1501
        hero6.setAge(hero6.getAge()+1);

        // TODO 4 : Shuffle the heroes list
        Collections.shuffle(heroes);

        // TODO 5 : Keep only the half of the list
        List<Hero> heroes2 = heroes.subList(0,4);

        // TODO 6 : Loop throught the list and display the name of the remaining heroes
        for (Hero hero : heroes2)
        {
            System.out.println(hero.getName());
        }
    }
}
