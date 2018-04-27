package com.example.sakurasky.yedance.Fragments;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.sakurasky.yedance.R;
import com.example.sakurasky.yedance.Services.CallServer;
import com.example.sakurasky.yedance.Utils.GsonUtil;
import com.example.sakurasky.yedance.Utils.MD5;
import com.example.sakurasky.yedance.Utils.MyhttpCallBack;
import com.example.sakurasky.yedance.Utils.URLconstant;
import com.example.sakurasky.yedance.Views.ImageCycleView;
import com.lidroid.xutils.ViewUtils;
import com.yolanda.nohttp.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 喵语界面
 */
public class Fragment1 extends Fragment {
    View v;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.activity_fragment1, container, false);
        ViewUtils.inject(getActivity());

        GsonUtil NewsRequest=new GsonUtil(URLconstant.URLINSER+URLconstant.NEWSURL, RequestMethod.GET);//新闻数据
        NewsRequest.setConnectTimeout(10000);
        NewsRequest.setReadTimeout(10000);
        NewsRequest.add("token", MD5.MD5s("" + new Build().MODEL));
        NewsRequest.add("KeyNo","");
        NewsRequest.add("deviceId",(new Build()).MODEL);

        NewsRequest.add("pageIndex",1);
        NewsRequest.add("pageSize",5);
        CallServer.getInstance().add(getActivity(),NewsRequest, MyhttpCallBack.getInstance(),0x111,true,false,true);

        /**
         * 轮播
         */
        ImageCycleView mImageCycleView= (ImageCycleView) v.findViewById(R.id.icv_topView);//轮播控件
        List<ImageCycleView.ImageInfo> list = new ArrayList<>();
        list.add(new ImageCycleView.ImageInfo(R.mipmap.s1, "", ""));
        list.add(new ImageCycleView.ImageInfo(R.mipmap.s2, "", ""));
        list.add(new ImageCycleView.ImageInfo(R.mipmap.s3, "", ""));
        mImageCycleView.loadData(list, new ImageCycleView.LoadImageCallBack() {
            @Override
            public ImageView loadAndDisplay(ImageCycleView.ImageInfo imageInfo) {
                ImageView imageView = new ImageView(getActivity());
                imageView.setBackgroundResource(Integer.parseInt(imageInfo.image.toString()));
                return imageView;
            }
        });
        return v;
    }


}
