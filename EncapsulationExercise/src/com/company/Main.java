package com.company;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(50, true);

        System.out.println(printer.addToner(50));

        System.out.println("initial page count = " +printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(4);

        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());

        pagesPrinted = printer.printPages(2);

        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());


    }
}
/*


Example output:

100

initial page count = 0

Printing in duplex mode

Pages printed was 2 new total print count for printer = 2

Printing in duplex mode

Pages printed was 1 new total print count for printer = 3



Tips:

1. Remember to only paste the code from Printer class into the exercise evaluator.  The Main class does not need to be pasted in.

2. You can include a message in the printPages method which informs the user that the printer is printing in duplex mode if duplex is set to “true” if you want.

3. When calculating pagesToPrint if duplexer is “true”, remember that there are two operators which can help with this.  The division operator   “ / ” divides a number and returns only the quotient without any remainder and the modulo “ % ” operator divides the number and only returns the remainder, whether 0 or otherwise.


 */