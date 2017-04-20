package com.jj.howselect2;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by Administrator on 2017/4/19 0019.
 */
@Entity
public class City {
    private int id;
    private String name;
    private int id_province;
    @Generated(hash = 824804495)
    public City(int id, String name, int id_province) {
        this.id = id;
        this.name = name;
        this.id_province = id_province;
    }
    @Generated(hash = 750791287)
    public City() {
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
    public int getId_province() {
        return this.id_province;
    }
    public void setId_province(int id_province) {
        this.id_province = id_province;
    }
}
