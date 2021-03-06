package com.misonamoo.smileway.dao;

public class DeliveryDetailVO {

	private String ITEM_NO;
	private String DELIVERY_NUMBER;
	private String DEL_CONTENT_NAME;
	private String DEL_CONTENT_TYPE;
	private String DEL_CONTENT_PRICE;
	private String DEL_CONTENT_WIDTH;
	private String DEL_CONTENT_LENGTH;
	private String DEL_CONTENT_HEIGHT;
	private String DEL_CONTENT_WEIGHT;
	private String DEL_CONTENT_PICTURE;
	private String DEL_CONTENT_PICTURE_2;
	private String DEL_CONTENT_PICTURE_3;
	private String DEL_CONTENT_EXPLAIN;
	private String DEL_CONTENT_WARN;
	private String DEL_CONTENT_REG_DATE;
	private String DEL_CONTENT_STATE;
	private String DEL_CONTENT_UPDATE;
	private String CATAGORY_ID;
	private String DEL_CONTENT_PICTURE_Thum;
	
	private String CHARHER;
	private String LOCATION_CELLPHONE;
	private String LOCATION_PHONE;
	private String LOCATION_POST;
	private String LOCATION_ADDRESS;
	private String LOCATION_ADDRESS_DTL;
	private String LOCATION_TYPE;
	
	private String SUSER_NO;
	private String DELIVERY_STATE;
	private String DELIVERY_PRICE;
	private String MIN_PICKUP_TIME;
	private String MIN_ARRIVE_TIME;
	private String FINISH_TIME;
	private String MAX_PICKUP_TIME;
	private String MAX_ARRIVE_TIME;
	
	private String DEPART_CHARHER;
	private String DEPART_PHONE;
	private String DEPART_POST;
	private String DEPART_ADDRESS;
	private String DEPART_ADDRESS_DTL;
	private String DEPART_TYPE;
	private String DEPART_LATITUDE;
	private String DEPART_LONGITUDE;
	private String ARRIVAL_CHARHER;
	private String ARRIVAL_PHONE;
	private String ARRIVAL_POST;
	private String ARRIVAL_ADDRESS;
	private String ARRIVAL_ADDRESS_DTL;
	private String ARRIVAL_TYPE;
	private String ARRIVAL_LATITUDE;
	private String ARRIVAL_LONGITUDE;
	
	private String CHARHER_ARRIVAL;
	private String LOCATION_CELLPHONE_ARRIVAL;
	private String LOCATION_PHONE_ARRIVAL;
	private String LOCATION_POST_ARRIVAL;
	private String LOCATION_ADDRESS_ARRIVAL;
	private String LOCATION_ADDRESS_DTL_ARRIVAL;
	private String LOCATION_TYPE_ARRIVAL;	
	private String DEL_METHOD_CODE;	
	private String CATAGORY_NAME;
	
	private String ruserPhoto;
	private String ruserId;
	private String ruserName;
	private String reviewTotalStar;
	private String reviewCount;
	private double ruserStar;
	private String ruserDeliveryCnt; //배송건수
	private String ruserPoint;
	private String ruserGrade;
	
	//VO 추가(한상희), 로더지원목록 팝업
	private String deliveryNumber, //배송 번호
				   pickupTime,
				   message;

	public String getITEM_NO() {
		return ITEM_NO;
	}

	public void setITEM_NO(String iTEM_NO) {
		ITEM_NO = iTEM_NO;
	}

	public String getDELIVERY_NUMBER() {
		return DELIVERY_NUMBER;
	}

	public void setDELIVERY_NUMBER(String dELIVERY_NUMBER) {
		DELIVERY_NUMBER = dELIVERY_NUMBER;
	}

	public String getDEL_CONTENT_NAME() {
		return DEL_CONTENT_NAME;
	}

	public void setDEL_CONTENT_NAME(String dEL_CONTENT_NAME) {
		DEL_CONTENT_NAME = dEL_CONTENT_NAME;
	}

	public String getDEL_CONTENT_TYPE() {
		return DEL_CONTENT_TYPE;
	}

	public void setDEL_CONTENT_TYPE(String dEL_CONTENT_TYPE) {
		DEL_CONTENT_TYPE = dEL_CONTENT_TYPE;
	}

