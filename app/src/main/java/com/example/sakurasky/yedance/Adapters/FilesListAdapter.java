package com.example.sakurasky.yedance.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;


import com.example.sakurasky.yedance.R;

import java.util.List;

/**
 * @author yusi
 * 文档中心lsitAdapter
 */
public class FilesListAdapter extends BaseAdapter {

    ViewHolder vh = null;
    private Context context;
    private List<String> list1;
    public FilesListAdapter(Context context, List<String> list1) {
        this.context = context;
        this.list1 = list1;
    }

    @Override
    public int getCount() {
        return list1.size();
    }

    @Override
    public Object getItem(int position) {
        return 0;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View view, ViewGroup parent) {
//        if (view == null) {
//            view = LayoutInflater.from(context).inflate(R.layout.activity_files_item, null);
//            vh = new ViewHolder();
//            vh.files_name=(TextView) view.findViewById(R.id.files_name);
//            vh.files_size=(TextView) view.findViewById(R.id.files_size);
//            vh.files_path=(TextView) view.findViewById(R.id.files_path);
//
//            vh.progressBar=(ProgressBar) view.findViewById(R.id.progressBar);
//
//            vh.downloadButton=(Button) view.findViewById(R.id.downloadbutton);
//            vh.stopButton=(Button) view.findViewById(R.id.stopbutton);
//            vh.resultView=(TextView) view.findViewById(R.id.resultView);
//
//            view.setTag(vh);
//        } else {
//            vh = (ViewHolder) view.getTag();
//        }
//        vh.files_name.setText(list1.get(position).FilesName);
//        vh.files_size.setText(list1.get(position).FilesSize+"");
//        vh.files_path.setText(list1.get(position).FilesPath);
        return view;
    }

    public static class ViewHolder {
        TextView files_name;
        TextView files_size;
        TextView files_path;

        ProgressBar progressBar;//进度条
        Button downloadButton;//开始
        Button stopButton;//z暂停
        TextView resultView;//进度值
    }




}
