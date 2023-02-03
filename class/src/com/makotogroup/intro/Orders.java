package com.makotogroup.intro;

public class Orders {
private int id;
private String name;
private String courier;
private String dateTime;
private int gender;
public Orders(int id, String name, String courier, String dateTime, int gender)
{
        this.id = id;
        this.name = name;
        this.courier = courier;
        this.dateTime = dateTime;
        this.gender = gender;
        }
public int getID() {
                return id;
        }
public void setID(int id) {
                this.id = id;
        }

public String getName() {
        return name;
        }
public void setName(String name) {
        this.name = name;
        }

public String getCourier() {
                return courier;
        }
public void setCourier(String courier) {
                this.courier = courier;
        }

public String getDateTime() {
        return dateTime;
        }
public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
        }

public int getGender() {
        return gender;
        }
public void setGender(int gender) {
        this.gender = gender;
        }
public String toString()
        {
        return "Идентификатор:" + id + ". Название товара:" + name + ". Имя курьера:"
                + courier + "Дата:" + dateTime+ "" ;
        }
        }

