public class Main {
    public static void main(String[] args) {

        Apartman robertApartment = new Apartman("Robert Apartment",1);

        robertApartment.createFloor(0,"BLUE");
        robertApartment.createFloor(1,"BLACK");
        robertApartment.createFloor(2,"BLUE");
        robertApartment.createFloor(3,"YELLOW");
        robertApartment.createFloor(4,"GREEN");
        robertApartment.createFloor(5,"PURPLE");
        robertApartment.createFloor(5,"GREEN");


        System.out.println(robertApartment.toString());
        Floor[] kat = robertApartment.getFloors();

        kat[0].createFlat(12,robertApartment);
        kat[0].createFlat(14,robertApartment);

        kat[1].createFlat(42,robertApartment);

        kat[3].createFlat(42,robertApartment);

        kat[1].createFlat(62,robertApartment);

        kat[2].createFlat(192,robertApartment);
        kat[2].createFlat(72,robertApartment);



        kat[0].flats[0].addPeople(new People("John Glory",49));

        kat[0].flats[1].addPeople(new People("Bella Grey",44));

        kat[1].flats[0].addPeople(new People("Biden Haven",21));
        kat[1].flats[0].addPeople(new People("Beyza Kılınç",21));

        kat[2].flats[1].addPeople(new People("jack Hill",61));
        kat[2].flats[0].addPeople(new People("Marry Jane",72));

        kat[2].flats[1].addPeople(new People("Alex Richardson",56));
        kat[2].flats[1].addPeople(new People("Ema Richardson ",48));

        kat[2].flats[1].addPeople(new People("Davis Anderson",21));
        kat[2].flats[1].addPeople(new People("Mike Clark ",26));


        robertApartment.printInformationOfApartment();

    }
}