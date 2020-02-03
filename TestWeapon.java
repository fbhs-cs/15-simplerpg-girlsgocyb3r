public class TestWeapon{
    public static void main(String[] args) {
        Weapon Excalibur=new Weapon(2,"Fire",.2);
        Character Hero=new Character("Bob","Fire",1);
        Character Hero2=new Character("Steve","Not fire",400);
        System.out.println(Excalibur.toString());
        Excalibur.attack(Hero);
        System.out.println(Hero.getHP());
        Excalibur.attack(Hero2);
        System.out.println(Hero2.getHP());
        System.out.println(Excalibur.getWeaponType());
        System.out.println(Excalibur.getDmgType());
        System.out.println(Excalibur.getCrit());
        System.out.println(Excalibur.toString());
        
    }
}