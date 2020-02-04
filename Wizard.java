import java.util.Scanner;

public class Wizard extends Character {
    private Spell spell;
    private String CLASS_NAME;
    public Scanner in = new Scanner(System.in);
    public Wizard(String name, Spell spell) {
        super(name,"Plastic",1,5);
        // this.spell = spell;
        this.CLASS_NAME = "Wizard";
    }
    public void chooseAction(Character target) {
        System.out.print("What do you want to do? (1, 2, 3) > ");
        int option = in.nextInt();
        if (option == 1) {
            this.spell = Gun;
            System.out.println("Wizard uses Gun");
            System.out.println("Enemy takes " + spell.cast(Wizard,Reaper) + " damage");
        }
        else if (option == 2) {
            System.out.println("Wizard uses ");
        }
        else if (option == 3) {
            System.out.println("Wizard uses ");
        }
        else System.out.println("I don't understand your answer, so you lose your turn.");
    }
} 