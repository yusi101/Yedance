package com.example.sakurasky.yedance.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import com.example.sakurasky.yedance.Adapters.NewsListAdapter;
import com.example.sakurasky.yedance.Adapters.MyGridAdapterf4;
import com.example.sakurasky.yedance.R;
import com.example.sakurasky.yedance.Views.ImageCycleView;
import com.lidroid.xutils.view.annotation.ViewInject;

import com.example.sakurasky.yedance.Model.DataManager.PartyCommittee;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * 小窝
 */
public class Fragment4 extends Fragment {
    View v;

    String [] text1={"好友","许愿池","小本子","便利店","糖果","排行榜","设置"};
    int [] imgs={R.mipmap.friend,R.mipmap.desire,R.mipmap.notebook,R.mipmap.shop,
            R.mipmap.candy,R.mipmap.rankinglist,R.mipmap.set};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         v = inflater.inflate(R.layout.activity_fragment4, container, false);
        gvShow();
        ListView lv = (ListView)v.findViewById(R.id.lisrvwe);
        List<PartyCommittee> list = new ArrayList<>();
        NewsListAdapter adapter = new NewsListAdapter(getActivity(),list);
        lv.setAdapter(adapter);
        return v;
    }
    public void gvShow(){
        GridView gridView = (GridView)v.findViewById(R.id.gridview);
        MyGridAdapterf4 adapter=new MyGridAdapterf4(getActivity(),text1,null,imgs);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent i=new Intent(getActivity(),MainSarActivity.class);
                        startActivity(i);
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        break;
                    case 9:
                        break;
                }
            }
        });
    }

}
