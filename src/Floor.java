public class Floor {
    int floorNumber;
    private String floorColor;
    int flatCount = 0;
    Flat[] flats;

    public Floor(int katNumarasi, String katRenk) {
        this.floorNumber = katNumarasi;
        this.floorColor = katRenk;
        this.flats = new Flat[2];
    }

    public void createFlat(int flatNumber, Apartment apartman,String flatType) {
        if (isValidFlatNumber(flatNumber,apartman)) {
            flats[flatCount] = new Flat(floorNumber,flatType);
            flats[flatCount].setFlatNumber(flatNumber);
            flatCount++;
        }
    }
    public boolean isValidFlatNumber(int FlatNumber, Apartment apartman) {

        for (int i = 0; i < Apartment.floorNumber; i++) {
            for (int j = 0; j<apartman.floors[i].flatCount; j++){
                if (FlatNumber == apartman.floors[i].flats[j].getFlatNumber()) {
                    System.out.printf("\nNumber was %d used for an flat on the  %d. floor.You can not use this number\n",FlatNumber,i);
                    return false;
                }
            }
        }
        return true;
    }
    public int getFloorNumber() {
        return floorNumber;
    }
    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public String getFloorColor() {
        return floorColor;
    }

    public void setFloorColor(String floorColor) {
        this.floorColor = floorColor;
    }

    public Flat[] getDaire() {
        return flats;
    }

    public void setDaire(Flat[] daire) {
        this.flats = daire;
    }
}
