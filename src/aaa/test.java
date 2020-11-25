package aaa;

public class test {


    public static void main(String[] args) {
        bbb b=new bbb("郭行",12,158);
        bbb b2=new bbb("谢玉龙",20,32);
        System.out.println("姓名:"+b.getName()+"年龄:"+b.getAge()+"伤害:"+b.sh(b.getSh()));
        System.out.println("姓名:"+b2.getName()+"年龄:"+b2.getAge()+"伤害:"+b.sh(b2.getSh()));


    }
}
