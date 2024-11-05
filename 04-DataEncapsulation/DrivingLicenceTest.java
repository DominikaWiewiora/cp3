public class DrivingLicenceTest {
    public static void main(String[] args) {
        DrivingLicence dl = new DrivingLicence();
        dl.setName("jacK");
        dl.setSurname("Smth");
        dl.setAddress("somewhere");
        dl.setPostalCode("12-345");
        dl.setCity("Kraków");
        dl.setYearOfIssuingLicence(2025);
        dl.setLicenceNumber(100);
        dl.setLicenceCategory("B");
    


        System.out.println(dl.toString());


    }
}
