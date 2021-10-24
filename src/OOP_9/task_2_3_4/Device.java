package OOP_9.task_2_3_4;

import java.util.Objects;

public class Device {
    String manufacturer;
    float price;
    String serialNumber;
    public Device(String manufacturer, float price, String serialNumber){
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public String getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return Float.compare(device.price, price) == 0 && manufacturer.equals(device.manufacturer) && serialNumber.equals(device.serialNumber);
    }
    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, price, serialNumber);
    }
    @Override
    public String toString() {
        return "manufacturer= " + manufacturer + ", price= " + price + ", serialNumber= " + serialNumber;
    }
}
class Monitor extends Device{
    int resolutionX;
    int resolutionY;
    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY){
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }
    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Monitor monitor = (Monitor) o;
        return resolutionX == monitor.resolutionX && resolutionY == monitor.resolutionY;
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), resolutionX, resolutionY);
    }

    @Override
    public String toString() {
        return  "manufacturer= " + manufacturer +
                ", price= " + price +
                ", serialNumber= " + serialNumber +
                ", X= " + resolutionX +
                ", Y= " + resolutionY;
    }
}
class EthernetAdapter extends  Device{
    int speed;
    String mac;
    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public String getMac() {
        return mac;
    }
    public void setMac(String mac) {
        this.mac = mac;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        EthernetAdapter that = (EthernetAdapter) o;
        return speed == that.speed && mac.equals(that.mac);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), speed, mac);
    }
}
class Main{
    public static void main(String[] args) {
        Device device = new Device("Samsung", 120, "AB1234567CD");
        Device device1 = new Device("Samsung", 120, "AB1234567CD");
        Device monitor = new Monitor("Samsung", 120, "AB1234567CD",
                1280,1024);
        Device monitor1 = new Monitor("Samsung", 120, "AB1234567CD",
                1440,900);
        System.out.println(device);
        System.out.println(monitor);
        if (device.equals(device1) && device.hashCode() == device1.hashCode()) {
            System.out.println("Объекты девайсов равны");
        }else {
            System.out.println("Объекты девайсов не равны");
        }
        if (monitor.equals(monitor1) && monitor.hashCode() == monitor1.hashCode()){
            System.out.println("Объекты мониторов равны");
        }else {
            System.out.println("Объекты мониторов не равны");
        }
    }
}
