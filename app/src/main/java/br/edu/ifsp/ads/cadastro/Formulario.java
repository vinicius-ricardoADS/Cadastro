package br.edu.ifsp.ads.cadastro;

import android.widget.RadioButton;
import android.widget.Spinner;

public class Formulario {

    private String full_name;

    private String phone;

    private String email;

    private String sexo;

    private String city;

    private String uf;

    public Formulario(String full_name, String phone, String email, String sexo, String city, String uf) {
        this.full_name = full_name;
        this.phone = phone;
        this.email = email;
        this.sexo = sexo;
        this.city = city;
        this.uf = uf;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRadio() {
        return sexo;
    }

    public void String(String sexo) {
        this.sexo = sexo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "Nome='" + full_name + '\'' +
                ", telefone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", sexo=" + sexo +
                ", cidade='" + city + '\'' +
                ", uf=" + uf;
    }
}