	public String getDEL_CONTENT_PRICE() {
		return DEL_CONTENT_PRICE;
	}

	public void setDEL_CONTENT_PRICE(String dEL_CONTENT_PRICE) {
		DEL_CONTENT_PRICE = dEL_CONTENT_PRICE;
	}

	public String getDEL_CONTENT_WIDTH() {
		return DEL_CONTENT_WIDTH;
	}

	public void setDEL_CONTENT_WIDTH(String dEL_CONTENT_WIDTH) {
		DEL_CONTENT_WIDTH = dEL_CONTENT_WIDTH;
	}

	public String getDEL_CONTENT_LENGTH() {
		return DEL_CONTENT_LENGTH;
	}

	public void setDEL_CONTENT_LENGTH(String dEL_CONTENT_LENGTH) {
		DEL_CONTENT_LENGTH = dEL_CONTENT_LENGTH;
	}

	public String getDEL_CONTENT_HEIGHT() {
		return DEL_CONTENT_HEIGHT;
	}

	public void setDEL_CONTENT_HEIGHT(String dEL_CONTENT_HEIGHT) {
		DEL_CONTENT_HEIGHT = dEL_CONTENT_HEIGHT;
	}

	public String getDEL_CONTENT_WEIGHT() {
		return DEL_CONTENT_WEIGHT;
	}

	public void setDEL_CONTENT_WEIGHT(String dEL_CONTENT_WEIGHT) {
		DEL_CONTENT_WEIGHT = dEL_CONTENT_WEIGHT;
	}

	public String getDEL_CONTENT_PICTURE() {
		return DEL_CONTENT_PICTURE;
	}

	public void setDEL_CONTENT_PICTURE(String dEL_CONTENT_PICTURE) {
		DEL_CONTENT_PICTURE = dEL_CONTENT_PICTURE;
	}

	public String getDEL_CONTENT_PICTURE_2() {
		return DEL_CONTENT_PICTURE_2;
	}

	public void setDEL_CONTENT_PICTURE_2(String dEL_CONTENT_PICTURE_2) {
		DEL_CONTENT_PICTURE_2 = dEL_CONTENT_PICTURE_2;
	}

	public String getDEL_CONTENT_PICTURE_3() {
		return DEL_CONTENT_PICTURE_3;
	}

	public void setDEL_CONTENT_PICTURE_3(String dEL_CONTENT_PICTURE_3) {
		DEL_CONTENT_PICTURE_3 = dEL_CONTENT_PICTURE_3;
	}

	public String getDEL_CONTENT_EXPLAIN() {
		return DEL_CONTENT_EXPLAIN;
	}

	public void setDEL_CONTENT_EXPLAIN(String dEL_CONTENT_EXPLAIN) {
		DEL_CONTENT_EXPLAIN = dEL_CONTENT_EXPLAIN;
	}

	public String getDEL_CONTENT_WARN() {
		return DEL_CONTENT_WARN;
	}

	public void setDEL_CONTENT_WARN(String dEL_CONTENT_WARN) {
		DEL_CONTENT_WARN = dEL_CONTENT_WARN;
	}

	public String getDEL_CONTENT_REG_DATE() {
		return DEL_CONTENT_REG_DATE;
	}

	public void setDEL_CONTENT_REG_DATE(String dEL_CONTENT_REG_DATE) {
		DEL_CONTENT_REG_DATE = dEL_CONTENT_REG_DATE;
	}

	public String getDEL_CONTENT_STATE() {
		return DEL_CONTENT_STATE;
	}

	public void setDEL_CONTENT_STATE(String dEL_CONTENT_STATE) {
		DEL_CONTENT_STATE = dEL_CONTENT_STATE;
	}

	public String getDEL_CONTENT_UPDATE() {
		return DEL_CONTENT_UPDATE;
	}

	public void setDEL_CONTENT_UPDATE(String dEL_CONTENT_UPDATE) {
		DEL_CONTENT_UPDATE = dEL_CONTENT_UPDATE;
	}

	public String getCATAGORY_ID() {
		return CATAGORY_ID;
	}

	public void setCATAGORY_ID(String cATAGORY_ID) {
		CATAGORY_ID = cATAGORY_ID;
	}

	public String getDEL_CONTENT_PICTURE_Thum() {
		return DEL_CONTENT_PICTURE_Thum;
	}

