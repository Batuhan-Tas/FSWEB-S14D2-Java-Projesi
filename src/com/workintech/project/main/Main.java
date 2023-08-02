package com.workintech.project.main;
import com.workintech.project.model.*;

public class Main {
    public static void main(String[] args) {

        Room room = new Room(new Wall("West"),
                new Wall("East"),
                new Wall("South"),
                new Wall("North"),
                new Ceiling(4,PaintColor.BLACK));

        Bedroom bedroom = new Bedroom("Batu",
                new Wall("West"),
                new Wall("East"),
                new Wall("South"),
                new Wall("North"),
                new Ceiling(4,PaintColor.BLACK),
                new Bed("Big", 2, 1, 1, 2),
                new Lamp(LampType.BRIGHT,true,3),
                new Wardrobe(2,2,50.5),
                new Carpet(2,2,PaintColor.BLUE)
        );


    bedroom.getWardrobe().add();
    bedroom.getCarpet().lying();
    bedroom.getCeiling().create();
    bedroom.getWall1().create();
    System.out.println(bedroom.getName());



    }
}