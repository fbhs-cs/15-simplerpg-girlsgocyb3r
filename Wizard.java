import java.util.Scanner;

public class Wizard extends Character {
    public Spell spell;
    public String CLASS_NAME = "Wizard";
    public Scanner in = new Scanner(System.in);
    public Wizard(String name) {
        super(name,"Plastic",0,5);
        setMana(20);
        setSpeed(10);
        spell = new Gun();
    }

    public void chooseAction(Character target) {
        System.out.print("What do you want to do? (1, 2, 3) > ");
        int option = in.nextInt();
        if (option == 1) {
            System.out.println("Wizard uses Gun");
            System.out.println("Enemy takes " + spell.cast(this,target) + " damage");
        }
        else if (option == 2) {
            System.out.println("Wizard uses ");
        }
        else System.out.println("I don't understand your answer, so you lose your turn.");
    }
}