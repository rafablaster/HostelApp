package hostelapp.hostel;

import java.util.ArrayList;

public class Guest {
    private String name;
    private String lastName;

    private Address address;

    private String email;

    private Date birthday;


    private ArrayList<Reservation> reservations = new ArrayList<>();

    public Guest() {
        this("");
    }
    public Guest(String name){
        this(name, "");
    }

    public Guest(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
        //this.reservations = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public boolean setName(String name) {
        if (name.length() > 2) {
            this.name = name;
            return true;
        }
        return false;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}