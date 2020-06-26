package com.sise.travel.po;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.FetchType;
import javax.persistence.ManyToMany;

public class Introduce {
	private Integer tid;
	private String routeName;
	private String introduce;
	private String images;
	private String routeway;
	private String travel;
	private City city;

	private Set<Place> places=new HashSet<Place>();
	public Integer getTid() {
		return tid;
	}
	public String getRouteName() {
		return routeName;
	}
	public String getIntroduce() {
		return introduce;
	}
	public String getImages() {
		return images;
	}
	public Set<Place> getPlaces() {
		return places;
	}
	public String getRouteway() {
		return routeway;
	}
	public String getTravel() {
		return travel;
	}
	public void setTravel(String travel) {
		this.travel = travel;
	}
	public void setRouteway(String routeway) {
		this.routeway = routeway;
	}
	public void setPlaces(Set<Place> places) {
		this.places = places;
	}
	public void setImages(String images) {
		this.images = images;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
}