	public void setDEL_CONTENT_PICTURE_Thum(String dEL_CONTENT_PICTURE_Thum) {
		DEL_CONTENT_PICTURE_Thum = dEL_CONTENT_PICTURE_Thum;
	}

	public String getCHARHER() {
		return CHARHER;
	}

	public void setCHARHER(String cHARHER) {
		CHARHER = cHARHER;
	}

	public String getLOCATION_CELLPHONE() {
		return LOCATION_CELLPHONE;
	}

	public void setLOCATION_CELLPHONE(String lOCATION_CELLPHONE) {
		LOCATION_CELLPHONE = lOCATION_CELLPHONE;
	}

	public String getLOCATION_PHONE() {
		return LOCATION_PHONE;
	}

	public void setLOCATION_PHONE(String lOCATION_PHONE) {
		LOCATION_PHONE = lOCATION_PHONE;
	}

	public String getLOCATION_POST() {
		return LOCATION_POST;
	}

	public void setLOCATION_POST(String lOCATION_POST) {
		LOCATION_POST = lOCATION_POST;
	}

	public String getLOCATION_ADDRESS() {
		return LOCATION_ADDRESS;
	}

	public void setLOCATION_ADDRESS(String lOCATION_ADDRESS) {
		LOCATION_ADDRESS = lOCATION_ADDRESS;
	}

	public String getLOCATION_ADDRESS_DTL() {
		return LOCATION_ADDRESS_DTL;
	}

	public void setLOCATION_ADDRESS_DTL(String lOCATION_ADDRESS_DTL) {
		LOCATION_ADDRESS_DTL = lOCATION_ADDRESS_DTL;
	}

	public String getLOCATION_TYPE() {
		return LOCATION_TYPE;
	}

	public void setLOCATION_TYPE(String lOCATION_TYPE) {
		LOCATION_TYPE = lOCATION_TYPE;
	}

	public String getSUSER_NO() {
		return SUSER_NO;
	}

	public void setSUSER_NO(String sUSER_NO) {
		SUSER_NO = sUSER_NO;
	}

	public String getDELIVERY_STATE() {
		return DELIVERY_STATE;
	}

	public void setDELIVERY_STATE(String dELIVERY_STATE) {
		DELIVERY_STATE = dELIVERY_STATE;
	}

	public String getDELIVERY_PRICE() {
		return DELIVERY_PRICE;
	}

	public void setDELIVERY_PRICE(String dELIVERY_PRICE) {
		DELIVERY_PRICE = dELIVERY_PRICE;
	}

	public String getMIN_PICKUP_TIME() {
		return MIN_PICKUP_TIME;
	}

	public void setMIN_PICKUP_TIME(String mIN_PICKUP_TIME) {
		MIN_PICKUP_TIME = mIN_PICKUP_TIME;
	}

	public String getMIN_ARRIVE_TIME() {
		return MIN_ARRIVE_TIME;
	}

	public void setMIN_ARRIVE_TIME(String mIN_ARRIVE_TIME) {
		MIN_ARRIVE_TIME = mIN_ARRIVE_TIME;
	}

	public String getFINISH_TIME() {
		return FINISH_TIME;
	}

	public void setFINISH_TIME(String fINISH_TIME) {
		FINISH_TIME = fINISH_TIME;
	}

	public String getMAX_PICKUP_TIME() {
		return MAX_PICKUP_TIME;
	}

	public void setMAX_PICKUP_TIME(String mAX_PICKUP_TIME) {
		MAX_PICKUP_TIME = mAX_PICKUP_TIME;
	}

	public String getMAX_ARRIVE_TIME() {
		return MAX_ARRIVE_TIME;
	}

	public void setMAX_ARRIVE_TIME(String mAX_ARRIVE_TIME) {
		MAX_ARRIVE_TIME = mAX_ARRIVE_TIME;
	}

	public String getDEPART_CHARHER() {
		return DEPART_CHARHER;
	}

	public void setDEPART_CHARHER(String dEPART_CHARHER) {
		DEPART_CHARHER = dEPART_CHARHER;
	}

	public String getDEPART_PHONE() {
		return DEPART_PHONE;
	}

	public void setDEPART_PHONE(String dEPART_PHONE) {
		DEPART_PHONE = dEPART_PHONE;
	}

