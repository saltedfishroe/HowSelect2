package com.jj.howselect2;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by Administrator on 2017/4/19 0019.
 */
@Entity
public class Province {
    private int id;
    private String name;
    @Generated(hash = 1398667546)
    public Province(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Generated(hash = 1309009906)
    public Province() {
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
}
