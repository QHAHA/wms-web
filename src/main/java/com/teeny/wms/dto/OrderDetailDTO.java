package com.teeny.wms.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Created by lilei on 2017/7/29.
 */
public class OrderDetailDTO implements Serializable{
    private int orderId; //订单ID
    private int status; //订单状态
    private int buyerId; //验收人ID
    private String buyer; //验收人名
    private List<GoodsDTO> acceptanceOrderList; //已验收
    private List<GoodsDTO> onOrderList; //待验收

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(int buyerId) {
        this.buyerId = buyerId;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public List<GoodsDTO> getAcceptanceOrderList() {
        return acceptanceOrderList;
    }

    public void setAcceptanceOrderList(List<GoodsDTO> acceptanceOrderList) {
        this.acceptanceOrderList = acceptanceOrderList;
    }

    public List<GoodsDTO> getOnOrderList() {
        return onOrderList;
    }

    public void setOnOrderList(List<GoodsDTO> onOrderList) {
        this.onOrderList = onOrderList;
    }
}
