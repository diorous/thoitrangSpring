package com.diorous.model;

public class NhanVien {
	private String hotenNV;
	private int maNV;
	public String getHotenNV() {
		return hotenNV;
	}
	public void setHotenNV(String hotenNV) {
		this.hotenNV = hotenNV;
	}
	public int getMaNV() {
		return maNV;
	}
	public void setMaNV(int maNV) {
		this.maNV = maNV;
	}
	
	public NhanVien() {
		super();
	}
	
	public NhanVien(String hotenNV, int maNV) {
		super();
		this.hotenNV = hotenNV;
		this.maNV = maNV;
	}
	
}
