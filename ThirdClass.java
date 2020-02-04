import java.util.Scanner;
public  class ThirdClass extends Character{
    public static String CLASS_NAME="Third";
    Weapon weapon;
    Spell spell;
    public ThirdClass(String name){
        super(name,"Dark",1,10);
        setMana(10);
        setSpeed(10);
        weapon= new PlasticScythe(5,5);
    } 
    public void chooseAction(Character target){
        Scanner keyboard =new Scanner(System.in);
        System.out.println("Current HP: "+getHP()+" Current Mana: "+getMana());
        System.out.println("What would you like to do?\n1. Attack\n2. Spell");
        System.out.print("> ");
        String input =keyboard.nextLine();
        if (input=="1"){
            weapon.attack(target);
        }
        if (input=="2"){
            spell.cast(this,target);
        }
        keyboard.close();
    }
}