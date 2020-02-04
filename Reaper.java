import java.util.Scanner;

public class Reaper extends Character{
    Weapon weapon;
    public Reaper(String iname,int ixp){

        super(iname, "Light" ,ixp,15);

       
        
    }
    public void killSomeone(){
        if(getHP() == 15);
        else{
            setHP(getHP() + 3);
        }


    }
    

    @Override
    public void chooseAction(Character target){
        



        
        


    }
















    
}