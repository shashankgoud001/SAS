package ourpackage;
import org.javatuples.Sextet;

public class Product {

    String name;
    int code;
    int weight;
    int unit_price;
    int no_units_bought;
    int invested_money;
    Sextet<Integer,Integer,Integer,Integer,Integer,Integer> record;
    int units_present;


    Product(String name, int code, int weight, int unit_price, int no_units_bought, int invested_money, Sextet<Integer,Integer,Integer,Integer,Integer,Integer> record,int units_present){
        this.name = name;
        this.code = code;
        this.weight = weight;
        this.unit_price = unit_price;
        this.no_units_bought = no_units_bought;
        this.invested_money = invested_money;
        this.record = record;
        this.units_present = units_present;
    }


    void setName(String name){
        this.name = name;
    }
    void setCode(int code){
        this.code = code;
    }
    void setWeight(int weight){
        this.weight = weight;
    }
    void setUnit_price(int unit_price){
        this.unit_price = unit_price;
    }
    void setNo_units_bought(int no_units_bought){
        this.no_units_bought = no_units_bought;
    }
    void setInvested_money(int invested_money){
        this.invested_money = invested_money;
    }
    void setRecord(Sextet<Integer,Integer,Integer,Integer,Integer,Integer> record){
        this.record = record;
    }
    void setUnits_present(int units_present){
        this.units_present = units_present;
    }


    String getName(){
        return name;
    }
    int getCode(){
        return code;
    }
    int getWeight(){
        return weight;
    }
    int getUnit_price(){
        return unit_price;
    }
    int getNo_units_bought(){
        return no_units_bought;
    }
    int getInvested_money(){
        return invested_money;
    }
    Sextet<Integer,Integer,Integer,Integer,Integer,Integer> getRecord(){
        return record;
    }
    int getUnits_present(){
        return units_present;
    }
}
