package org.mike.model;

public class ElementPost {
	private String partnerCode;
	private String orderId;
	private String returnUrl;
	private String payGate;
	private long amount;
	private String orderInfo;
	private String ipAddress;
	private String createDate;
	private String checksum;
	public ElementPost(String partnerCode, String orderId, String returnUrl, String payGate, long amount,
			String orderInfo, String ipAddress, String createDate, String checksum) {
		super();
		this.partnerCode = partnerCode;
		this.orderId = orderId;
		this.returnUrl = returnUrl;
		this.payGate = payGate;
		this.amount = amount;
		this.orderInfo = orderInfo;
		this.ipAddress = ipAddress;
		this.createDate = createDate;
		this.checksum = checksum;
	}
	public ElementPost() {
		
	}
	public String getPartnerCode() {
		return partnerCode;
	}
	public void setPartnerCode(String partnerCode) {
		this.partnerCode = partnerCode;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getReturnUrl() {
		return returnUrl;
	}
	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}
	public String getPayGate() {
		return payGate;
	}
	public void setPayGate(String payGate) {
		this.payGate = payGate;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public String getOrderInfo() {
		return orderInfo;
	}
	public void setOrderInfo(String orderInfo) {
		this.orderInfo = orderInfo;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getChecksum() {
		return checksum;
	}
	public void setChecksum(String checksum) {
		this.checksum = checksum;
	}
	
	
	

}
