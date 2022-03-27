package ourpackage;
//import org.javatuples.Quintet;

public class Sales_transaction {
    int day;
    int month;
    int year;
    int hour;
    int minutes;
    Customer cust_data;
    int sale_transac_no;
//    Quintet<String, Integer,Integer, Integer ,Integer > shop_list;
    int Total_amount;

    Sales_transaction(int day,int month,int year, int hour, int minutes, Customer cust_data, int sale_transac_no/*, Quintet<String, Integer,Integer, Integer ,Integer > shop_list*/,int Total_amount){
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.minutes = minutes;
        this.cust_data = cust_data;
        this.sale_transac_no = sale_transac_no;
//        this.shop_list = shop_list;
        this.Total_amount = Total_amount;
    }

    void setDay(int day){
        this.day = day;
    }
    void setMonth(int month){
        this.month = month;
    }
    void setYear(int year){
        this.year = year;
    }
    void setHour(int hour){
        this.hour = hour;
    }
    void setMinutes(int minutes){
        this.minutes = minutes;
    }
    void setCust_data(Customer cust_data){
        this.cust_data = cust_data;
    }
    void setSale_transac_no(int sale_transac_no){
        this.sale_transac_no = sale_transac_no;
    }
//    void setShop_list(Quintet<String, Integer,Integer, Integer ,Integer > shop_list){
//        this.shop_list = shop_list;
//    }
    void setTotal_amount(int Total_amount){
        this.Total_amount = Total_amount;
    }

    int getDay(){
        return day;
    }
    int getMonth(){
        return month;
    }
    int getYear(){
        return year;
    }
    int getHour(){
        return hour;
    }
    int getMinutes(){
        return minutes;
    }
    Customer getCust_data(){
        return cust_data;
    }
    int getSale_transac_no(){
        return sale_transac_no;
    }
//    Quintet<String, Integer,Integer, Integer ,Integer > getShop_list(){
//        return shop_list;
//    }
    int getTotal_amount(){
        return Total_amount;
    }

    //
    void modify_inventory(){}
    void print_bill(){ }
}

