public class Main {
    public static void main(String[] args) {


        Doctor doctor = new Doctor("Mehmet Yılmaz ", "05147411414", 59,"Kalp Cerrahı","Profesör","15");


        doctor.giris("18:00");
        System.out.println(doctor.changeName);

        System.out.println(doctor.getTitle());


        System.out.println(doctor.getDoorNumber());
        doctor.examination("Kalp Ağrısı");



        Security security = new Security("Mehmet Yıldırım","05444444444",30,"Güvenlik Belgesi");
        security.calis("08:00","16:00");


        Nurse nurse = new Nurse("Ayşe", "05554744477",22,"Hemşire");
        nurse.examination("Karın Ağrısı");

        Caregiver caregiver = new Caregiver("Aslı","05444444444",23,"Hasta Bakıcı Belgesi");
        caregiver.cleaning_room();
        caregiver.calis("09:00","17:00");




















    }
}
