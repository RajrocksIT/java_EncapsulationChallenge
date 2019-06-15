package com.rajeshchinni;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    //constructor
    public Printer(int tonerLevel, boolean duplex) {

        if (tonerLevel > -1 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    //getter
    public int getPagesPrinted() {
        return this.pagesPrinted;
    }


    //method
    public int addToner(int tonerAmount){

        if (tonerAmount > 0 && tonerAmount <= 100){
            if (this.tonerLevel + tonerAmount > 100){
                return -1;
            }
            this.tonerLevel = this.tonerLevel + tonerAmount;
            return this.tonerLevel;

        }else {
            return -1;
        }
    }

    //method
    public int printPages(int pagessides){
        int pageCount = pagessides;
        if (this.duplex){
            pageCount = (pageCount/2) + (pageCount % 2);
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted = this.pagesPrinted + pageCount;
        return pageCount;

    }
}
