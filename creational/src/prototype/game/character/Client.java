package prototype.game.character;

public class Client {
    public static void main(String[] args) {
        Player originalPlayer = new Player("Chandan","Chakku",80);
        System.out.println("Original Player : "+originalPlayer.toString());

        System.out.println("++++++++++++++++++++++++++++++++++++++++++");

        Player colnedPlayer =  (Player) originalPlayer.clone();
        colnedPlayer.setName("Katta");
        colnedPlayer.setWeapon("Gun");
        colnedPlayer.setHealth(50);
        System.out.println("Cloned Player : "+colnedPlayer.toString());

    }
}
