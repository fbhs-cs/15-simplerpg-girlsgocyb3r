public class Character{
    private int hp;
    private int xp;
    private String[] weakness;
    private String name;
    private static String CLASS_NAME = "Default";
    private int speed;
    public Character(String iname,String[] iweakness,int ixp){
        hp=10*(int)Math.sqrt(ixp);
        name=iname;
        xp=ixp;
        weakness=iweakness;
        speed=5;
    }
    public int getHp(){
        return hp;
    }
    public void setHp(int amount){
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
        return 10*((int) Math.sqrt(xp));
    }
    public boolean isWeakTo(String type){
        for (String weak:weakness){
            if (type.equals(weak)){
                return true;
            }
        }
        return false;
    }
    public String getName(){
        return name;
    }
    public void attack(Character target){
        System.out.println("You egg!");
    }
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
}