package homework;

public class User{
    private final String name;

    protected User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
