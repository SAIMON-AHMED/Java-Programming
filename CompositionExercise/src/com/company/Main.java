package com.company;

public class Main {

    public static void main(String[] args) {

        Wall wall1 = new Wall("West");

        Wall wall2 = new Wall("East");

        Wall wall3 = new Wall("South");

        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4, 3, 2, 1);

        Lamp lamp = new Lamp("Classic", false, 75);

        BedRoom bedRoom = new BedRoom("SaimonSirat", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

        bedRoom.makeBed();

        bedRoom.getLamp().turnOn();



    }
}
/*


Input/Output:

Once you have completed coding your classes you should then use the following code in your main
class to test you code and for correct output. This way you can be sure that your code works before
pasting your five classes into the code evaluator.

Wall wall1 = new Wall("West");

Wall wall2 = new Wall("East");

Wall wall3 = new Wall("South");

Wall wall4 = new Wall("North");

Ceiling ceiling = new Ceiling(12, 55);

Bed bed = new Bed("Modern", 4, 3, 2, 1);

Lamp lamp = new Lamp("Classic", false, 75);

Bedroom bedRoom = new Bedroom("YOUR NAME HERE", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

bedRoom.makeBed();

bedRoom.getLamp().turnOn();



Tips:

Remember that after testing you will not put your main method into the code evaluator.
you will only paste in your five classes you have created in the exercise.

To be sure that the correct output is generated so your code passes the evaluation,
use the following statements in your code.:

1) System.out.println("Bedroom --> Making bed | "); should be used in the makeBed() method of the Bedroom class

2) System.out.println("Bed --> Making | "); should be used in the make() method of the Bed class; and

3) System.out.println("Lamp --> Turning on"); should be used in the turnOn() method of the Lamp class.
 */