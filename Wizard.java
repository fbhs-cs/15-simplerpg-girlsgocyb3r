public class Wizard extends Character {
    private Spell spell;
    private String CLASS_NAME;
    public Scanner in = new Scanner(System.in);
    public Wizard(String name, Spell spell) {
        super(name,"Plastic",1);
        this.spell = spell;
        CLASS_NAME = "Wizard";
    }
    public void chooseAction(Character target) {
        
    }
}