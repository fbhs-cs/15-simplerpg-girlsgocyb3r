public class Gun extends Spell {
    private int dmg;
    String SPELL_TYPE;
    public Gun() {
        super(60,"Dark",50);
        SPELL_TYPE = "Dark";
    }
    @Override
    public int cast(Character sender, Character receiver) {
        if(sender.getMana() >= getManaReq()) {
            if(receiver.isWeakTo("Dark")) {
                receiver.setHP(receiver.getHP()-70);
                this.dmg = 70;
            }
            else {
                receiver.setHP(receiver.getHP()-60);
                this.dmg = 60;
            }
        }
        else {
            this.dmg = 0;
            System.out.print("You do not have enough mana to use this spell.");
        }
        return this.dmg;
    }
}