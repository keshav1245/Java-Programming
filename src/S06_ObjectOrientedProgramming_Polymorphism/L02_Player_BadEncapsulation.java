package S06_ObjectOrientedProgramming_Polymorphism;

//Non encapsulated Class - BAD PRACTICE!!!
public class L02_Player_BadEncapsulation {

    public String name, weapon;
    public int health;


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
