package com.example.demo.controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SingleSection {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String partnum;
	private String package2;
	private String guochongfazhi;
	private String guofangfazhi;
	private String fangdianguoliufazhi;
	private String chongdianguoliufazhi;
	private String guochongbaohuyanchi;
	private String guofangbaohuyanchi;
	private String fangdianguoliubaohuyanchi;
	private String chongdianguoliubaohuyanchi;
	private String zhengchanggonghao;
	private String xiumiangonghao;
	private String xiumianzihuifu;
	private String oychongdian;
	private String louyuanjianjichuandianya;
	private String rss;
	private String pdf;

	public String getPdf() {
		return pdf;
	}

	public void setPdf(String pdf) {
		this.pdf = pdf;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPartnum() {
		return partnum;
	}

	public void setPartnum(String partnum) {
		this.partnum = partnum;
	}

	public String getPackage2() {
		return package2;
	}

	public void setPackage2(String package2) {
		this.package2 = package2;
	}

	public String getGuochongfazhi() {
		return guochongfazhi;
	}

	public void setGuochongfazhi(String guochongfazhi) {
		this.guochongfazhi = guochongfazhi;
	}

	public String getGuofangfazhi() {
		return guofangfazhi;
	}

	public void setGuofangfazhi(String guofangfazhi) {
		this.guofangfazhi = guofangfazhi;
	}

	public String getFangdianguoliufazhi() {
		return fangdianguoliufazhi;
	}

	public void setFangdianguoliufazhi(String fangdianguoliufazhi) {
		this.fangdianguoliufazhi = fangdianguoliufazhi;
	}

	public String getChongdianguoliufazhi() {
		return chongdianguoliufazhi;
	}

	public void setChongdianguoliufazhi(String chongdianguoliufazhi) {
		this.chongdianguoliufazhi = chongdianguoliufazhi;
	}

	public String getGuochongbaohuyanchi() {
		return guochongbaohuyanchi;
	}

	public void setGuochongbaohuyanchi(String guochongbaohuyanchi) {
		this.guochongbaohuyanchi = guochongbaohuyanchi;
	}

	public String getGuofangbaohuyanchi() {
		return guofangbaohuyanchi;
	}

	public void setGuofangbaohuyanchi(String guofangbaohuyanchi) {
		this.guofangbaohuyanchi = guofangbaohuyanchi;
	}

	public String getFangdianguoliubaohuyanchi() {
		return fangdianguoliubaohuyanchi;
	}

	public void setFangdianguoliubaohuyanchi(String fangdianguoliubaohuyanchi) {
		this.fangdianguoliubaohuyanchi = fangdianguoliubaohuyanchi;
	}

	public String getChongdianguoliubaohuyanchi() {
		return chongdianguoliubaohuyanchi;
	}

	public void setChongdianguoliubaohuyanchi(String chongdianguoliubaohuyanchi) {
		this.chongdianguoliubaohuyanchi = chongdianguoliubaohuyanchi;
	}

	public String getZhengchanggonghao() {
		return zhengchanggonghao;
	}

	public void setZhengchanggonghao(String zhengchanggonghao) {
		this.zhengchanggonghao = zhengchanggonghao;
	}

	public String getXiumiangonghao() {
		return xiumiangonghao;
	}

	public void setXiumiangonghao(String xiumiangonghao) {
		this.xiumiangonghao = xiumiangonghao;
	}

	public String getXiumianzihuifu() {
		return xiumianzihuifu;
	}

	public void setXiumianzihuifu(String xiumianzihuifu) {
		this.xiumianzihuifu = xiumianzihuifu;
	}

	public String getOychongdian() {
		return oychongdian;
	}

	public void setOychongdian(String oychongdian) {
		this.oychongdian = oychongdian;
	}

	public String getLouyuanjianjichuandianya() {
		return louyuanjianjichuandianya;
	}

	public void setLouyuanjianjichuandianya(String louyuanjianjichuandianya) {
		this.louyuanjianjichuandianya = louyuanjianjichuandianya;
	}

	public String getRss() {
		return rss;
	}

	public void setRss(String rss) {
		this.rss = rss;
	}

	public SingleSection() {

	}

}
