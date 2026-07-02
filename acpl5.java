class SingleTable {

    private int numSeats;
    private int height;
    private double viewQuality;

    public SingleTable(int seats, int height, double viewQuality) {
        this.numSeats = seats;
        this.height = height;
        this.viewQuality = viewQuality;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public int getHeight() {
        return height;
    }

    public double getViewQuality() {
        return viewQuality;
    }

    public void setViewQuality(double value) {
        viewQuality = value;
    }
}

class CombinedTable {

    private SingleTable table1;
    private SingleTable table2;

    public CombinedTable(SingleTable t1, SingleTable t2) {
        table1 = t1;
        table2 = t2;
    }

    // Returns the number of seats
    public int getNumSeats() {
        return table1.getNumSeats() + table2.getNumSeats() - 2;
    }

    // Returns desirability
    public double getDesirability() {

        if (table1.getHeight() == table2.getHeight()) {
            return table1.getViewQuality() + table2.getViewQuality();
        } else {
            return (table1.getViewQuality() + table2.getViewQuality()) / 2.0;
        }
    }
}

public class acpl5 {

    public static void main(String[] args) {

        SingleTable t1 = new SingleTable(4, 74, 60.0);
        SingleTable t2 = new SingleTable(8, 74, 70.0);

        CombinedTable c1 = new CombinedTable(t1, t2);

        System.out.println("Combined Seats = " + c1.getNumSeats());
        System.out.println("Desirability = " + c1.getDesirability());

        System.out.println();

        SingleTable t3 = new SingleTable(4, 74, 75.0);
        SingleTable t4 = new SingleTable(6, 76, 90.0);

        CombinedTable c2 = new CombinedTable(t3, t4);

        System.out.println("Combined Seats = " + c2.getNumSeats());
        System.out.println("Desirability = " + c2.getDesirability());
    }
}