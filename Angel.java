
import java.util.Random;


public class Angel extends Character{
    Spell spell;
    public Angel(String iname,int ixp){

        super(iname, "Dark" ,ixp,12);
        setMana(20);
        Spell spell = new Lightning(10);
        
       
        
    }
    public void healSomeone(){
        
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
        Random rand=new Random();
        int choice = rand.nextInt(2);
        if(choice == 0){
            spell.cast(this, target);
        }
        if(choice == 1){
            healSomeone();
        }   


        
    }
}