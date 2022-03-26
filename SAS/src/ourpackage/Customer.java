package ourpackage;

public class Customer {
    String name;
    String mob_no;

    Customer(String name, String phone_number){
        this.name = name;
        this.mob_no = mob_no;
    }

    void setName(String name){
        this.name = name;
    }

    void setMob_no(String mob_no){
        this.mob_no = mob_no;
    }

    String getName(){
        return name;
    }

    String getMob_no(){
        return mob_no;
    }

    void display_customer(){
        System.out.print("Name : "+this.getName());
        System.out.print("Mobile Numeber : "+this.getMob_no());
    }
}
