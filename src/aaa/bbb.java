package aaa;

public class bbb implements jk{
    private String name;
    private int age;
    private int sh;


    public bbb(String name, int age, int sh) {
        this.name = name;
        this.age = age;
        this.sh = sh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSh() {
        return sh;
    }

    public void setSh(int sh) {
        this.sh = sh;
    }

    @Override
    public String name() {
        return null;
    }

    @Override
    public String sh(int s) {
        if(s>100){
            return "伤害很高";
        }
        return "伤害很低";
    }

    @Override
    public String age(int i) {
        return null;
    }

}
