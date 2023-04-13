package GameMaking;

public class NPC extends GameCharacter {
    private boolean isEnemy;
    private boolean isNeutral;

    public NPC(String name, int health, int attackPower, boolean isEnemy, boolean isNeutral) {
        super(name, health, attackPower);
        this.isEnemy = isEnemy;
        this.isNeutral = isNeutral;
    }

    public boolean getIsEnemy() {
        return isEnemy;
    }

    public void setIsEnemy(boolean isEnemy) {
        this.isEnemy = isEnemy;
    }

    public boolean getIsNeutral() {
        return isNeutral;
    }

    public void setIsNeutral(boolean isNeutral) {
        this.isNeutral = isNeutral;
    }

    @Override
    public String toString() {
        return "NPC{" +
                "name='" + getName() + '\'' +
                ", health=" + getHealth() +
                ", attackPower=" + getAttackPower() +
                ", isEnemy=" + isEnemy +
                ", isNeutral=" + isNeutral +
                '}';
    }
}