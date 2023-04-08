public class Flat {

    private int flatNumber;
    private People[] people;
    private int humanCount=0;
    public Flat(int flatNumber){
        this.flatNumber =flatNumber;
        this.people =new People[50];
    }
    public void addPeople(People human){
        people[humanCount]=human;
        humanCount++;
    }
    public int getFlatNumber() {
        return flatNumber;
    }
    public void setFlatNumber(int flatNumber) {
        this.flatNumber = flatNumber;
    }
    public People[] getPeople() {
        return people;
    }
    public String toString(){
        if (humanCount==0){
            return "------------------------------------" +
                    "\n⚫Flat number: "+ flatNumber +
                    "\n⭕Flat is empty";
        }
        String peopleInformation="";
        for (int i=0;i<humanCount;i++){
            peopleInformation+= "\n🔶Name Surname: "+people[i].getName()+"\n🔶Age=>"+ people[i].getAge()+"\n";
        }
        return "\n------------------------------------" +
                "\n⚫🔵Flat number: "+ flatNumber +
                "\n"+peopleInformation;
    }
}
