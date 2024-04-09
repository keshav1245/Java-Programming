package S06_ObjectOrientedProgramming_Polymorphism;

public class L02_Printer_Encapsulation_Challenge {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;


    public L02_Printer_Encapsulation_Challenge(int tonerLevel, boolean duplex) {
        this(tonerLevel, 0, duplex);
    }

    public L02_Printer_Encapsulation_Challenge(int tonerLevel, int pagesPrinted, boolean duplex) {
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }


    public int addToner(int tonerAmount){

        if(tonerAmount < 0)
            return -1;
        else{
            this.tonerLevel += tonerAmount;
            if(tonerLevel > 100){
                tonerLevel -= tonerAmount;
                return -1;
            }else{
                return tonerLevel;
            }
        }

    }

    public int printPages(int pages){

        if(tonerLevel <= 0) return -1;

        if(duplex){
            System.out.println("It is a duplex printer");
            int sheets = (int) Math.ceil((double) pages / 2);
            this.pagesPrinted += sheets;
            return sheets;
        }else{

            this.pagesPrinted += pages;
            return pages;

        }



    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
