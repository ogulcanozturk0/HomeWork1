public class Doctor extends HealthWorkers implements IEmployee{
    private String title;
    private String doorNumber;
    String changeName = impname;
   public Doctor(String name, String mobilephone, int age , String cardiac_surgery,String title, String doorNumber ){
       super(name, mobilephone, age, cardiac_surgery);
       this.title = title;
       this.doorNumber = doorNumber;
       this.changeName = impname;

   }

    public String getTitle() {
        return title;

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(String doorNumber) {
        this.doorNumber = doorNumber;
    }
    public void operation(){
        System.out.println(this.getName()+ "Ameliyat Etti");
    }

    @Override
    public void examination(String examination_cause){
        System.out.println("Doktor " + this.getName() +examination_cause + "" + "olan  Hastayı Muayene Etti");
    }


    @Override
    public void changeName() {
       this.changeName = impname;
    }
}
