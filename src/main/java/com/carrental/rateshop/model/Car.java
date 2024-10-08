package com.carrental.rateshop.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Car {
	@Id
	@Column(nullable = false)
	private String carNo;
	@Column(nullable = false)
	private int carYear;
	@Column(nullable = false)
	private String carMake;
	private String carModel;
	@Column(nullable = false)
	private String carTrim;
	@Column(nullable = false)
	private String carBody;
	@Column(nullable = false)
	private	String carTransmission;
	@Column(nullable = false)
	private int carCondition;
	@Column(nullable = false)
	private float carOdometer;
	private Integer carGasReading;
	@Column(unique= true)
	private String carFleetNo;
	@Column(nullable = false)
	private String carStatus;
	private float carSelllingPrice;
	private float carHourlyRentalPrice;
	private float carDailyRentalPrice;
	private float carWeeklyRentalPrice;
	private float carMonthlyRentalPrice;
	public String getCarNo() {
		return carNo;
	}
	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}
	public int getCarYear() {
		return carYear;
	}
	public void setCarYear(int carYear) {
		this.carYear = carYear;
	}
	public String getCarMake() {
		return carMake;
	}
	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String getCarTrim() {
		return carTrim;
	}
	public void setCarTrim(String carTrim) {
		this.carTrim = carTrim;
	}
	public String getCarBody() {
		return carBody;
	}
	public void setCarBody(String carBody) {
		this.carBody = carBody;
	}
	public String getCarTransmission() {
		return carTransmission;
	}
	public void setCarTransmission(String carTransmission) {
		this.carTransmission = carTransmission;
	}
	public int getCarCondition() {
		return carCondition;
	}
	public void setCarCondition(int carCondition) {
		this.carCondition = carCondition;
	}
	public float getCarOdometer() {
		return carOdometer;
	}
	public void setCarOdometer(float carOdometer) {
		this.carOdometer = carOdometer;
	}
	public String getCarFleetNo() {
		return carFleetNo;
	}
	public void setCarFleetNo(String carFleetNo) {
		this.carFleetNo = carFleetNo;
	}
	public float getCarSelllingPrice() {
		return carSelllingPrice;
	}
	public void setCarSelllingPrice(float carSelllingPrice) {
		this.carSelllingPrice = carSelllingPrice;
	}
	public float getCarHourlyRentalPrice() {
		return carHourlyRentalPrice;
	}
	public void setCarHourlyRentalPrice(float carHourlyRentalPrice) {
		this.carHourlyRentalPrice = carHourlyRentalPrice;
	}
	public float getCarDailyRentalPrice() {
		return carDailyRentalPrice;
	}
	public void setCarDailyRentalPrice(float carDailyRentalPrice) {
		this.carDailyRentalPrice = carDailyRentalPrice;
	}
	public float getCarWeeklyRentalPrice() {
		return carWeeklyRentalPrice;
	}
	public void setCarWeeklyRentalPrice(float carWeeklyRentalPrice) {
		this.carWeeklyRentalPrice = carWeeklyRentalPrice;
	}
	public float getCarMonthlyRentalPrice() {
		return carMonthlyRentalPrice;
	}
	public void setCarMonthlyRentalPrice(float carMonthlyRentalPrice) {
		this.carMonthlyRentalPrice = carMonthlyRentalPrice;
	}
	public Integer getCarGasReading() {
		return carGasReading;
	}
	public void setCarGasReading(Integer carGasReading) {
		this.carGasReading = carGasReading;
	}
	public String getCarStatus() {
		return carStatus;
	}
	public void setCarStatus(String carStatus) {
		this.carStatus = carStatus;
	}
	@Override
	public String toString() {
		return "Car [carNo=" + carNo + ", carYear=" + carYear + ", carMake=" + carMake + ", carModel=" + carModel
				+ ", carTrim=" + carTrim + ", carBody=" + carBody + ", carTransmission=" + carTransmission
				+ ", carCondition=" + carCondition + ", carOdometer=" + carOdometer + ", carGasReading=" + carGasReading
				+ ", carFleetNo=" + carFleetNo + ", carStatus=" + carStatus + ", carSelllingPrice=" + carSelllingPrice
				+ ", carHourlyRentalPrice=" + carHourlyRentalPrice + ", carDailyRentalPrice=" + carDailyRentalPrice
				+ ", carWeeklyRentalPrice=" + carWeeklyRentalPrice + ", carMonthlyRentalPrice=" + carMonthlyRentalPrice
				+ "]";
	}

	
	
	
}