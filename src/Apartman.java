public class Apartman {

    private String apartmentName;
    private int apartmentNumber;

    static int floorNumber = 0;
     Floor[] floors;


    public Apartman(String apartmanAdi, int apartmanNumarasi) {
        this.apartmentName = apartmanAdi;
        this.apartmentNumber = apartmanNumarasi;
        this.floors = new Floor[15];
    }
    public Floor[] getFloors() {
        return floors;
    }

    public void createFloor(int floorNumber, String floorColor) {


        if (isValidFloorColor(floorColor) && isValidFloorNumber(floorNumber)) {
            floors[Apartman.floorNumber] = new Floor(floorNumber, floorColor);
            System.out.printf("\n%d. floor succesfully painted %s \n", Apartman.floorNumber, floorColor);
            Apartman.floorNumber++;
        }
    }

    public boolean isValidFloorColor(String color) {
        for (int i = 0; i < floorNumber; i++) {
            if (floors[i].getFloorColor().compareToIgnoreCase(color) == 0) {
                System.out.printf("\n%s was used for the %d. floor. You can not use the same color again\n", color, i);
                return false;
            }
        }
        return true;
    }
    public boolean isValidFloorNumber(int floorNumber) {
        if (floorNumber<0){
            return false;
        }else {
            for (int i = 0; i< Apartman.floorNumber; i++){
                if (floorNumber== floors[i].getFloorNumber()){
                    return false;
                }
            }
        }
        return true;
    }
    public String getApartmentName() {
        return apartmentName;
    }
    public int getApartmentNumber() {
        return apartmentNumber;
    }
    public String toString() {
        return "\nApartment Name: " + getApartmentName() +
                "\nApartment Number: " + getApartmentNumber() +
                "\nApartment Floor Number: " + (floorNumber -1);

    }
    public void printInformationOfApartment(){
        System.out.println("\nApartment information and names of people living in the apartment");
        for (int i = 0; i< floorNumber; i++){
            for (int j = 0; j< floors[i].flatCount; j++){
                System.out.println(floors[i].flats[j].toString());
            }
        }
        System.out.print("----------------------");
    }
}
