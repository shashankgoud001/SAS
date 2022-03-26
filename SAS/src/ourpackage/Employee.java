package ourpackage;

public class Employee {
    String name;
    int id;
    char sex;
    String mob_no;
    String password;

    Employee(String name, int id, char sex, String mob_no, String password){
        this.name = name;
        this.id = id;
        this.sex = sex;
        this.mob_no = mob_no;
        this.password = password;
    }

    void update_inventory(int prod_code, int cost_price, int quantitiy){}
}
