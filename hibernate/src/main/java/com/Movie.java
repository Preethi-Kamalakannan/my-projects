package com;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
@Cacheable
public class Movie {
   private int mid;
   private String mname;
   private String hero;
   private String heroine;
   private String director;
   private double collection;
   private double rating;
   @Id
public int getMid() {
	return mid;
}
public void setMid(int mid) {
	this.mid = mid;
}
public String getMname() {
	return mname;
}
public void setMname(String mname) {
	this.mname = mname;
}
public String getHero() {
	return hero;
}
public void setHero(String hero) {
	this.hero = hero;
}
public String getHeroine() {
	return heroine;
}
public void setHeroine(String heroine) {
	this.heroine = heroine;
}
public String getDirector() {
	return director;
}
public void setDirector(String director) {
	this.director = director;
}
public double getCollection() {
	return collection;
}
public void setCollection(double collection) {
	this.collection = collection;
}
public double getRating() {
	return rating;
}
public void setRating(double rating) {
	this.rating = rating;
}
@Override
public String toString() {
	return "Movie [mid=" + mid + ", mname=" + mname + ", hero=" + hero + ", heroine=" + heroine + ", director="
			+ director + ", collection=" + collection + ", rating=" + rating + "]";
}
    
   
   
   
}
