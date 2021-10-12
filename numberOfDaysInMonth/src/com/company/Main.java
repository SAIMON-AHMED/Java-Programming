package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(isLeapYear(2020));
        System.out.println(getDaysInMonth(2,2020));

    }
//    This is my first code but I am doing some modification below
//    public static boolean isLeapYear(int year){
//        if(!(year > 1 && year < 9999)){
//            return false;
//        } else{
//            return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
//        }
//    }
//    public static int getDaysInMonth(int month, int year) {
//        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
//            return -1;
//
//        } else {
//            switch (month) {
//                case 1:
//                    return 31;
//                    //break;
//                case 2:
//                    if (isLeapYear(year)) {
//                        return 29;
//                    } else {
//                        return 28;
//                    }
//                    //break;
//
//                case 3:
//                    return 31;
//                //break;
//                case 4:
//                    return 30;
//                //break;
//                case 5:
//                    return 31;
//                //break;
//                case 6:
//                    return 30;
//                //break;
//                case 7:
//                    return 31;
//                //break;
//                case 8:
//                    return 31;
//                //break;
//                case 9:
//                    return 30;
//                //break;
//                case 10:
//                    return 31;
//                //break;
//                case 11:
//                    return 30;
//                //break;
//                case 12:
//                    return 30;
//                //break;
//                default:
//                    return -1;
//            }
//        }
//    }
//}
/*
      "THIS IS A MUCH BETTER CODE THAN MINE"[Collected]

    public class NumberOfDaysInMonth {

        public static boolean isLeapYear(int year) {

            return (year > 1 && year < 9999)
                && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);

        }

        public static int getDaysInMonth(int month, int year) {

            if (month < 1 || month > 12 || year < 1 || year > 9999) {
                return -1;
            }
            if (month == 2)
                return isLeapYear(year) ? 29 : 28;

            if (month == 4 || month == 6 || month == 9 || month == 11) {
                return 30;
            }
            return 31;
        }
}

      "WHAT A SIMPLE CODE!. IMPRESSIVE"[Collected]

    public class NumberOfDaysInMonth {
        public static boolean isLeapYear(int year) {

            return (year > 1 && year < 9999)
                    && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
        }

        public static int getDaysInMonth(int month, int year) {
            if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
                return -1;
            }
            if (month == 2) {
                return (!isLeapYear(year)) ? 28 : 29;
            }
            return (month == 4 || month == 6 || month == 9 || month == 11) ?
            30: 31;
        }
}



 */

    public static boolean isLeapYear(int year){

        return (year > 1 && year < 9999)
                && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);  //copied from above code



    }


    public static int getDaysInMonth(int month, int year) {
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        } else {
            switch (month) {
                case 2:
                    return isLeapYear(year) ? 29 : 28;


                case 4: case 6: case 9: case 11:
                    return 30;
                case 1:case 3: case 5: case 7: case 8: case 10: case 12:
                    return 31;
                default:
                    return -1;
            }
        }
    }
}


