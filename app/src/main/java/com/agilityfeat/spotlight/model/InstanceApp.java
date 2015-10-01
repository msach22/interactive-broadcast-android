package com.agilityfeat.spotlight.model;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class InstanceApp {
    private static InstanceApp mInstance = null;

    private JSONObject mData;

    private InstanceApp(){
        mData = null;
    }

    public static InstanceApp getInstance(){
        if(mInstance == null)
        {
            mInstance = new InstanceApp();
        }
        return mInstance;
    }

    public JSONObject getData(){
        return this.mData;
    }

    public JSONArray getEvents(){
        try {
            return this.mData.getJSONArray("events");
        } catch(JSONException e) {
            return null;
        }
    }

    public JSONObject getEventByIndex(int index){
        try {
            JSONArray events = this.mData.getJSONArray("events");
            return events.getJSONObject(index);
        } catch(JSONException e) {
            return null;
        }
    }

    public void setData(JSONObject value){
        mData = value;
    }
}