package id.ac.astra.polytechnic.prg7_miniproject_kel03.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "rcm_rent")
public class Rent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rnt_id")
    private Integer rnt_id;
    @Column(name = "rnt_customer")
    private String rnt_customer;
    @Column(name = "rnt_rent_date")
    private Date rnt_rent_date;
    @Column(name = "rnt_rent_return")
    private Date rnt_rent_return;
    @Column(name = "rnt_time")
    private Integer rnt_time;
    @Column(name = "rnt_total")
    private BigDecimal rnt_total;
    @Column(name = "rnt_charge")
    private BigDecimal rnt_charge;
    @Column(name = "rnt_status")
    private Integer rnt_status;
    @Column(name = "rnt_created_by")
    private Integer rnt_created_by;
    @Column(name = "rnt_created_date")
    private Date rnt_created_date;
    @Column(name = "rnt_modified_by")
    private Integer rnt_modified_by;
    @Column(name = "rnt_modified_date")
    private Date rnt_modified_date;

    public Rent() {
    }

    public Rent(Integer rnt_id, String rnt_customer, Date rnt_rent_date, Date rnt_rent_return, Integer rnt_time, BigDecimal rnt_total, BigDecimal rnt_charge, Integer rnt_status, Integer rnt_created_by, Date rnt_created_date, Integer rnt_modified_by, Date rnt_modified_date) {
        this.rnt_id = rnt_id;
        this.rnt_customer = rnt_customer;
        this.rnt_rent_date = rnt_rent_date;
        this.rnt_rent_return = rnt_rent_return;
        this.rnt_time = rnt_time;
        this.rnt_total = rnt_total;
        this.rnt_charge = rnt_charge;
        this.rnt_status = rnt_status;
        this.rnt_created_by = rnt_created_by;
        this.rnt_created_date = rnt_created_date;
        this.rnt_modified_by = rnt_modified_by;
        this.rnt_modified_date = rnt_modified_date;
    }

    public Integer getRnt_id() {
        return rnt_id;
    }

    public void setRnt_id(Integer rnt_id) {
        this.rnt_id = rnt_id;
    }

    public String getRnt_customer() {
        return rnt_customer;
    }

    public void setRnt_customer(String rnt_customer) {
        this.rnt_customer = rnt_customer;
    }

    public Date getRnt_rent_date() {
        return rnt_rent_date;
    }

    public void setRnt_rent_date(Date rnt_rent_date) {
        this.rnt_rent_date = rnt_rent_date;
    }

    public Date getRnt_rent_return() {
        return rnt_rent_return;
    }

    public void setRnt_rent_return(Date rnt_rent_return) {
        this.rnt_rent_return = rnt_rent_return;
    }

    public Integer getRnt_time() {
        return rnt_time;
    }

    public void setRnt_time(Integer rnt_time) {
        this.rnt_time = rnt_time;
    }

    public BigDecimal getRnt_total() {
        return rnt_total;
    }

    public void setRnt_total(BigDecimal rnt_total) {
        this.rnt_total = rnt_total;
    }

    public BigDecimal getRnt_charge() {
        return rnt_charge;
    }

    public void setRnt_charge(BigDecimal rnt_charge) {
        this.rnt_charge = rnt_charge;
    }

    public Integer getRnt_status() {
        return rnt_status;
    }

    public void setRnt_status(Integer rnt_status) {
        this.rnt_status = rnt_status;
    }

    public Integer getRnt_created_by() {
        return rnt_created_by;
    }

    public void setRnt_created_by(Integer rnt_created_by) {
        this.rnt_created_by = rnt_created_by;
    }

    public Date getRnt_created_date() {
        return rnt_created_date;
    }

    public void setRnt_created_date(Date rnt_created_date) {
        this.rnt_created_date = rnt_created_date;
    }

    public Integer getRnt_modified_by() {
        return rnt_modified_by;
    }

    public void setRnt_modified_by(Integer rnt_modified_by) {
        this.rnt_modified_by = rnt_modified_by;
    }

    public Date getRnt_modified_date() {
        return rnt_modified_date;
    }

    public void setRnt_modified_date(Date rnt_modified_date) {
        this.rnt_modified_date = rnt_modified_date;
    }
}
