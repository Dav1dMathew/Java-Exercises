package GameMaking;

import java.util.ArrayList;

public class Interaction {
    private Player player;
    private ArrayList<NPC> NPCs;

    public Interaction(Player player, ArrayList<NPC> NPCs) {
        this.player = player;
        this.NPCs = NPCs;
    }
    
    public ArrayList<NPC> getNPCs() {
		return NPCs;
	}
    
    public Player getPlayer() {
		return player;
	}
    
    public void setNPCs(ArrayList<NPC> nPCs) {
		NPCs = nPCs;
	}
    
    public void setPlayer(Player player) {
		this.player = player;
	}

    public void outcome(NPC npc) {
        if (npc.getIsEnemy()) {
            // if npc is an enemy, player attacks npc and reduces its health
            npc.setHealth(npc.getHealth() - player.getAttackPower());
            System.out.println("Player attacked " + npc.getName() + " for " + player.getAttackPower() + " damage.");
            // if npc's health is 0 or less, it is defeated and removed from the NPCs list
            if (npc.getHealth() <= 0) {
                NPCs.remove(npc);
                player.addXP(1); // player gains 1 experience point for defeating an enemy NPC
                System.out.println(npc.getName() + " was defeated.");
            }
            else {
                // if npc is still alive, it counterattacks the player and reduces their health
                player.setHealth(player.getHealth() - npc.getAttackPower());
                System.out.println(npc.getName() + " counterattacked for " + npc.getAttackPower() + " damage.");
                // if player's health is 0 or less, the game is over
                if (player.getHealth() <= 0) {
                    System.out.println("Game over.");
                }
            }
        }
        else {
            // if npc is not an enemy, player talks to npc
            System.out.println("Player talked to " + npc.getName() + ".");
            // npc says something
            System.out.println(npc.getName() + ": Hello, how are you?");
            // player responds
            System.out.println(player.getName() + ": I'm fine, thanks. How about you?");
            // npc responds
            System.out.println(npc.getName() + ": I'm doing well, thank you.");
        }
    }
    
    @Override
    public String toString() {
        return "Interaction{" +
                "player=" + player +
                ", NPCs=" + NPCs +
                '}';
    	}
	}
