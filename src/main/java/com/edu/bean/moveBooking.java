package com.edu.bean;

import java.util.Date;

public class moveBooking {
    private Integer id;

    private String area;

    private String cartype;

    private Date movedate;

    private String contate;

    private String phone;

    private Integer staus;

    
    @Override
	public String toString() {
		return "moveBooking [id=" + id + ", area=" + area + ", cartype=" + cartype + ", movedate=" + movedate
				+ ", contate=" + contate + ", phone=" + phone + ", staus=" + staus + "]";
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype == null ? null : cartype.trim();
    }

    public Date getMovedate() {
        return movedate;
    }

    public void setMovedate(Date movedate) {
        this.movedate = movedate;
    }

    public String getContate() {
        return contate;
    }

    public void setContate(String contate) {
        this.contate = contate == null ? null : contate.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getStaus() {
        return staus;
    }

    public void setStaus(Integer staus) {
        this.staus = staus;
    }

	
}