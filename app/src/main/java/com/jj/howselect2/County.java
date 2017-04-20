package com.jj.howselect2;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by Administrator on 2017/4/19 0019.
 */
@Entity
public class County {
    private int id;
    private String name;
    private int id_city;
    private String id_weather;
    @Generated(hash = 1022530824)
    public County(int id, String name, int id_city, String id_weather) {
        this.id = id;
        this.name = name;
        this.id_city = id_city;
        this.id_weather = id_weather;
    }
    @Generated(hash = 1991272252)
    public County() {
    }
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId_city() {
        return this.id_city;
    }
    public void setId_city(int id_city) {
        this.id_city = id_city;
    }
    public String getId_weather() {
        return this.id_weather;
    }
    public void setId_weather(String id_weather) {
        this.id_weather = id_weather;
    }
}
