import java.time.LocalDateTime;

public class Human {

    private final String name;
    private final int age;
    private final LocalDateTime date;

    public Human(String name, int age){
        this.name = name;
        this.age = age;
        this.date = LocalDateTime.now();
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public LocalDateTime getDate(){
        return date;
    }

    @Override
    public String toString(){
        return "Date: " + date;
    }
}
