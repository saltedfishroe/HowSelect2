package com.jj.howselect2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.jj.greendao.CityDao;
import com.jj.greendao.CountyDao;
import com.jj.greendao.DaoMaster;
import com.jj.greendao.DaoSession;
import com.jj.greendao.ProvinceDao;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Administrator on 2017/4/19 0019.
 */

public class GreenDaoUtils {

    public static DaoSession getDaoSession (Context context){
        MyOpenHelper openHelper = new MyOpenHelper( context,"china.db");
        SQLiteDatabase database = openHelper.getWritableDatabase();
        DaoMaster daoMaster = new DaoMaster(database);
        DaoSession daoSession = daoMaster.newSession();
        return daoSession;
    }
    public static void setProvinceData(String responce,DaoSession daoSession)  {
        JSONArray jsonArray = new JSONArray();
        ProvinceDao provinceDao = daoSession.getProvinceDao();
        for (int x=0;x<jsonArray.length();x++){
            try {
                JSONObject  jsonObject = jsonArray.getJSONObject(x);
                String name = jsonObject.getString("name");
                int id = jsonObject.getInt("id");
                Province province = new Province();
                province.setName(name);
                province.setId(id);
                provinceDao.insert(province);
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }
    }

    public static void setCityData(String responce,int id_province,DaoSession daoSession) {
        JSONArray jsonArray = new JSONArray();
        CityDao cityDao = daoSession.getCityDao();
        for (int x=0;x<jsonArray.length();x++){
            try {
                JSONObject   jsonObject = jsonArray.getJSONObject(x);
                String name = jsonObject.getString("name");
                int id = jsonObject.getInt("id");
                City city = new City();
                city.setName(name);
                city.setId(id);
                city.setId_province(id_province);
                cityDao.insert(city);
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }
    }

    public static void setCountyData(String responce,  int id_city,DaoSession daoSession){
        JSONArray jsonArray = new JSONArray();
        CountyDao countyDao = daoSession.getCountyDao();
        for (int x=0;x<jsonArray.length();x++){
            try {
                JSONObject jsonObject = jsonArray.getJSONObject(x);
                String name = jsonObject.getString("name");
                int id = jsonObject.getInt("id");
                String weather_id = jsonObject.getString("weather_id");
                County county = new County();
                county.setName(name);
                county.setId(id);
                county.setId_weather(weather_id);
                county.setId_city(id_city);
                countyDao.insert(county);
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }
    }
}
