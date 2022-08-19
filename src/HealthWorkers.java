//Bu class'a employee classı extend edildi.
public abstract class HealthWorkers extends Employee  {
private  String department;
        //Yapıcı
    public HealthWorkers(String name, String mobilephone, int age, String cardiac_surgery) {
        super(name, mobilephone, age);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    //class absract olduğu için method'da ebstract olmak zorunda oldu.Bu yüzden bu method'da abstract.
    public abstract void examination(String examination_cause);

}
