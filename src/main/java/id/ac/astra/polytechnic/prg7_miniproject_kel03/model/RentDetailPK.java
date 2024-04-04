package id.ac.astra.polytechnic.prg7_miniproject_kel03.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class RentDetailPK implements Serializable {
    @Column(name = "drn_id")
    private Integer drn_id;
    @Column(name = "rnt_id")
    private Integer rnt_id;
    @Column(name = "cam_id")
    private Integer cam_id;

    public RentDetailPK() {
    }

    public RentDetailPK(Integer drn_id, Integer rnt_id, Integer cam_id) {
        this.drn_id = drn_id;
        this.rnt_id = rnt_id;
        this.cam_id = cam_id;
    }

    public Integer getDrn_id() {
        return drn_id;
    }

    public void setDrn_id(Integer drn_id) {
        this.drn_id = drn_id;
    }

    public Integer getRnt_id() {
        return rnt_id;
    }

    public void setRnt_id(Integer rnt_id) {
        this.rnt_id = rnt_id;
    }

    public Integer getCam_id() {
        return cam_id;
    }

    public void setCam_id(Integer cam_id) {
        this.cam_id = cam_id;
    }
}
