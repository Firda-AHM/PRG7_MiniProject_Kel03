package id.ac.astra.polytechnic.prg7_miniproject_kel03.vo;

import id.ac.astra.polytechnic.prg7_miniproject_kel03.model.Rent;

import java.math.BigDecimal;
import java.util.Date;

public class RentVo {
    private Integer rntId;
    private String customer;
    private Date rentDate;
    private Date rentReturn;
    private Integer time;
    private BigDecimal total;
    private BigDecimal charge;
    private Integer rnt_status;

    public RentVo() {
    }

    public RentVo(Rent rent) {
        this.rntId = rent.getRnt_id();
        this.customer = rent.getRnt_customer();
        this.rentDate = rent.getRnt_rent_date();
        this.rentReturn = rent.getRnt_rent_return();
        this.time = rent.getRnt_time();
        this.total = rent.getRnt_total();
        this.charge = rent.getRnt_charge();
        this.rnt_status = rent.getRnt_status();
    }

    public Integer getRnt_status() {
        return rnt_status;
    }

    public void setRnt_status(Integer rnt_status) {
        this.rnt_status = rnt_status;
    }

    public Integer getRntId() {
        return rntId;
    }

    public void setRntId(Integer rntId) {
        this.rntId = rntId;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Date getRentDate() {
        return rentDate;
    }

    public void setRentDate(Date rentDate) {
        this.rentDate = rentDate;
    }

    public Date getRentReturn() {
        return rentReturn;
    }

    public void setRentReturn(Date rentReturn) {
        this.rentReturn = rentReturn;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getCharge() {
        return charge;
    }

    public void setCharge(BigDecimal charge) {
        this.charge = charge;
    }
}
