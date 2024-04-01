package id.ac.astra.polytechnic.prg7_miniproject_kel03.vo;

import id.co.prg7_sertifikasi.model.User;

public class CameraVo {
    private int id;
    private String name;
    private String username;
    private String email;
    private String role;

    private int prodi;

    public CameraVo() {
    }

    public CameraVo(User user) {
        this.id = user.getUsr_id();
        this.name = user.getUsr_name();
        this.username = user.getUsr_username();
        this.email = user.getUsr_email();
        this.role = user.getUsr_role();
        this.prodi = user.getPro_id();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getProdi() {
        return prodi;
    }

    public void setProdi(int prodi) {
        this.prodi = prodi;
    }

}
