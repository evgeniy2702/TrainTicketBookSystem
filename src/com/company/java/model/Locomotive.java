package model;

public class Locomotive extends NamedEntity {
    int capacityLocomotive;     //количество вагонов которые может тянуть локомотив
    int powerLocomotive;        //мощьность локомотива
    int yearIssueLocomotive;    //год выпуска локомотива
    FuelType fuelType;          //тип топлива локомотива

    public Locomotive() {
    }

    public Locomotive(Long id, String name, int capacityLocomotive, int powerLocomotive, int yearIssueLocomotive, FuelType fuelType) {
        super(id, name);
        this.capacityLocomotive = capacityLocomotive;
        this.powerLocomotive = powerLocomotive;
        this.yearIssueLocomotive = yearIssueLocomotive;
        this.fuelType = fuelType;
    }
    public Locomotive(Long id, String name, int capacityLocomotive, int powerLocomotive, int yearIssueLocomotive, String fuelType) {
        super(id, name);
        this.capacityLocomotive = capacityLocomotive;
        this.powerLocomotive = powerLocomotive;
        this.yearIssueLocomotive = yearIssueLocomotive;
        if(fuelType.equalsIgnoreCase("DIESEL")){
            this.fuelType = FuelType.DIESEL;
        }else if(fuelType.equalsIgnoreCase("ELECTRICITY")){
            this.fuelType = FuelType.ELECTRICITY;
        }
    }

    public int getCapacityLocomotive() {
        return capacityLocomotive;
    }

    public void setCapacityLocomotive(int capacityLocomotive) {
        this.capacityLocomotive = capacityLocomotive;
    }

    public int getPowerLocomotive() {
        return powerLocomotive;
    }

    public void setPowerLocomotive(int powerLocomotive) {
        this.powerLocomotive = powerLocomotive;
    }

    public int getYearIssueLocomotive() {
        return yearIssueLocomotive;
    }

    public void setYearIssueLocomotive(int yearIssueLocomotive) {
        this.yearIssueLocomotive = yearIssueLocomotive;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }



    public void setFuelType(String fuelType){
        if(fuelType.equalsIgnoreCase("DIESEL")){
            this.fuelType = FuelType.DIESEL;
        }else if(fuelType.equalsIgnoreCase("ELECTRICITY")){
            this.fuelType = FuelType.ELECTRICITY;
        }
    }

    @Override
    public String toString() {
        return "Locomotive{" +
                super.toString() +
                ", capacityLocomotive=" + capacityLocomotive +
                ", powerLocomotive=" + powerLocomotive +
                ", yearIssueLocomotive=" + yearIssueLocomotive +
                ", fuelType=" + fuelType +
                '}'+"\n";
    }



    public enum FuelType {
        DIESEL("diesel"),
        ELECTRICITY("electricity");

        String str;

        FuelType(String str){
            this.str = str;
        }

        public String getStr() {
            return str;
        }
    }
}
