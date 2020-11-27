/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testapp;

/**
 *
 * @author MSI-10scxr
 */
public class Teacher {
    private String fname;
    private String lname;
    private String address;
    private String telephoneNum;

    public Teacher(String fname, String lname, String address,String telephoneNum) {
        this.fname = fname;
        this.lname = lname;
        this.address = address;
        this.telephoneNum = telephoneNum;
    }

    public String getFname() {
        return fname;
    }

    public String getTelephoneNum() {
        return telephoneNum;
    }

    public void setTelephoneNum(String telephoneNum) {
        this.telephoneNum = telephoneNum;
    }

    public String getLname() {
        return lname;
    }

    public String getAddress() {
        return address;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Teacher{" + "fname=" + fname + ", lname=" + lname + ", address=" + address + ", telephoneNum=" + telephoneNum + '}';
    }


    
    
}
