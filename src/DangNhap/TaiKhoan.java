/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DangNhap;

/**
 *
 * @author ASUS
 */
public class TaiKhoan {
    String tk;
    String mk;
    public TaiKhoan(){
        this.tk = "";
        this.mk = "";
    }

    public TaiKhoan(String tk, String mk) {
        this.tk = tk;
        this.mk = mk;
    }
    
    public String getTk() {
        return tk;
    }

    public String getMk() {
        return mk;
    }

    public void setTk(String tk) {
        this.tk = tk;
    }

    public void setMk(String mk) {
        this.mk = mk;
    }

    @Override
    public String toString() {
        return tk + "---" + mk;
    }
    
}
