/**
 * Created by Enzo Cotter on 2021/2/9.
 */
public class Test {
    private String name;
    private int age;
    Test(){}
    Test(String _name, int _age) { name = _name; age = _age; }
    public String getName(){ return name; }
    public void setName(String _name){
        name = _name;
    }
}
