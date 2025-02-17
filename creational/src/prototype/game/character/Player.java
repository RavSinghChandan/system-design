package prototype.game.character;

public class Player implements GameCharacter{
    private String name;
    private String weapon;
    private  int health;

    public String getName(String katta) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Player(String name, String weapon, int health) {
        this.name = name;
        this.weapon = weapon;
        this.health = health;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                ", health=" + health +
                '}';
    }

    @Override
    public GameCharacter clone() {
        return new Player(this.name,this.weapon,this.health);
    }
}
