package com.example.sakurasky.yedance.Utils;
import com.example.sakurasky.yedance.Model.DataManager;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;
import com.yolanda.nohttp.rest.Response;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by alucard on 2016-05-18.
 */
public class MyhttpCallBack implements HttpCallBack {
    Gson gson;
    static Map<String, Object> map;
    String jsonString;

    private static MyhttpCallBack instance;

    public static MyhttpCallBack getInstance() {
        if (instance == null) {
            instance = new MyhttpCallBack();
        }
        return instance;
    }


    @Override
    public void onSucceed(int what, Response response) {
        gson = new Gson();
        try {
            switch (what) {
                case 0x111://获取新闻
                    jsonString = (String) response.get();
                    break;
                default:
                    break;
            }
        } catch (NullPointerException e) {
            showdisplay(what);
            Toast.show("后台数据空返回!");
        } catch (IndexOutOfBoundsException e) {
            showdisplay(what);
            Toast.show("后台数据结构变更下标越界!");
        } catch (ClassCastException e) {
            showdisplay(what);
            Toast.show("后台数据变更类型转换出错!");
        } catch (NumberFormatException e) {
            showdisplay(what);
            Toast.show("字符串转换为数字异常!");
        } catch (JsonSyntaxException e) {
            showdisplay(what);
            Toast.show("后台数据变更json解析出错!");
        }
    }

    @Override
    public void onFailed(int what, Response response) {
        showdisplay(what);
    }

    public void showdisplay(int what) {
        switch (what) {
            default:
                break;
        }

    }
}
