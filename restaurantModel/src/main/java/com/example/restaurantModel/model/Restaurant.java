package com.example.restaurantModel.model;

public class Restaurant {
    private String restaurantName;
    private String restaurantAdd;
    private String speciality;
    private long RestaurantNumber;
    private int totalStaffs;

    private int id;

    public Restaurant(String restaurantName, String restaurantAdd, String speciality, long restaurantNumber, int totalStaffs, int id) {
        this.restaurantName = restaurantName;
        this.restaurantAdd = restaurantAdd;
        this.speciality = speciality;
        RestaurantNumber = restaurantNumber;
        this.totalStaffs = totalStaffs;
        this.id = id;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantAdd() {
        return restaurantAdd;
    }

    public void setRestaurantAdd(String restaurantAdd) {
        this.restaurantAdd = restaurantAdd;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public long getRestaurantNumber() {
        return RestaurantNumber;
    }

    public void setRestaurantNumber(long restaurantNumber) {
        RestaurantNumber = restaurantNumber;
    }

    public int getTotalStaffs() {
        return totalStaffs;
    }

    public void setTotalStaffs(int totalStaffs) {
        this.totalStaffs = totalStaffs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "restaurantName='" + restaurantName + '\'' +
                ", restaurantAdd='" + restaurantAdd + '\'' +
                ", speciality='" + speciality + '\'' +
                ", RestaurantNumber=" + RestaurantNumber +
                ", totalStaffs=" + totalStaffs +
                ", id=" + id +
                '}';
    }
}
