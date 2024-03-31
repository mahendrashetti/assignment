package com.assignment.day5.q5;

public class PhoneNumber {
    //PhoneNumber Class contains areaCode and number

    private int areaCode;
    private long number;

    public PhoneNumber(int areaCode, long number) {
        this.areaCode = areaCode;
        this.number = number;
    }

    public int getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "areaCode=" + areaCode +
                ", number=" + number +
                '}';
    }
}
