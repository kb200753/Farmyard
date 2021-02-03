public class Sheep extends animal2{
    private String lastSheared;

    public Sheep(String lastSheared, String name, int age) {
        super(name,"Sheep", age);
        this.lastSheared = lastSheared;

    }
    @Override
    public String toString(){
        return name +", " + type + ", " + age + ", " + lastSheared;
    }
    public String getLastSheared(){
        return lastSheared;
    }
    public void setLastSheared(String lastSheared){
        this.lastSheared = lastSheared;
    }
}
