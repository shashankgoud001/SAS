package ourpackage;

public class Manager extends Employee{
    Manager(String name, int id, char sex, String mob_no, String password){
        super(name,id,sex,mob_no,password);
    }
    void change_price(int prod_code,int unit_price){}
    void print_stat(int prod_code, String date){}
    void print_inventory(){}

}
