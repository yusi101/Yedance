package com.example.sakurasky.yedance.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.sakurasky.yedance.Adapters.MyGridAdapterf2;
import com.example.sakurasky.yedance.R;
import com.lidroid.xutils.ViewUtils;

/**
 *
 * 画展
 */
public class Fragment2 extends Fragment {
    View v;

    String [] text1={};
    int [] imgs={};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.activity_fragment2, container, false);
        ViewUtils.inject(getActivity());
        gvShow();
        return v;
    }
    public void gvShow(){
        GridView gridView= (GridView) v.findViewById(R.id.f2gridview);
        MyGridAdapterf2 adapter=new MyGridAdapterf2(getActivity(),text1,null,imgs);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
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





