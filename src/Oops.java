class Car{
    String model;
    String brand;
    Long price;

    public Car(String model,String brand,long price) {
        this.model=model;
        this.brand=brand;
        this.price=price;
    }
    void display(){
        System.out.println("this car is from "+model+" and thats model is "+brand+" and its price "+price);
    }

}

public class Oops {
    public static void main(String[] args) {
            Car obj1=new Car("TATA","Punch",50000);
            Car obj2=new Car("Toyota","Fortuner",450000);
            obj1.display();
            obj2.display();
    }
}
