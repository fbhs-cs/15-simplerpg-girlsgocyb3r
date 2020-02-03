

public class TestSpell{
    public static void main(String[] args) {
        Spell spell = new Spell(5, "Fire", 10);
        Character devin = new Character("Devin", "hard plastic", 12);
        Character joe = new Character("joe", "Fire", 5);
        System.out.println( spell.cast(devin, joe));
        devin.setMana(10);
        System.out.println(spell.toString());
        




    }
    















}