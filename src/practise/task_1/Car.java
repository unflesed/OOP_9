package practise.task_1;

import java.util.Objects;
import java.util.Scanner;

public class Car {
    private int id;
    private String brand;
    private String model;
    private int year;
    private String color;
    private double price;
    private String regNumber;
    public Car(int id){
        this.id = id;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getRegNumber() {
        return regNumber;
    }
    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }
    @Override
    public String toString() {
        return  "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", regNumber='" + regNumber;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && year == car.year && Double.compare(car.price, price) == 0 && brand.equals(car.brand) && model.equals(car.model) && color.equals(car.color) && regNumber.equals(car.regNumber);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, brand, model, year, color, price, regNumber);
    }
}
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int check, n, year, counter = 0;
        double price;
        Car[] cars = {new Car(1), new Car(2), new Car(3)};
        cars[0].setBrand("BMW");
        cars[0].setModel("7");
        cars[0].setYear(2007);
        cars[0].setColor("Black");
        cars[0].setPrice(10000);
        cars[0].setRegNumber("123456");
        cars[1].setBrand("AUDI");
        cars[1].setModel("TT");
        cars[1].setYear(2012);
        cars[1].setColor("Silver");
        cars[1].setPrice(20000);
        cars[1].setRegNumber("987654");
        cars[2].setBrand("BMW");
        cars[2].setModel("x5");
        cars[2].setYear(2008);
        cars[2].setColor("Yellow");
        cars[2].setPrice(15000);
        cars[2].setRegNumber("5615656");
        do {
            System.out.println("1 - cписок марок автомобилей");
            System.out.println("2 - список автомобилей, которые эксплуатируются больше n лет");
            System.out.println("3 - список автомобилей заданного года выпуска, цена которых больше указанной");
            System.out.println("4 - количество одинаковых автомобилей сравнивая с первым автомобилем");
            System.out.println("5 - выход");
            check = sc.nextInt();
            switch (check){
                case 1 :
                    for (Car car: cars) {
                        System.out.println(car.getBrand());
                    }
                    break;
                case 2 :
                    System.out.println("Введите количество лет:");
                    n = sc.nextInt();
                    for (Car car: cars) {
                        if (2021-car.getYear() > n) {
                            System.out.println(car);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Введите год выпуска автомобиля:");
                    year = sc.nextInt();
                    System.out.println("Введите цену для сравнения:");
                    price = sc.nextDouble();
                    for (Car car: cars) {
                        if (car.getYear() == year && car.getPrice() > price) {
                            System.out.println(car);
                        }
                    }
                    break;
                case 4:
                    for (int i = 1; i < cars.length; i++) {
                        if (cars[0].equals(cars[i]) ) {
                            counter++;
                        }
                        System.out.println("Количество одинаковых автомобилей сравнивая с первым автомобилем: " +
                                counter + "\n Характеристика сравниваемого автомобиля:\n" + cars[0]);
                    }
                    break;
            }
        }while(check != 5);

    }
}
