package com.example.demo.controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Mosfet {
	@Id
	@GeneratedValue
	private Integer id;
	private String partNum;
	private String package2;
	private String configuration;
	private String esd;
	private String vds;
	private String vgs;
	private String id2;
	private String vgs2;
	private String v100;
	private String v45;
	private String v25;
	private String v18;

	public Mosfet() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPartNum() {
		return partNum;
	}

	public void setPartNum(String partNum) {
		this.partNum = partNum;
	}

	public String getPackage2() {
		return package2;
	}

	public void setPackage2(String package2) {
		this.package2 = package2;
	}

	public String getConfiguration() {
		return configuration;
	}

	public void setConfiguration(String configuration) {
		this.configuration = configuration;
	}

	public String getEsd() {
		return esd;
	}

	public void setEsd(String esd) {
		this.esd = esd;
	}

	public String getVds() {
		return vds;
	}

	public void setVds(String vds) {
		this.vds = vds;
	}

	public String getVgs() {
		return vgs;
	}

	public void setVgs(String vgs) {
		this.vgs = vgs;
	}

	public String getId2() {
		return id2;
	}

	public void setId2(String id2) {
		this.id2 = id2;
	}

	public String getVgs2() {
		return vgs2;
	}

	public void setVgs2(String vgs2) {
		this.vgs2 = vgs2;
	}

	public String getV100() {
		return v100;
	}

	public void setV100(String v100) {
		this.v100 = v100;
	}

	public String getV45() {
		return v45;
	}

	public void setV45(String v45) {
		this.v45 = v45;
	}

	public String getV25() {
		return v25;
	}

	public void setV25(String v25) {
		this.v25 = v25;
	}

	public String getV18() {
		return v18;
	}

	public void setV18(String v18) {
		this.v18 = v18;
	}

	@Override
	public String toString() {
		return "Mosfet [partNum=" + partNum + ", package2=" + package2 + ", configuration=" + configuration + ", esd="
				+ esd + ", vds=" + vds + ", vgs=" + vgs + ", id=" + id2 + ", vgs2=" + vgs2 + ", v100=" + v100 + ", v45="
				+ v45 + ", v25=" + v25 + ", v18=" + v18 + "]";
	}

}
