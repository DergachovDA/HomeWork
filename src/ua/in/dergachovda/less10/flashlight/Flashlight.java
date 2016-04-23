package ua.in.dergachovda.less10.flashlight;
/*
+ Создайте класс для и определите методы для предмета "Фонарь".
+ У него будет название,
+ определенное количество батареек,
+ которые можно вставить,
+ он должен уметь светить красным, белым светом,
+ а также мигать,
причем для белого света достаточно одной батарейки,
для красного нужно 2,
для мигающего нужно 3
(свойство int battery, которое будет хранить количество батареек для этого подойдет).
Вы можете добавить возможности фонаря, как сочтете нужным.
 */
public class Flashlight {

    private String name;
    private int batteries;
    private String[] light;
    private int state;
    private int batteryCompartment;

    Flashlight() {
        name = "New Flashlight";
        batteryCompartment = 3;
        batteries = 1;
        state = 0;
        light = new String[] {"off", "shines white", "shines red", "blinks"};
    }

    boolean checkState() {
        return state <= batteries;
    }

    void setName(String name) {
        this.name = name;
    }

    void setBattery() {
        if (batteries + 1 > batteryCompartment)
            System.out.println("The battery compartment is full.");
        else
            batteries ++;
    }

    void getBattery() {
        if (batteries - 1 < 0)
            System.out.println("The battery compartment is empty.");
        else
            batteries --;
    }

    void printStateFlashlight() {
        System.out.println(name + " is " + light[state] + ".");
    }

}
