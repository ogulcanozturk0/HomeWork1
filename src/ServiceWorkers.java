//Bu class'a employee classı extend edildi.
public abstract class ServiceWorkers  extends Employee  {
    String document;
    //Yapıcı oluşturuldu
    public ServiceWorkers(String name, String mobilephone, int age,String document) {
        super(name, mobilephone, age);
        this.document = document;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    //class absract olduğu için method'da ebstract olmak zorunda oldu.Bu yüzden bu method'da abstract.
    public abstract void calis (String girisSaati, String cikisSaati);



}