	public String getDEPART_POST() {
		return DEPART_POST;
	}

	public void setDEPART_POST(String dEPART_POST) {
		DEPART_POST = dEPART_POST;
	}

	public String getDEPART_ADDRESS() {
		return DEPART_ADDRESS;
	}

	public void setDEPART_ADDRESS(String dEPART_ADDRESS) {
		DEPART_ADDRESS = dEPART_ADDRESS;
	}

	public String getDEPART_ADDRESS_DTL() {
		return DEPART_ADDRESS_DTL;
	}

	public void setDEPART_ADDRESS_DTL(String dEPART_ADDRESS_DTL) {
		DEPART_ADDRESS_DTL = dEPART_ADDRESS_DTL;
	}

	public String getDEPART_TYPE() {
		return DEPART_TYPE;
	}

	public void setDEPART_TYPE(String dEPART_TYPE) {
		DEPART_TYPE = dEPART_TYPE;
	}

	public String getDEPART_LATITUDE() {
		return DEPART_LATITUDE;
	}

	public void setDEPART_LATITUDE(String dEPART_LATITUDE) {
		DEPART_LATITUDE = dEPART_LATITUDE;
	}

	public String getDEPART_LONGITUDE() {
		return DEPART_LONGITUDE;
	}

	public void setDEPART_LONGITUDE(String dEPART_LONGITUDE) {
		DEPART_LONGITUDE = dEPART_LONGITUDE;
	}

	public String getARRIVAL_CHARHER() {
		return ARRIVAL_CHARHER;
	}

	public void setARRIVAL_CHARHER(String aRRIVAL_CHARHER) {
		ARRIVAL_CHARHER = aRRIVAL_CHARHER;
	}

	public String getARRIVAL_PHONE() {
		return ARRIVAL_PHONE;
	}

	public void setARRIVAL_PHONE(String aRRIVAL_PHONE) {
		ARRIVAL_PHONE = aRRIVAL_PHONE;
	}

	public String getARRIVAL_POST() {
		return ARRIVAL_POST;
	}

	public void setARRIVAL_POST(String aRRIVAL_POST) {
		ARRIVAL_POST = aRRIVAL_POST;
	}

	public String getARRIVAL_ADDRESS() {
		return ARRIVAL_ADDRESS;
	}

	public void setARRIVAL_ADDRESS(String aRRIVAL_ADDRESS) {
		ARRIVAL_ADDRESS = aRRIVAL_ADDRESS;
	}

	public String getARRIVAL_ADDRESS_DTL() {
		return ARRIVAL_ADDRESS_DTL;
	}

	public void setARRIVAL_ADDRESS_DTL(String aRRIVAL_ADDRESS_DTL) {
		ARRIVAL_ADDRESS_DTL = aRRIVAL_ADDRESS_DTL;
	}

	public String getARRIVAL_TYPE() {
		return ARRIVAL_TYPE;
	}

	public void setARRIVAL_TYPE(String aRRIVAL_TYPE) {
		ARRIVAL_TYPE = aRRIVAL_TYPE;
	}

	public String getARRIVAL_LATITUDE() {
		return ARRIVAL_LATITUDE;
	}

	public void setARRIVAL_LATITUDE(String aRRIVAL_LATITUDE) {
		ARRIVAL_LATITUDE = aRRIVAL_LATITUDE;
	}

	public String getARRIVAL_LONGITUDE() {
		return ARRIVAL_LONGITUDE;
	}

	public void setARRIVAL_LONGITUDE(String aRRIVAL_LONGITUDE) {
		ARRIVAL_LONGITUDE = aRRIVAL_LONGITUDE;
	}

	public String getCHARHER_ARRIVAL() {
		return CHARHER_ARRIVAL;
	}

	public void setCHARHER_ARRIVAL(String cHARHER_ARRIVAL) {
		CHARHER_ARRIVAL = cHARHER_ARRIVAL;
	}

	public String getLOCATION_CELLPHONE_ARRIVAL() {
		return LOCATION_CELLPHONE_ARRIVAL;
	}

	public void setLOCATION_CELLPHONE_ARRIVAL(String lOCATION_CELLPHONE_ARRIVAL) {
		LOCATION_CELLPHONE_ARRIVAL = lOCATION_CELLPHONE_ARRIVAL;
	}

