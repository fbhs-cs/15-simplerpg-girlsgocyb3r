public  class ThirdClass extends Character{
    public static String CLASS_NAME="Third";

    public ThirdClass(String name){
        super(name,"Dark",1,10);
        setMana(10);
        setSpeed(10);
    } 
    public void chooseAction(){
        System.out.println("Current HP: "+getHP()+" Current Mana: "+getMana());
    }
}