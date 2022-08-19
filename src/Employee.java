public class Employee {
    private String name;
    private String mobilephone;
    private int age;

    //Değişkenlerin yapıcıları oluşturuldu.
public Employee (String name, String mobilephone, int age){
    this.name = name;
    this.mobilephone = mobilephone;
    this.age = age;
}
    //Getter ve Setterlar oluşturuldu.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void giris(){
        System.out.println(this.name +  " Hastaneye Girdi. ");
    }

    //
    public void giris(String girisSaati){
        System.out.println(this.name + " " + girisSaati + " saatinde hastaneye girdi");
    }


    public void cikis(){
        System.out.println(this.name+ " Hastaneden Cikti.  ");
    }


}
