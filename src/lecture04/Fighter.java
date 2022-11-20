package lecture04;

public class Fighter {
    private int hitpoint;
    private int power;
    private String name;

    public Fighter(int hitpoint,int power,String name){
        this.hitpoint = hitpoint;
        this.power = power;
        this.name = name;
    }

    public void attack(Fighter enemy){
        System.out.println(name + " は " + enemy.name + " に " + power + "ダメージを与えた。");
        enemy.hitpoint = enemy.hitpoint - power;
        System.out.println(enemy.name + "残り hitPoint：" + enemy.hitpoint);
    }

    public boolean isAlive(){
        return (hitpoint > 0);
    }

    public int getHitpoint(){
        return hitpoint;
    }

    public void setHitpoint(){
        this.hitpoint = hitpoint;
    }

    public String getName(){
        return name;
    }
}
