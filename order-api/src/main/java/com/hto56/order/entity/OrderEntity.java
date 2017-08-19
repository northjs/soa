package com.hto56.order.entity;

import java.util.Date;

public class OrderEntity extends BaseEntity {
	private String orderSn;
	private String storeId;
	private String storeName;
	private String buyerId;
	private String buyerName;
	private String buyerEmail;
	private Date createTime;
	private int orderType;
	private String paymentId;
	private String paymentName;
	private String paymentCode;
	private String paymentBranch;
	private String paymentDirect;
	private String paymentState;
	private String outSn;
	private String tradeSn;
	private Date paymentTime;
	private String payMessage;
	private Date shippingTime;
	private String shippingExpressId;
	private String shippingCode;
	private String outPaymentCode;
	private Date finnshedTime;
	private String invoice;
	private Double goodsAmount;
	private Double discount;
	private Double orderAmount;
	private Double orderTotalPrice;
	private Double shippingFee;
	private Double shippingName;
	private String evaluationStatus;
	private Date evaluationTime;
	private String evalsellerStatus;
	private Date evalsellerTime;
	private String orderMessage;
	private int orderState;
	private String orderPointscount;
	private String voucherOd;
	private Double voucherPrice;
	private int voucherCode;
	private int refundState;
	private int returnState;
	private Double refundAmount;
	private int returnNum;
	private String groupId;
	private int groupCount;
	private String xianshiId;
	private String xianshiExplain;
	private String mansongId;
	private String mansongExplain;
	private String bundlingId;
	private String bundlingExplain;
	private String orderFrom;
	private String deliverExplain;
	private String daddressId;
	private String addressId;
	private String payId;
	private String paySn;
	private String balanceState;
	private Date balanceTime;
	private String shippingExpressCode;
	private String predepositAmount;
	private String cancelCause;
	private String couponId;
	private Double couponPrice;
	private Double promoPrice;
	private String lockState;
	public String getOrderSn() {
		return orderSn;
	}
	public void setOrderSn(String orderSn) {
		this.orderSn = orderSn;
	}
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	public String getBuyerName() {
		return buyerName;
	}
	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}
	public String getBuyerEmail() {
		return buyerEmail;
	}
	public void setBuyerEmail(String buyerEmail) {
		this.buyerEmail = buyerEmail;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public int getOrderType() {
		return orderType;
	}
	public void setOrderType(int orderType) {
		this.orderType = orderType;
	}
	public String getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	public String getPaymentName() {
		return paymentName;
	}
	public void setPaymentName(String paymentName) {
		this.paymentName = paymentName;
	}
	public String getPaymentCode() {
		return paymentCode;
	}
	public void setPaymentCode(String paymentCode) {
		this.paymentCode = paymentCode;
	}
	public String getPaymentBranch() {
		return paymentBranch;
	}
	public void setPaymentBranch(String paymentBranch) {
		this.paymentBranch = paymentBranch;
	}
	public String getPaymentDirect() {
		return paymentDirect;
	}
	public void setPaymentDirect(String paymentDirect) {
		this.paymentDirect = paymentDirect;
	}
	public String getPaymentState() {
		return paymentState;
	}
	public void setPaymentState(String paymentState) {
		this.paymentState = paymentState;
	}
	public String getOutSn() {
		return outSn;
	}
	public void setOutSn(String outSn) {
		this.outSn = outSn;
	}
	public String getTradeSn() {
		return tradeSn;
	}
	public void setTradeSn(String tradeSn) {
		this.tradeSn = tradeSn;
	}
	public Date getPaymentTime() {
		return paymentTime;
	}
	public void setPaymentTime(Date paymentTime) {
		this.paymentTime = paymentTime;
	}
	public String getPayMessage() {
		return payMessage;
	}
	public void setPayMessage(String payMessage) {
		this.payMessage = payMessage;
	}
	public Date getShippingTime() {
		return shippingTime;
	}
	public void setShippingTime(Date shippingTime) {
		this.shippingTime = shippingTime;
	}
	public String getShippingExpressId() {
		return shippingExpressId;
	}
	public void setShippingExpressId(String shippingExpressId) {
		this.shippingExpressId = shippingExpressId;
	}
	public String getShippingCode() {
		return shippingCode;
	}
	public void setShippingCode(String shippingCode) {
		this.shippingCode = shippingCode;
	}
	public String getOutPaymentCode() {
		return outPaymentCode;
	}
	public void setOutPaymentCode(String outPaymentCode) {
		this.outPaymentCode = outPaymentCode;
	}
	public Date getFinnshedTime() {
		return finnshedTime;
	}
	public void setFinnshedTime(Date finnshedTime) {
		this.finnshedTime = finnshedTime;
	}
	public String getInvoice() {
		return invoice;
	}
	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}
	public Double getGoodsAmount() {
		return goodsAmount;
	}
	public void setGoodsAmount(Double goodsAmount) {
		this.goodsAmount = goodsAmount;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	public Double getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(Double orderAmount) {
		this.orderAmount = orderAmount;
	}
	public Double getOrderTotalPrice() {
		return orderTotalPrice;
	}
	public void setOrderTotalPrice(Double orderTotalPrice) {
		this.orderTotalPrice = orderTotalPrice;
	}
	public Double getShippingFee() {
		return shippingFee;
	}
	public void setShippingFee(Double shippingFee) {
		this.shippingFee = shippingFee;
	}
	public Double getShippingName() {
		return shippingName;
	}
	public void setShippingName(Double shippingName) {
		this.shippingName = shippingName;
	}
	public String getEvaluationStatus() {
		return evaluationStatus;
	}
	public void setEvaluationStatus(String evaluationStatus) {
		this.evaluationStatus = evaluationStatus;
	}
	public Date getEvaluationTime() {
		return evaluationTime;
	}
	public void setEvaluationTime(Date evaluationTime) {
		this.evaluationTime = evaluationTime;
	}
	public String getEvalsellerStatus() {
		return evalsellerStatus;
	}
	public void setEvalsellerStatus(String evalsellerStatus) {
		this.evalsellerStatus = evalsellerStatus;
	}
	public Date getEvalsellerTime() {
		return evalsellerTime;
	}
	public void setEvalsellerTime(Date evalsellerTime) {
		this.evalsellerTime = evalsellerTime;
	}
	public String getOrderMessage() {
		return orderMessage;
	}
	public void setOrderMessage(String orderMessage) {
		this.orderMessage = orderMessage;
	}
	public int getOrderState() {
		return orderState;
	}
	public void setOrderState(int orderState) {
		this.orderState = orderState;
	}
	public String getOrderPointscount() {
		return orderPointscount;
	}
	public void setOrderPointscount(String orderPointscount) {
		this.orderPointscount = orderPointscount;
	}
	public String getVoucherOd() {
		return voucherOd;
	}
	public void setVoucherOd(String voucherOd) {
		this.voucherOd = voucherOd;
	}
	public Double getVoucherPrice() {
		return voucherPrice;
	}
	public void setVoucherPrice(Double voucherPrice) {
		this.voucherPrice = voucherPrice;
	}
	public int getVoucherCode() {
		return voucherCode;
	}
	public void setVoucherCode(int voucherCode) {
		this.voucherCode = voucherCode;
	}
	public int getRefundState() {
		return refundState;
	}
	public void setRefundState(int refundState) {
		this.refundState = refundState;
	}
	public int getReturnState() {
		return returnState;
	}
	public void setReturnState(int returnState) {
		this.returnState = returnState;
	}
	public Double getRefundAmount() {
		return refundAmount;
	}
	public void setRefundAmount(Double refundAmount) {
		this.refundAmount = refundAmount;
	}
	public int getReturnNum() {
		return returnNum;
	}
	public void setReturnNum(int returnNum) {
		this.returnNum = returnNum;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public int getGroupCount() {
		return groupCount;
	}
	public void setGroupCount(int groupCount) {
		this.groupCount = groupCount;
	}
	public String getXianshiId() {
		return xianshiId;
	}
	public void setXianshiId(String xianshiId) {
		this.xianshiId = xianshiId;
	}
	public String getXianshiExplain() {
		return xianshiExplain;
	}
	public void setXianshiExplain(String xianshiExplain) {
		this.xianshiExplain = xianshiExplain;
	}
	public String getMansongId() {
		return mansongId;
	}
	public void setMansongId(String mansongId) {
		this.mansongId = mansongId;
	}
	public String getMansongExplain() {
		return mansongExplain;
	}
	public void setMansongExplain(String mansongExplain) {
		this.mansongExplain = mansongExplain;
	}
	public String getBundlingId() {
		return bundlingId;
	}
	public void setBundlingId(String bundlingId) {
		this.bundlingId = bundlingId;
	}
	public String getBundlingExplain() {
		return bundlingExplain;
	}
	public void setBundlingExplain(String bundlingExplain) {
		this.bundlingExplain = bundlingExplain;
	}
	public String getOrderFrom() {
		return orderFrom;
	}
	public void setOrderFrom(String orderFrom) {
		this.orderFrom = orderFrom;
	}
	public String getDeliverExplain() {
		return deliverExplain;
	}
	public void setDeliverExplain(String deliverExplain) {
		this.deliverExplain = deliverExplain;
	}
	public String getDaddressId() {
		return daddressId;
	}
	public void setDaddressId(String daddressId) {
		this.daddressId = daddressId;
	}
	public String getAddressId() {
		return addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	public String getPayId() {
		return payId;
	}
	public void setPayId(String payId) {
		this.payId = payId;
	}
	public String getPaySn() {
		return paySn;
	}
	public void setPaySn(String paySn) {
		this.paySn = paySn;
	}
	public String getBalanceState() {
		return balanceState;
	}
	public void setBalanceState(String balanceState) {
		this.balanceState = balanceState;
	}
	public Date getBalanceTime() {
		return balanceTime;
	}
	public void setBalanceTime(Date balanceTime) {
		this.balanceTime = balanceTime;
	}
	public String getShippingExpressCode() {
		return shippingExpressCode;
	}
	public void setShippingExpressCode(String shippingExpressCode) {
		this.shippingExpressCode = shippingExpressCode;
	}
	public String getPredepositAmount() {
		return predepositAmount;
	}
	public void setPredepositAmount(String predepositAmount) {
		this.predepositAmount = predepositAmount;
	}
	public String getCancelCause() {
		return cancelCause;
	}
	public void setCancelCause(String cancelCause) {
		this.cancelCause = cancelCause;
	}
	public String getCouponId() {
		return couponId;
	}
	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}
	public Double getCouponPrice() {
		return couponPrice;
	}
	public void setCouponPrice(Double couponPrice) {
		this.couponPrice = couponPrice;
	}
	public Double getPromoPrice() {
		return promoPrice;
	}
	public void setPromoPrice(Double promoPrice) {
		this.promoPrice = promoPrice;
	}
	public String getLockState() {
		return lockState;
	}
	public void setLockState(String lockState) {
		this.lockState = lockState;
	}
}
