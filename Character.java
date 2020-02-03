public abstract class Character{
    private int hp;
    private int xp;
    private String weakness;
    private String name;
    private static String CLASS_NAME = "Person";
    private int speed;
    private int mana;
    private int baseHp;
    public Character(String iname,String iweakness,int ixp,int baseHp){
        hp=baseHp*(int)Math.sqrt(ixp);
        name=iname;
        xp=ixp;
        weakness=iweakness;
        speed=5;
        mana=0;
    }
    public int getMana(){
        return mana;
    }
    public void setMana(int amount){
        mana=amount;
    }
    public int getHP(){
        return hp;
    }
    public void setHP(int amount){
        hp=amount;
    }
    public void setLevel(int level){
        xp=level;
    }
    public void addXP(int exp){
        xp+=exp;
    }
    public int getXP(){
        return xp;
    }
    public int getLevel(){
        return (int) Math.sqrt(xp);
    }
    private int getMaxHP(){
        return baseHp*((int) Math.sqrt(xp));
    }
    public boolean isWeakTo(String type){
            if (weakness.equals(type)){
                return true;
            }
        return false;
    }
    public String getName(){
        return name;
    }
    public abstract void chooseAction(Character target);
    public void takeDmg(int dmg){
        hp-=dmg;
        if (hp<0) hp=0;
    }
    public boolean isAlive(){
        if (hp<=0) return false;
        return true;
    }
    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int num){
        speed=num;
    }
    public String toString(){
        return name+" is a level "+getLevel()+" "+CLASS_NAME
        +" with a speed of "+speed+" and a weakness to "+weakness;
    }
}