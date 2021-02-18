package com.changru.string;

public class StringFormat {
    public static void main(String[] args) {
        String alarmContent="车位编号: %s的设备故障/离线, 请立即前去查看！";
        String str = String.format(alarmContent, "N1-001");
        System.out.println(str);
    }
}
