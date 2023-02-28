package Aggregation_And_Composition;

public class Personalinformation {
     private String fname;
     private String mname;
     private String lname;
     private String blood;
     private String accountnumber;
     private String nationality;
     private String yearofbirth;
    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getMname() {
        return mname;
    }
    public void setMname(String mname) {
        this.mname = mname;
    }
    public String getLname() {
        return lname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public String getBlood() {
        return blood;
    }
    public void setBlood(String blood) {
        this.blood = blood;
    }
    public String getAccountnumber() {
        return accountnumber;
    }
    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }
    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public String getYearofbirth() {
        return yearofbirth;
    }
    public void setYearofbirth(String yearofbirth) {
        this.yearofbirth = yearofbirth;
    }
    public Personalinformation(String fname, String mname, String lname, String blood, String accountnumber,
            String nationality, String yearofbirth) {
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
        this.blood = blood;
        this.accountnumber = accountnumber;
        this.nationality = nationality;
        this.yearofbirth = yearofbirth;
    }
    @Override
    public String toString() {
        return "Personalinformation [fname=" + fname + ", mname=" + mname + ", lname=" + lname + ", blood=" + blood
                + ", accountnumber=" + accountnumber + ", nationality=" + nationality + ", yearofbirth=" + yearofbirth
                + "]";
    }
    
}