	public String getLOCATION_PHONE_ARRIVAL() {
		return LOCATION_PHONE_ARRIVAL;
	}

	public void setLOCATION_PHONE_ARRIVAL(String lOCATION_PHONE_ARRIVAL) {
		LOCATION_PHONE_ARRIVAL = lOCATION_PHONE_ARRIVAL;
	}

	public String getLOCATION_POST_ARRIVAL() {
		return LOCATION_POST_ARRIVAL;
	}

	public void setLOCATION_POST_ARRIVAL(String lOCATION_POST_ARRIVAL) {
		LOCATION_POST_ARRIVAL = lOCATION_POST_ARRIVAL;
	}

	public String getLOCATION_ADDRESS_ARRIVAL() {
		return LOCATION_ADDRESS_ARRIVAL;
	}

	public void setLOCATION_ADDRESS_ARRIVAL(String lOCATION_ADDRESS_ARRIVAL) {
		LOCATION_ADDRESS_ARRIVAL = lOCATION_ADDRESS_ARRIVAL;
	}

	public String getLOCATION_ADDRESS_DTL_ARRIVAL() {
		return LOCATION_ADDRESS_DTL_ARRIVAL;
	}

	public void setLOCATION_ADDRESS_DTL_ARRIVAL(String lOCATION_ADDRESS_DTL_ARRIVAL) {
		LOCATION_ADDRESS_DTL_ARRIVAL = lOCATION_ADDRESS_DTL_ARRIVAL;
	}

	public String getLOCATION_TYPE_ARRIVAL() {
		return LOCATION_TYPE_ARRIVAL;
	}

	public void setLOCATION_TYPE_ARRIVAL(String lOCATION_TYPE_ARRIVAL) {
		LOCATION_TYPE_ARRIVAL = lOCATION_TYPE_ARRIVAL;
	}

	public String getDEL_METHOD_CODE() {
		return DEL_METHOD_CODE;
	}

	public void setDEL_METHOD_CODE(String dEL_METHOD_CODE) {
		DEL_METHOD_CODE = dEL_METHOD_CODE;
	}

	public String getCATAGORY_NAME() {
		return CATAGORY_NAME;
	}

	public void setCATAGORY_NAME(String cATAGORY_NAME) {
		CATAGORY_NAME = cATAGORY_NAME;
	}

	public String getRuserPhoto() {
		return ruserPhoto;
	}

	public void setRuserPhoto(String ruserPhoto) {
		this.ruserPhoto = ruserPhoto;
	}

	public String getRuserId() {
		return ruserId;
	}

	public void setRuserId(String ruserId) {
		this.ruserId = ruserId;
	}

	public String getRuserName() {
		return ruserName;
	}

	public void setRuserName(String ruserName) {
		this.ruserName = ruserName;
	}

	public String getReviewTotalStar() {
		return reviewTotalStar;
	}

	public void setReviewTotalStar(String reviewTotalStar) {
		this.reviewTotalStar = reviewTotalStar;
	}

	public String getReviewCount() {
		return reviewCount;
	}

	public void setReviewCount(String reviewCount) {
		this.reviewCount = reviewCount;
	}

	public double getRuserStar() {
		return ruserStar;
	}

	public void setRuserStar(double ruserStar) {
		this.ruserStar = ruserStar;
	}

	public String getRuserDeliveryCnt() {
		return ruserDeliveryCnt;
	}

	public void setRuserDeliveryCnt(String ruserDeliveryCnt) {
		this.ruserDeliveryCnt = ruserDeliveryCnt;
	}

	public String getRuserPoint() {
		return ruserPoint;
	}

	public void setRuserPoint(String ruserPoint) {
		this.ruserPoint = ruserPoint;
	}

	public String getRuserGrade() {
		return ruserGrade;
	}

	public void setRuserGrade(String ruserGrade) {
		this.ruserGrade = ruserGrade;
	}

	public String getDeliveryNumber() {
		return deliveryNumber;
	}

	public void setDeliveryNumber(String deliveryNumber) {
		this.deliveryNumber = deliveryNumber;
	}

	public String getPickupTime() {
		return pickupTime;
	}

	public void setPickupTime(String pickupTime) {
		this.pickupTime = pickupTime;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	
}
