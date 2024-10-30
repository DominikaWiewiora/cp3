public class DrivingLicence {
    private String name;
    private String surname;
    private String address;
    private String postalCode;
    private String city;
    private int licenceNumber;
    private int yearOfIssuingLicence;
    private String licenceCategory;


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public int getLicenceNumber() {
        return licenceNumber;
    }

    public int getYearOfIssuingLicence() {
        return yearOfIssuingLicence;
    }

    public String getLicenceCategory() {
        return licenceCategory;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setLicenceNumber(int licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public void setYearOfIssuingLicence(int yearOfIssuingLicence) {
        if (yearOfIssuingLicence>=1980 && yearOfIssuingLicence<=2024) {
            this.yearOfIssuingLicence = yearOfIssuingLicence;
        }
    }

    public void setLicenceCategory(String licenceCategory) {
        this.licenceCategory = licenceCategory;
    }

  
    public String toString() {
        return  "Name: "+ getName()+"\n"+
                "Surname: "+getSurname()+"\n"+
                "Address: "+getAddress()+"\n"+
                "Postal code: "+getPostalCode()+"\n"+
                "City: "+getCity()+"\n"+
                "Driving licence number: "+getLicenceNumber()+"\n"+
                "Year of issuing the licence: "+getYearOfIssuingLicence()+"\n"+
                "Driving licence category: "+getLicenceCategory();
    }



}
