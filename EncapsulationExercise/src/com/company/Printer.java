package com.company;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;


    public Printer(int tonerLevel, boolean duplex) {

        if (tonerLevel > -1 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        } else{
            this.tonerLevel = -1;
        }

        this.duplex = duplex;
        this.pagesPrinted = 0;

    }

    public int addToner(int tonerAmount){
        if (tonerAmount > 0 && tonerAmount <= 100){
            if (this.tonerLevel + tonerAmount > 100){
                return -1;
            } else {
                 this.tonerLevel += tonerAmount;
                 return this.tonerLevel;
            }
        } else{
            return -1;
        }
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if (this.duplex){
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
/*
Three other methods need to be defined as:

1. addToner will accept one parameter, tonerAmount, type int. First, tonerAmount should be greater than 0
and less than or equal to 100. If this condition is met a second test must be included to test whether
tonerLevel plus tonerAmount is greater than 100. If so, the method should return -1. If not, then
tonerLevel should have the incoming tonerAmount added to it and the new tonerLevel should then be
returned by the method. Also if the initial condition test fails, then the method should return -1.

2. Method printPages will accept one parameter, pages of type int. A variable called pagesToPrint should be created and initialized to the value of the incoming parameter. A conditional check should be performed on whether the Printer class field duplex is “true” or “false”. If “true” then a calculation most be performed to determine the number of pages (sheets of paper) needed to print the job double sided. The pagesToPrint value is then added to the class field pagesPrinted, but the value of pagesToPrint should be returned by the method.

3. Method getPagesPrinted has no parameters and merely returns the values of the member variable pagesPrinted.

Example input:

1  Printer printer = new Printer(50, true);

2  System.out.println(printer.addToner(50));

3  System.out.println("initial page count = " +printer.getPagesPrinted());

4   int pagesPrinted = printer.printPages(4);

5  System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());

6  pagesPrinted = printer.printPages(2);

7  System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());



Example output:

100

initial page count = 0

Printing in duplex mode

Pages printed was 2 new total print count for printer = 2

Printing in duplex mode

Pages printed was 1 new total print count for printer = 3



Tips:

1. Remember to only paste the code from Printer class into the exercise evaluator.
The Main class does not need to be pasted in.

2. You can include a message in the printPages method which informs the user that the printer is
printing in duplex mode if duplex is set to “true” if you want.

3. When calculating pagesToPrint if duplexer is “true”, remember that there are two operators which
can help with this.  The division operator   “ / ” divides a number and returns only the quotient without
any remainder and the modulo “ % ” operator divides the number and only returns the remainder,
whether 0 or otherwise.


 */