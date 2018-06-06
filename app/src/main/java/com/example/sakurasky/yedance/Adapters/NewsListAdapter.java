package com.example.sakurasky.yedance.Adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sakurasky.yedance.Activitys.ContentActivity;
import com.example.sakurasky.yedance.R;

import com.example.sakurasky.yedance.Model.DataManager.PartyCommittee;

import java.util.List;

public class NewsListAdapter extends BaseAdapter {
    ViewHolder vh = null;
    private Context context;
    private List<PartyCommittee> list;

    public NewsListAdapter(Context context, List<PartyCommittee> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return 0;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.news_item,null);
            vh = new ViewHolder();
            vh.tv_title = (TextView)convertView.findViewById(R.id.tv_title);
            vh.tv_time = (TextView)convertView.findViewById(R.id.tv_time);
            vh.tv_content = (TextView)convertView.findViewById(R.id.tv_content);
            vh.tv_type = (TextView)convertView.findViewById(R.id.tv_type);
            vh.img = (ImageView)convertView.findViewById(R.id.img);
            convertView.setTag(vh);
        }else{
            vh = (ViewHolder)convertView.getTag();
        }
        vh.tv_title.setText(list.get(position).title);
        vh.tv_time.setText(list.get(position).time);
        vh.tv_content.setText(list.get(position).content);
        switch (list.get(position).type){
            case 0:
                vh.tv_type.setText("游戏");
                vh.tv_type.setBackgroundColor(context.getResources().getColor(R.color.red));
                break;
            case 1:
                vh.tv_type.setText("本子");
                vh.tv_type.setBackgroundColor(context.getResources().getColor(R.color.blue));
                break;
            case 2:
                vh.tv_type.setText("画集");
                vh.tv_type.setBackgroundColor(context.getResources().getColor(R.color.deeppink));
                break;
            case 3:
                vh.tv_type.setText("视频");
                vh.tv_type.setBackgroundColor(context.getResources().getColor(R.color.greenyellow));
                break;
            case 4:
                vh.tv_type.setText("音乐");
                vh.tv_type.setBackgroundColor(context.getResources().getColor(R.color.lightskyblue));
                break;
            case 5:
                vh.tv_type.setText("小说");
                vh.tv_type.setBackgroundColor(context.getResources().getColor(R.color.royalblue));
                break;
            case 6:
                vh.tv_type.setText("其他");
                vh.tv_type.setBackgroundColor(context.getResources().getColor(R.color.darkblue));
                break;

        }

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, ContentActivity.class);
                i.putExtra("title",vh.tv_title.getText());
                context.startActivity(i);
            }
        });
        return convertView;
    }
    private static class ViewHolder{
        TextView tv_title;
        TextView tv_time;
        TextView tv_content;
        TextView tv_type;
        ImageView img;
    }
}
