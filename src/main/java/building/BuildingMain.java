package building;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BuildingMain {

    public static void main(String[] args) throws IlluminanceTooMuchException, SpaceUsageTooMuchException {

        System.setProperty("log4j.configurationFile", "C:\\Users\\Gleb\\Downloads\\Epam_practice\\src\\main\\resources\\log.xml");

        //создаем экземпляр здания 1
        Building b1 = new Building("Здание 1");


        //создаем экземпляр комнатыпомещения 1
        Room r1 = new Room("room1", 33.7d, 3);

        //добавляем помещение 1 в лист
        b1.addRoom(r1);

        //добавляем освещение в помещение 1
        b1.getRoom(r1, new Lighting("Lumen5k", 80));
        b1.getRoom(r1, new Lighting("Firefly", 120));
        b1.getRoom(r1, new Lighting("Лампочка Ильича", 90));

        //добавляем мебель в помещение 1
        b1.getRoom(r1, new Furniture("Sofa white", 4.2d));
        b1.getRoom(r1, new Furniture("Стол обеденный", 2.5d));
        b1.getRoom(r1, new Furniture("Кресло мягкое и пушистое по заказу", 1));

        //добавлем экземпляр помещения 2
        Room r2 = new Room("room2", 24.5, 3);

        //добавляем помещение 2 в лист
        b1.addRoom(r2);

        //добавляем освещение в помещение 2
        b1.getRoom(r2, new Lighting("Mini Sun", 90));
        b1.getRoom(r2, new Lighting("Flash in the Night", 180));

        //выводим описание здания
        b1.buildingDescription();

    }

}
