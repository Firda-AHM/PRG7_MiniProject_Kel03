package id.ac.astra.polytechnic.prg7_miniproject_kel03.vo;


import id.ac.astra.polytechnic.prg7_miniproject_kel03.model.RentDetail;

import java.math.BigDecimal;
import java.util.Date;

public class RentDetailVoForm {
    private Integer drnId;
    private Integer rntId;
    private Integer camId;
    private BigDecimal drnSubtotal;
    private Integer drnCreatedBy;
    private Date drnCreatedDate;
    private Integer drnModifiedBy;
    private Date drnModifiedDate;

    public RentDetailVoForm() {
    }

    public RentDetailVoForm(RentDetail rentDetail) {
        this.drnId = rentDetail.getRentDetailPK().getDrn_id();
        this.rntId = rentDetail.getRentDetailPK().getRnt_id();
        this.camId = rentDetail.getRentDetailPK().getCam_id();
        this.drnSubtotal = rentDetail.getDrn_subtotal();
        this.drnCreatedBy = rentDetail.getDrn_created_by();
        this.drnCreatedDate = rentDetail.getDrn_created_date();
        this.drnModifiedBy = rentDetail.getDrn_modified_by();
        this.drnModifiedDate = rentDetail.getDrn_modified_date();
    }

    public Integer getDrnId() {
        return drnId;
    }

    public void setDrnId(Integer drnId) {
        this.drnId = drnId;
    }

    public Integer getRntId() {
        return rntId;
    }

    public void setRntId(Integer rntId) {
        this.rntId = rntId;
    }

    public Integer getCamId() {
        return camId;
    }

    public void setCamId(Integer camId) {
        this.camId = camId;
    }

    public BigDecimal getDrnSubtotal() {
        return drnSubtotal;
    }

    public void setDrnSubtotal(BigDecimal drnSubtotal) {
        this.drnSubtotal = drnSubtotal;
    }

    public Integer getDrnCreatedBy() {
        return drnCreatedBy;
    }

    public void setDrnCreatedBy(Integer drnCreatedBy) {
        this.drnCreatedBy = drnCreatedBy;
    }

    public Date getDrnCreatedDate() {
        return drnCreatedDate;
    }

    public void setDrnCreatedDate(Date drnCreatedDate) {
        this.drnCreatedDate = drnCreatedDate;
    }

    public Integer getDrnModifiedBy() {
        return drnModifiedBy;
    }

    public void setDrnModifiedBy(Integer drnModifiedBy) {
        this.drnModifiedBy = drnModifiedBy;
    }

    public Date getDrnModifiedDate() {
        return drnModifiedDate;
    }

    public void setDrnModifiedDate(Date drnModifiedDate) {
        this.drnModifiedDate = drnModifiedDate;
    }
}
