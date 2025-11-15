package br.com.cantarutti.hrPointMarking.model;

import br.com.cantarutti.hrPointMarking.model.enums.Marker;

public class PointMarking {

    private Integer CdPointer;
    private Employee Register;
    private String DateMarker;
    private Marker PointMarker;

    public Integer getCdPointer() {
        return this.CdPointer;
    }

    public void setCdPointer(Integer CdPointer) {
        this.CdPointer = CdPointer;
    }

    public Employee getRegister() {
        return Register;
    }

    public void setRegister(Employee Register) {
        this.Register = Register;
    }

    public String getDateMarker() {
        return DateMarker;
    }

    public void setDateMarker(String DateMarker) {
        this.DateMarker = DateMarker;
    }

    public Marker getPointMarker() {
        return PointMarker;
    }

    public void setPointMarker(Marker PointMarker) {
        this.PointMarker = PointMarker;
    }
    
}
