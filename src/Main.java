public class Main {
    public static void main(String[] args) {

        Apartment robertApartment = new Apartment("Robert Apartment",1);

        robertApartment.createFloor(0,"BLUE");
        robertApartment.createFloor(1,"BLACK");
        robertApartment.createFloor(2,"BLUE");
        robertApartment.createFloor(3,"YELLOW");
        robertApartment.createFloor(4,"GREEN");
        robertApartment.createFloor(4,"BLACK");
        robertApartment.createFloor(5,"PURPLE");
        robertApartment.createFloor(5,"RED");


        System.out.println(robertApartment.toString());
        Floor[] floor = robertApartment.getFloors();

        floor[0].createFlat(12,robertApartment,"2+1");
        floor[0].createFlat(14,robertApartment,"3+1");

        floor[1].createFlat(42,robertApartment,"1+1");

        floor[3].createFlat(42,robertApartment,"2+1");

        floor[1].createFlat(62,robertApartment,"1+1");

        floor[2].createFlat(192,robertApartment,"2+1");
        floor[2].createFlat(72,robertApartment,"2+0");

        floor[3].createFlat(62,robertApartment,"1+1");
        floor[3].createFlat(12,robertApartment,"2+1");



        floor[0].flats[0].addPeople(new People("John Glory",49));

        floor[0].flats[1].addPeople(new People("Bella Grey",44));

        floor[1].flats[0].addPeople(new People("Biden Haven",21));
        floor[1].flats[0].addPeople(new People("Beyza Kılınç",21));

        floor[2].flats[1].addPeople(new People("jack Hill",61));
        floor[2].flats[0].addPeople(new People("Marry Jane",72));

        floor[2].flats[1].addPeople(new People("Alex Richardson",56));
        floor[2].flats[1].addPeople(new People("Ema Richardson ",48));

        floor[2].flats[1].addPeople(new People("Davis Anderson",21));
        floor[2].flats[1].addPeople(new People("Mike Clark ",26));


        robertApartment.printInformationOfFLat();

    }
}