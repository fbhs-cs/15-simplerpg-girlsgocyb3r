public class Zombie extends Character {
    Weapon weapon;
    public Zombie(String name) {
        super(name,"Plastic",0,12);
        setMana(20);
        setSpeed(5);
        Spell spell = new Lightning();
    }
}