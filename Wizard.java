import java.util.Scanner;

public class Wizard extends Character {
    public Spell spell;
    public String CLASS_NAME = "Wizard";
    public Scanner in = new Scanner(System.in);
    public Wizard(String name) {
        super(name,"Plastic",1,5);
        setMana(20);
        setSpeed(5);
        spell = new Gun();
    }
    public void updateLevel(){
        super.updatelevel();
        mana=20*getlevel();
        speed=5*getlevel();
    }

    public void chooseAction(Character target) {
        System.out.print("What do you want to do? (1, 2, 3) > ");
        int option = in.nextInt();
        if (option == 1) {
            this.spell = new Gun();
            if (spell.getManaReq()>getMana()) {
                System.out.println("You don't have enough mana to use this spell.");
            }
            else {
                // this.spell = spell;
                System.out.println("Wizard uses Gun.");
                System.out.println("Enemy takes " + spell.cast(this,target) + " damage");
            }
        }
        else if (option == 2) {
            this.spell = new polycondensation();
            if (spell.getManaReq()>getMana()) {
                System.out.println("You don't have enough mana to use this spell.");
            }
            else {
                System.out.println("Wizard uses Polycondensation.");
                System.out.println("Enemy takes " + spell.cast(this,target) + " damage");
            }
        }
        else if (option == 3) {
            this.spell = new Lightning();
            if (spell.getManaReq()>getMana()) {
                System.out.println("You don't have enough mana to use this spell.");
            }
            else {
                System.out.println("Wizard uses Lightning.");
                System.out.println("Enemy takes " + spell.cast(this,target) + " damage");
            }
        }
        else System.out.println("I don't understand your answer, so you lose your turn.");
        if (getMana()<getlevel()*20){
            setMana(getlevel()+getMana());
            if (getMana()>getlevel()*20){
                setMana(getlevel()*20)
            }
        }
    }
}