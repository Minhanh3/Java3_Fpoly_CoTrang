/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mode;

/**
 *
 * @author Manhdepzai
 */
public class Student {

    String masv;
    String hoten;
    String email;
    String sodt;
    int gioitinh;
    String diachi;
    String hinh;

    public Student() {
    }

    public Student(String masv, String hoten, String email, String sodt, int gioitinh, String diachi, String hinh) {
        this.masv = masv;
        this.hoten = hoten;
        this.email = email;
        this.sodt = sodt;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.hinh = hinh;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSodt() {
        return sodt;
    }

    public void setSodt(String sodt) {
        this.sodt = sodt;
    }

    public int getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(int gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

}
