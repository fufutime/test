package com.fuzhao.ssm.bean;

import org.springframework.format.annotation.DateTimeFormat;

import java.lang.reflect.Type;
import java.util.Date;
import java.util.List;

public class RoomInfo {
    private Integer roomId ;
    private String roomName;
    private Integer roomPrice;
    private String roomDes;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date addTime;
    private Integer joinDay;
    private Integer totalPrice;
    private Integer buyState;
    private Integer roomTypeId;
    private String typeName;

    @Override
    public String toString() {
        return "RoomInfo{" +
                "roomId=" + roomId +
                ", roomName='" + roomName + '\'' +
                ", roomPrice=" + roomPrice +
                ", roomDes='" + roomDes + '\'' +
                ", addTime=" + addTime +
                ", joinDay=" + joinDay +
                ", totalPrice=" + totalPrice +
                ", buyState=" + buyState +
                ", roomTypeId=" + roomTypeId +
                ", typeName='" + typeName + '\'' +
                '}';
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public Integer getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(Integer roomPrice) {
        this.roomPrice = roomPrice;
    }

    public String getRoomDes() {
        return roomDes;
    }

    public void setRoomDes(String roomDes) {
        this.roomDes = roomDes;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Integer getJoinDay() {
        return joinDay;
    }

    public void setJoinDay(Integer joinDay) {
        this.joinDay = joinDay;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getBuyState() {
        return buyState;
    }

    public void setBuyState(Integer buyState) {
        this.buyState = buyState;
    }

    public Integer getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(Integer roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
