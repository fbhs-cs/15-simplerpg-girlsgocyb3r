import java.util.Scanner;

public class Reaper extends Character{
    Weapon weapon;
    public Reaper(String iname){
        super(iname, "Light" ,1,15);
        weapon = new PlasticScythe(7,.15);
        

       
        
    }
    public void updateLevel(){
        super.updatelevel();
        speed=15*getlevel();
    }
    public void killSomeone(){
        
        if(getHP() == getMaxHP()){
            System.out.println("You killed someone to heal but you were already at full health so you killed for no reason good job.");
        }
        else{
            System.out.println("You killed someone but it is ok because they were bad so you healed");
            setHP(getHP() + 3);
        }


    }
    

    @Override
    public void chooseAction(Character target){
        Scanner keyboard =new Scanner(System.in);
        System.out.println("Current HP: "+getHP()+" Current Mana: "+getMana());
        System.out.println("What would you like to do?\n1. Attack(Damage)\n2. KillSomeone(Heal)");
        System.out.print("> ");
        String input =keyboard.nextLine();
        if (input=="1"){
            weapon.attack(target);
        }
        if (input=="2"){
            killSomeone();
        }

        keyboard.close();
    }
}