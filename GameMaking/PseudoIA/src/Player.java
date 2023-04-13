package GameMaking;

public class Player extends GameCharacter {
    private int xp;

    public Player(String name, int health, int attackPower) {
        super(name, health, attackPower);
        this.xp = 0;
    }

    public void addXP(int xp) {
        this.xp += xp;
    }

    public int getXP() {
        return xp;
    }
    
    public void setXP(int xp) {
		this.xp = xp;
	}
    
    @Override
    public String toString() {
        return "Player{" +
                "name='" + super.getName() + '\'' +
                ", health=" + super.getHealth() +
                ", attackPower=" + super.getAttackPower() +
                ", xp=" + xp +
                '}';
    }
}