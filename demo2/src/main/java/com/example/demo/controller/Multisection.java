package com.example.demo.controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Multisection {
	@Id
	@GeneratedValue
	private Integer id;
	private String partnum;
	private String package2;
	private String zhengchanggonghao;
	private String xiumiangonghao;
	private String jiancedianyaguochongdian;
	private String jiechudianyaguochongdian;
	private String jiancedianyaguofangdian;
	private String jiechudianyaguofangdian;
	private String jiancedianya1fangdianguoliu;
	private String jiancedianya2fangdianguoliu;
	private String jiancedianyaduanlu;
	private String jiancedianyachongdianguoliu;
	private String qidongdianyapingheng;

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

	public String getJiancedianyaguochongdian() {
		return jiancedianyaguochongdian;
	}

	public void setJiancedianyaguochongdian(String jiancedianyaguochongdian) {
		this.jiancedianyaguochongdian = jiancedianyaguochongdian;
	}

	public String getJiechudianyaguochongdian() {
		return jiechudianyaguochongdian;
	}

	public void setJiechudianyaguochongdian(String jiechudianyaguochongdian) {
		this.jiechudianyaguochongdian = jiechudianyaguochongdian;
	}

	public String getJiancedianyaguofangdian() {
		return jiancedianyaguofangdian;
	}

	public void setJiancedianyaguofangdian(String jiancedianyaguofangdian) {
		this.jiancedianyaguofangdian = jiancedianyaguofangdian;
	}

	public String getJiechudianyaguofangdian() {
		return jiechudianyaguofangdian;
	}

	public void setJiechudianyaguofangdian(String jiechudianyaguofangdian) {
		this.jiechudianyaguofangdian = jiechudianyaguofangdian;
	}

	public String getJiancedianya1fangdianguoliu() {
		return jiancedianya1fangdianguoliu;
	}

	public void setJiancedianya1fangdianguoliu(String jiancedianya1fangdianguoliu) {
		this.jiancedianya1fangdianguoliu = jiancedianya1fangdianguoliu;
	}

	public String getJiancedianya2fangdianguoliu() {
		return jiancedianya2fangdianguoliu;
	}

	public void setJiancedianya2fangdianguoliu(String jiancedianya2fangdianguoliu) {
		this.jiancedianya2fangdianguoliu = jiancedianya2fangdianguoliu;
	}

	public String getJiancedianyaduanlu() {
		return jiancedianyaduanlu;
	}

	public void setJiancedianyaduanlu(String jiancedianyaduanlu) {
		this.jiancedianyaduanlu = jiancedianyaduanlu;
	}

	public String getJiancedianyachongdianguoliu() {
		return jiancedianyachongdianguoliu;
	}

	public void setJiancedianyachongdianguoliu(String jiancedianyachongdianguoliu) {
		this.jiancedianyachongdianguoliu = jiancedianyachongdianguoliu;
	}

	public String getQidongdianyapingheng() {
		return qidongdianyapingheng;
	}

	public void setQidongdianyapingheng(String qidongdianyapingheng) {
		this.qidongdianyapingheng = qidongdianyapingheng;
	}

	public Multisection() {

	}

}
