import java.util.Random;
import java.util.Scanner;
public  class PlasticSkeleton extends Character{
    public static String CLASS_NAME="Plastic skeleton";
    Weapon weapon;
    Spell spell;
    public PlasticSkeleton(String name,int xp){
        super(name,"Plastic",xp,6);
        setSpeed(11);
        weapon= new PlasticScythe(5,5);
    }
    public void chooseAction(Character target){
        Random rand=new Random();
        int choice=rand.nextInt(3);
        
    }
}