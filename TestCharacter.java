public class TestCharacter {
    public static void main(String[] args) {
        Character sans = new Character("sans","Hard Plastic",10);
        Character enemy = new Character("generic","Dark",10);
        System.out.println("Current mana: " + sans.getMana());
        sans.setMana(69);
        System.out.println("New mana: " + sans.getMana());
        System.out.println("Current HP: " + sans.getHP());
        sans.setHP(43);
        System.out.println("New HP: " + sans.getHP());
        System.out.println("Current level: " + sans.getLevel());
        sans.setLevel(4);
        System.out.println("New level: " + sans.getLevel());
        System.out.println("Current XP: " + sans.getXP());
        sans.addXP(7);
        System.out.println("New XP: " + sans.getXP());
        System.out.println("Is weak to Dark " + sans.isWeakTo("Dark"));
        System.out.println("Is weak to Hard Plastic " + sans.isWeakTo("Hard Plastic"));
        System.out.println("Character's name: " + sans.getName());
        sans.chooseAction(enemy);
        System.out.println("Current HP: " + sans.getHP());
        sans.takeDmg(70);
        System.out.println("New HP: " + sans.getHP());
        System.out.println("Alive: " + sans.isAlive());
        System.out.println("Speed: " + sans.getSpeed());
        System.out.println(sans.toString());
    }
}