package id.ac.astra.polytechnic.prg7_miniproject_kel03.vo;


import id.ac.astra.polytechnic.prg7_miniproject_kel03.model.RentDetail;

import java.math.BigDecimal;

public class RentDetailVo {
    private Integer drnId;
    private Integer rntId;
    private String rntDesc;
    private Integer camId;
    private String camDesc;
    private BigDecimal drnSubtotal;

    public RentDetailVo() {
    }

    public RentDetailVo(RentDetail rentDetail) {
        this.drnId = rentDetail.getRentDetailPK().getDrn_id();
        this.rntId = rentDetail.getRentDetailPK().getRnt_id();
        this.camId = rentDetail.getRentDetailPK().getCam_id();
        this.drnSubtotal = rentDetail.getDrn_subtotal();
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

    public String getRntDesc() {
        return rntDesc;
    }

    public void setRntDesc(String rntDesc) {
        this.rntDesc = rntDesc;
    }

    public Integer getCamId() {
        return camId;
    }

    public void setCamId(Integer camId) {
        this.camId = camId;
    }

    public String getCamDesc() {
        return camDesc;
    }

    public void setCamDesc(String camDesc) {
        this.camDesc = camDesc;
    }

    public BigDecimal getDrnSubtotal() {
        return drnSubtotal;
    }

    public void setDrnSubtotal(BigDecimal drnSubtotal) {
        this.drnSubtotal = drnSubtotal;
    }
}
