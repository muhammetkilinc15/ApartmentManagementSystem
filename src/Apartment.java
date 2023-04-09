public class Apartment {

    private String apartmentName;
    private int apartmentNumber;

    static int floorNumber = 0;
     Floor[] floors;


    public Apartment(String apartmentName, int apartmentNumber) {
        this.apartmentName = apartmentName;
        this.apartmentNumber = apartmentNumber;
        this.floors = new Floor[15];
    }
    public Floor[] getFloors() {
        return floors;
    }

    public void createFloor(int floorNumber, String floorColor) {
        if ( isValidFloorNumber(floorNumber)) {
            if (isValidFloorColor(floorColor)){
                floors[Apartment.floorNumber] = new Floor(floorNumber, floorColor);
                System.out.printf("\n%d. floor succesfully painted %s \n", floorNumber, floorColor);
                Apartment.floorNumber++;
            }
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
            for (int i = 0; i< Apartment.floorNumber; i++){
                if (floorNumber== floors[i].getFloorNumber()){
                    System.out.printf("You have already arranged the %d. floor. You cannot edit again\n",floorNumber);
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
        for (int i = 0; i< floorNumber; i++){
            for (int j = 0; j< floors[i].flatCount; j++){
                System.out.println(floors[i].flats[j].toString());
            }
        }

        return "\nApartment Name: " + getApartmentName() +
                "\nApartment Number: " + getApartmentNumber() +
                "\nApartment Floor Number: " + (floorNumber -1);

    }
    public void printInformationOfFLat(){
        System.out.println("\n\nApartment information and names of people living in the apartment");
        for (int i = 0; i< floorNumber; i++){
            for (int j = 0; j< floors[i].flatCount; j++){
                System.out.println(floors[i].flats[j].toString());
            }
        }
        System.out.print("----------------------");
    }
}
