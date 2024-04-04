package id.ac.astra.polytechnic.prg7_miniproject_kel03.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "rcm_rentdetail")
public class RentDetail implements Serializable {
    @EmbeddedId
    private RentDetailPK rentDetailPK;
    @Column(name = "drn_subtotal")
    private BigDecimal drn_subtotal;
    @Column(name = "drn_created_by")
    private Integer drn_created_by;
    @Column(name = "drn_created_date")
    private Date drn_created_date;
    @Column(name = "drn_modified_by")
    private Integer drn_modified_by;
    @Column(name = "drn_modified_date")
    private Date drn_modified_date;

    public RentDetail() {
    }

    public RentDetail(RentDetailPK rentDetailPK, BigDecimal drn_subtotal, Integer drn_created_by, Date drn_created_date, Integer drn_modified_by, Date drn_modified_date) {
        this.rentDetailPK = rentDetailPK;
        this.drn_subtotal = drn_subtotal;
        this.drn_created_by = drn_created_by;
        this.drn_created_date = drn_created_date;
        this.drn_modified_by = drn_modified_by;
        this.drn_modified_date = drn_modified_date;
    }

    public RentDetailPK getRentDetailPK() {
        return rentDetailPK;
    }

    public void setRentDetailPK(RentDetailPK rentDetailPK) {
        this.rentDetailPK = rentDetailPK;
    }

    public BigDecimal getDrn_subtotal() {
        return drn_subtotal;
    }

    public void setDrn_subtotal(BigDecimal drn_subtotal) {
        this.drn_subtotal = drn_subtotal;
    }

    public Integer getDrn_created_by() {
        return drn_created_by;
    }

    public void setDrn_created_by(Integer drn_created_by) {
        this.drn_created_by = drn_created_by;
    }

    public Date getDrn_created_date() {
        return drn_created_date;
    }

    public void setDrn_created_date(Date drn_created_date) {
        this.drn_created_date = drn_created_date;
    }

    public Integer getDrn_modified_by() {
        return drn_modified_by;
    }

    public void setDrn_modified_by(Integer drn_modified_by) {
        this.drn_modified_by = drn_modified_by;
    }

    public Date getDrn_modified_date() {
        return drn_modified_date;
    }

    public void setDrn_modified_date(Date drn_modified_date) {
        this.drn_modified_date = drn_modified_date;
    }
}
