package com.example.platerecognize.DataBase;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by 瑜哥 on 2017/3/24.
 * 数据库实体类
 */

@Entity
public class UserBean {
     
    private String name;
    private String plateColor;
    private String carNum;
    private  String priceRate;
    private long startTime,endTime;
    private boolean isVIP;
public boolean getIsVIP() {
     return this.isVIP;
}
public void setIsVIP(boolean isVIP) {
     this.isVIP = isVIP;
}
public long getEndTime() {
     return this.endTime;
}
public void setEndTime(long endTime) {
     this.endTime = endTime;
}
public long getStartTime() {
     return this.startTime;
}
public void setStartTime(long startTime) {
     this.startTime = startTime;
}
public String getPriceRate() {
     return this.priceRate;
}
public void setPriceRate(String priceRate) {
     this.priceRate = priceRate;
}
public String getCarNum() {
     return this.carNum;
}
public void setCarNum(String carNum) {
     this.carNum = carNum;
}
public String getPlateColor() {
     return this.plateColor;
}
public void setPlateColor(String plateColor) {
     this.plateColor = plateColor;
}
public String getName() {
     return this.name;
}
public void setName(String name) {
     this.name = name;
}
@Generated(hash = 1772732468)
public UserBean(String name, String plateColor, String carNum,
          String priceRate, long startTime, long endTime, boolean isVIP) {
     this.name = name;
     this.plateColor = plateColor;
     this.carNum = carNum;
     this.priceRate = priceRate;
     this.startTime = startTime;
     this.endTime = endTime;
     this.isVIP = isVIP;
}
@Generated(hash = 1203313951)
public UserBean() {
}


}
