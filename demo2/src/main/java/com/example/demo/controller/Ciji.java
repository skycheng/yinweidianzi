package com.example.demo.controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Ciji {
	@Id
	@GeneratedValue
	private Integer id;
	private String xinghao;
	private String zhengchanggonghao;
	private String guochongdianjiancedianya;
	private String guochongdianchizhidianya;
	private String guochongdianbaohuyanchi;
	private String coshuchufangshi;
	private String pdf;

	public String getPdf() {
		return pdf;
	}

	public void setPdf(String pdf) {
		this.pdf = pdf;
	}

	public Ciji() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getXinghao() {
		return xinghao;
	}

	public void setXinghao(String xinghao) {
		this.xinghao = xinghao;
	}

	public String getZhengchanggonghao() {
		return zhengchanggonghao;
	}

	public void setZhengchanggonghao(String zhengchanggonghao) {
		this.zhengchanggonghao = zhengchanggonghao;
	}

	public String getGuochongdianjiancedianya() {
		return guochongdianjiancedianya;
	}

	public void setGuochongdianjiancedianya(String guochongdianjiancedianya) {
		this.guochongdianjiancedianya = guochongdianjiancedianya;
	}

	public String getGuochongdianchizhidianya() {
		return guochongdianchizhidianya;
	}

	public void setGuochongdianchizhidianya(String guochongdianchizhidianya) {
		this.guochongdianchizhidianya = guochongdianchizhidianya;
	}

	public String getGuochongdianbaohuyanchi() {
		return guochongdianbaohuyanchi;
	}

	public void setGuochongdianbaohuyanchi(String guochongdianbaohuyanchi) {
		this.guochongdianbaohuyanchi = guochongdianbaohuyanchi;
	}

	public String getCoshuchufangshi() {
		return coshuchufangshi;
	}

	public void setCoshuchufangshi(String coshuchufangshi) {
		this.coshuchufangshi = coshuchufangshi;
	}

	@Override
	public String toString() {
		return "Ciji [id=" + id + ", xinghao=" + xinghao + ", zhengchanggonghao=" + zhengchanggonghao
				+ ", guochongdianjiancedianya=" + guochongdianjiancedianya + ", guochongdianchizhidianya="
				+ guochongdianchizhidianya + ", guochongdianbaohuyanchi=" + guochongdianbaohuyanchi
				+ ", coshuchufangshi=" + coshuchufangshi + "]";
	}

}
