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
    public void updateLevel(){
        super.updatelevel();
        mana=10*getlevel();
        speed=10*getlevel();
    }
    public void chooseAction(Character target){
        while (true){
            Scanner keyboard =new Scanner(System.in);
            System.out.println("Current HP: "+getHP()+" Current Mana: "+getMana());
            System.out.println("What would you like to do?\n1. Attack\n2. Spell");
            System.out.print("> ");
            String input =keyboard.nextLine();
            if (input=="1"){
                weapon.attack(target);
                break;
            }
            else if (input=="2"){
                System.out.println("Would you like to use 1. lightning or 2. polycondensation?");
                System.out.print("> ");
                input=keyboard.nextLine();
                if (input=="1"){
                    this.spell = new polycondensation();
                    if (spell.getManaReq()>getMana()) {
                        System.out.println("You don't have enough mana to use this spell. Attack or select another spell.");
                    }
                    else {
                        System.out.println(name+"the third uses Polycondensation.");
                        System.out.println("Enemy takes " + spell.cast(this,target) + " damage");
                        break;
                    }
                }
                else if (input=="2"){
                    this.spell = new Lightning();
                    if (spell.getManaReq()>getMana()) {
                        System.out.println("You don't have enough mana to use this spell. Attack or select another spell.");
                    }
                    else {
                        System.out.println(name+"the third uses Lightning.");
                        System.out.println("Enemy takes " + spell.cast(this,target) + " damage");
                        break;
                    }
                }
                else{
                    System.out.println("Invalid input, please try again.");
                }
            }
            else{
                System.out.println("Invalid input, please try again.");
            }
            keyboard.close();
        }
    }
}