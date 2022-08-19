public class Caregiver extends ServiceWorkers{

    public Caregiver(String name, String mobilephone, int age, String document) {
        super(name, mobilephone, age, document);

    }
    public void cleaning_room(){
        System.out.println(this.getName()+ " Oda Temizliği Yaptı");
    }
    @Override
    public void calis(String girisSaati, String cikisSaati){

        System.out.println("Hasta Bakici " + this.getName() + " " + girisSaati + " " +  cikisSaati + " saatleri arasında çalıştı");
    }


}
