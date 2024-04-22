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

    public RentDetail() {
    }

    public RentDetail(RentDetailPK rentDetailPK, BigDecimal drn_subtotal) {
        this.rentDetailPK = rentDetailPK;
        this.drn_subtotal = drn_subtotal;
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
}
