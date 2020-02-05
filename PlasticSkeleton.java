import java.util.Random;
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
        int choice=rand.nextInt(2);
        if (choice==0){
            System.out.println("The plastic skeleton slices you with its scythe!");
            weapon.attack(target);
        }
        if (choice==1){
            System.out.println("The skeleton rattles its bones at you, reminding you that its plastic could take thousands of years to decompose.");
            if (target.getSpeed()>2){
                System.out.println("Demoralized, your speed falls.");
                target.setSpeed(target.getSpeed()-2);
            }
            else{
                System.out.println("Your speed can't go any lower, but you still take a moment to reflect on this.");
            }
            if(target.getMana()>1){
                target.setMana(target.getMana()-2);
                System.out.println("You lose two mana");
            }

            
        }
    }
}