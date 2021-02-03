public class animal2 {

    protected String name;
    protected String type;
    protected int age;

    public animal2(String name,String type,int age){
        this.name = name;
        this.type = type;
        this.age = age;
    }
    public String toString(){
        return name + ", " + type + ", " + age;
    }
    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }
    public int getAge(){
        return age;
    }

}
