public class Nurse extends HealthWorkers{
    public Nurse(String name, String mobilephone, int age, String cardiac_surgery) {
        super(name, mobilephone, age, cardiac_surgery);
    }
    public void bleed(){

        System.out.println("Kan Aldı");
    }
    @Override
    public void examination(String examination_cause){
        System.out.println("Hemşire " + this.getName() + "" +examination_cause+ "olan  Hastayı Muayene Etti");
    }



}
