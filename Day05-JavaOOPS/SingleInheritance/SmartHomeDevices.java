/*Smart Home Devices
Description: Create a hierarchy for a smart home system where Device is the superclass and Thermostat is a subclass.
Tasks:
Define a superclass Device with attributes like deviceId and status.
Create a subclass Thermostat with additional attributes like temperatureSetting.
Implement a method displayStatus() to show each device's current settings.
Goal: Understand single inheritance by adding specific attributes to a subclass, keeping the superclass general. */

//Superclass Device with attributes like deviceId and status
class Device{
    protected String deviceId;
    protected String status;

    //Constructor
    Device(String deviceId, String status){
        this.deviceId = deviceId;
        this.status = status;
    }
    void displayInfo(){
        System.out.println("Status Showing...");
    }
}
//Subclass Thermostat with additional attributes like temperatureSetting
class Thermostat extends Device{
    protected float temperatureSetting;

    //Constructor
    Thermostat(String deviceId, String status, float temperatureSetting){
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }
    //Method overriding
    @Override
    void displayInfo(){
        System.out.println("Device ID: " + deviceId + " | Status: " + status + " | Temperature Setting (in degree celsius): " + temperatureSetting);
    }
}

public class SmartHomeDevices{
    public static void main(String[] args) {
        Device thermostat = new Thermostat("AC12", "ON",25);
        thermostat.displayInfo();
    }
}