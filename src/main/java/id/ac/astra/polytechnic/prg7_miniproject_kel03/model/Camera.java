package id.ac.astra.polytechnic.prg7_miniproject_kel03.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "stf_msuser")
public class Camera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usr_id")
    private int usr_id;
    @Column(name = "usr_name")
    private String usr_name;
    @Column(name = "usr_username")
    private String usr_username;
    @Column(name = "usr_password")
    private String usr_password;
    @Column(name = "usr_email")
    private String usr_email;
    @Column(name = "usr_role")
    private String usr_role;
    @Column(name = "usr_status")
    private int usr_status;
    @Column(name = "pro_id")
    private int pro_id;
    @Column(name = "usr_creaby")
    private Integer usr_creaby;
    @Column(name = "usr_creadate")
    private Date usr_creadate;
    @Column(name = "usr_modiby")
    private Integer usr_modiby;
    @Column(name = "usr_modidate")
    private Date usr_modidate;

    public Camera() {
    }

    public Camera(int usr_id, String usr_name, String usr_username, String usr_password, String usr_email, String usr_role, int usr_status, int pro_id, Integer usr_creaby, Date usr_creadate, Integer usr_modiby, Date usr_modidate) {
        this.usr_id = usr_id;
        this.usr_name = usr_name;
        this.usr_username = usr_username;
        this.usr_password = usr_password;
        this.usr_email = usr_email;
        this.usr_role = usr_role;
        this.usr_status = usr_status;
        this.pro_id = pro_id;
        this.usr_creaby = usr_creaby;
        this.usr_creadate = usr_creadate;
        this.usr_modiby = usr_modiby;
        this.usr_modidate = usr_modidate;
    }

    public int getUsr_id() {
        return usr_id;
    }

    public void setUsr_id(int usr_id) {
        this.usr_id = usr_id;
    }

    public String getUsr_name() {
        return usr_name;
    }

    public void setUsr_name(String usr_name) {
        this.usr_name = usr_name;
    }

    public String getUsr_username() {
        return usr_username;
    }

    public void setUsr_username(String usr_username) {
        this.usr_username = usr_username;
    }

    public String getUsr_password() {
        return usr_password;
    }

    public void setUsr_password(String usr_password) {
        this.usr_password = usr_password;
    }

    public String getUsr_email() {
        return usr_email;
    }

    public void setUsr_email(String usr_email) {
        this.usr_email = usr_email;
    }

    public String getUsr_role() {
        return usr_role;
    }

    public void setUsr_role(String usr_role) {
        this.usr_role = usr_role;
    }

    public int getUsr_status() {
        return usr_status;
    }

    public void setUsr_status(int usr_status) {
        this.usr_status = usr_status;
    }

    public int getPro_id() {
        return pro_id;
    }

    public void setPro_id(int pro_id) {
        this.pro_id = pro_id;
    }

    public Integer getUsr_creaby() {
        return usr_creaby;
    }

    public void setUsr_creaby(Integer usr_creaby) {
        this.usr_creaby = usr_creaby;
    }

    public Date getUsr_creadate() {
        return usr_creadate;
    }

    public void setUsr_creadate(Date usr_creadate) {
        this.usr_creadate = usr_creadate;
    }

    public Integer getUsr_modiby() {
        return usr_modiby;
    }

    public void setUsr_modiby(Integer usr_modiby) {
        this.usr_modiby = usr_modiby;
    }

    public Date getUsr_modidate() {
        return usr_modidate;
    }

    public void setUsr_modidate(Date usr_modidate) {
        this.usr_modidate = usr_modidate;
    }
}
