public class Flat {

    private int flatNumber;
    private People[] people;
    private int humanCount=0;
    private String flatType;
    public Flat(int flatNumber,String flatType){
        this.flatType=flatType;
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
    public String toString(){
        if (humanCount==0){
            return "------------------------------------" +
                    "\n⚫Flat number: "+ flatNumber +
                    "\n⭕Flat is empty";
        }
        String peopleInformation="🔶Flat type: "+flatType;
        for (int i=0;i<humanCount;i++){
            peopleInformation+= "\n🔶Name Surname: "+people[i].getName()+"\n🔶Age=>"+ people[i].getAge()+"\n";
        }
        return "\n------------------------------------" +
                "\n⚫🔵Flat number: "+ flatNumber +
                "\n"+peopleInformation;
    }
}
