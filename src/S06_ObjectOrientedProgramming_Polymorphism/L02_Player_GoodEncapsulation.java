package S06_ObjectOrientedProgramming_Polymorphism;

public class L02_Player_GoodEncapsulation {
    private String name, weapon;
    private int health;

    public L02_Player_GoodEncapsulation(String name) {
        this(name, "Sword", 100);
    }

    public L02_Player_GoodEncapsulation(String name, String weapon, int health) {
        this.name = name;
        this.weapon = weapon;

        if(health <= 0)
            this.health = 1;
        else if(health > 100)
            this.health = 100;
        else
            this.health = health;
    }

    public void loseHealth(int damage){
        health -= damage;

        if(health <= 0 ){
            System.out.println("Player knocked out of the game!");
        }
    }

    public int healthRemaining(){
        return health;
    }

    public void restoreHealth(int points){
        health += points;
        if (health > 100){
            health = 100;
            System.out.println("Player restored to 100%");
        }
    }


}
