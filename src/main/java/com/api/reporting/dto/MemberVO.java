package com.api.reporting.dto;

import java.sql.Date;

public class MemberVO {
	private String user_id;
	
	private String user_nm;
	
	private String pswd;
	
	private String user_eml_addr;
	
	private String authrt_id;
	
	private String site_id;
	
	private Date reg_dt;
	
	private Date mdfcn_dt;

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_nm() {
		return user_nm;
	}

	public void setUser_nm(String user_nm) {
		this.user_nm = user_nm;
	}

	public String getPswd() {
		return pswd;
	}

	public void setPswd(String pswd) {
		this.pswd = pswd;
	}

	public String getUser_eml_addr() {
		return user_eml_addr;
	}

	public void setUser_eml_addr(String user_eml_addr) {
		this.user_eml_addr = user_eml_addr;
	}

	public String getAuthrt_id() {
		return authrt_id;
	}

	public void setAuthrt_id(String authrt_id) {
		this.authrt_id = authrt_id;
	}

	public String getSite_id() {
		return site_id;
	}

	public void setSite_id(String site_id) {
		this.site_id = site_id;
	}

	public Date getReg_dt() {
		return reg_dt;
	}

	public void setReg_dt(Date reg_dt) {
		this.reg_dt = reg_dt;
	}

	public Date getMdfcn_dt() {
		return mdfcn_dt;
	}

	public void setMdfcn_dt(Date mdfcn_dt) {
		this.mdfcn_dt = mdfcn_dt;
	}
}