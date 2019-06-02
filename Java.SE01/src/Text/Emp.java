package Text;

/**
 * 此类做测试
 * @author codingbear
 */
public class Emp {

    public int age;
    public int salary;
    public String name;

    public Emp(int age,int salary,String name){
        this.name = name;
        this.age= age;
        this.salary = salary;
    }

    public String toString(){

        return "("+age+","+name+","+salary+")";


    }

}
