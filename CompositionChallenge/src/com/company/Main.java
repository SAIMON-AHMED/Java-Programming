package com.company;

public class Main {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(2,3,4);
        dimensions.size(2,3,4);

        Furniture furniture = new Furniture(2,1,"regal","black");
        furniture.isBeautiful();

        SiratRecommended siratRecommended = new SiratRecommended("White",2,true);
        siratRecommended.doesSiratRecommend("White",2,true);

        Room room = new Room(4,"red",1,"mid");
        room.isComfortable();

        House house = new House("SaimonSirat",true,furniture,siratRecommended,dimensions,room);
        house.love();
        house.getSiratRecommended().doesSiratRecommend("White",2,true);


    }
}
