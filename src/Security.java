public class Security extends ServiceWorkers{

    public Security(String name, String mobilephone, int age, String document) {
        super(name, mobilephone, age, document);
    }

    @Override
    public void calis(String girisSaati, String cikisSaati){

        System.out.println("Güvenlik " + this.getName() + " " + girisSaati + " " +  cikisSaati + " saatleri arasında çalıştı");
    }



}
