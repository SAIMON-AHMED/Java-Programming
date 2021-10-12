package com.company;

public class Main {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B","Dell","240",dimensions);

        Monitor monitor = new Monitor("Anything", "HP", 24,
                new Resolution(22, 23));
        MotherBoard motherBoard = new MotherBoard("notImportant","Acer",4,
                6,"anything");

        PC pc = new PC(theCase,monitor,motherBoard);
        pc.getMonitor().drawPixelAt(4,4,"blue");

        pc.getMotherBoard().loadProgram("Windows 1.0");
        pc.getTheCase().pressPowerButton();

        // Create a single room of a house using composition.
        // Think about the things that should be included in the room.
        // Maybe physical parts of the house but furniture as well
        // Add at least one method to access an object via a getter and
        // then that objects public method as you saw in the previous video
        // then add at least one method to hide the object e.g. not using a getter
        // but to access the object used in composition within the main class
        // like you saw in this video.










    }
}
