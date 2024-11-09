package bai1_chuong3;

public class Person {
	    private String name;
	    private String dob;
	    private String pob;
	    private String gender;
	    private String email;
	    private String phone;
	    //constructor
	    public Person(){}
	    public Person(String name, String dob, String pob, String gender, String email, String phone) {
	        this.name = name;
	        this.dob = dob;
	        this.pob = pob;
	        this.gender = gender;
	        this.email = email;
	        this.phone = phone;
	    }
	    //setter and getter
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public String getDob() {
	        return dob;
	    }
	    public void setDob(String dob) {
	        this.dob = dob;
	    }
	    public String getPob() {
	        return pob;
	    }
	    public void setPob(String pob) {
	        this.pob = pob;
	    }
	    public String getGender() {
	        return gender;
	    }
	    public void setGender(String gender) {
	        this.gender = gender;
	    }
	    public String getEmail() {
	        return email;
	    }
	    public void setEmail(String email) {
	        this.email = email;
	    }
	    public String getPhone() {
	        return phone;
	    }
	    public void setPhone(String phone) {
	        this.phone = phone;
	    }
	    //toString 
	    public String toString(){
	        return "\nName: "+name+"\nDate of birth: "+dob+"\nPosition of birth: "+pob
	        +"\nGender: "+gender+"\nEmail: "+email+"\nPhone: "+phone;
	    }
	}

