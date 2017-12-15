package com.example.lenovo.myapplication;

import android.app.Dialog;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CoverFlowAdapter1 extends BaseAdapter {

    private ArrayList<Game1> data;
    private AppCompatActivity activity;


    public CoverFlowAdapter1(AppCompatActivity context, ArrayList<Game1> objects) {
        this.activity = context;
        this.data = objects;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Game1 getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.item_flow_view1, null, false);

            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.gameImage1.setImageResource(data.get(position).getImageSource());
        viewHolder.gameName1.setText(data.get(position).getName());

        convertView.setOnClickListener(onClickListener(position));

        return convertView;

    }
    private View.OnClickListener onClickListener(final int position) {
        return new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(activity);
                dialog.setContentView(R.layout.dialog_game_info1);
                dialog.setCancelable(true); // dimiss when touching outside
                dialog.setTitle("Game Details");
                dialog.getWindow().setLayout(1100,2000);
                dialog.getWindow().setGravity(1);

                TextView text = (TextView) dialog.findViewById(R.id.name);
                text.setText(getItem(position).getName());

                TextView text1 = (TextView) dialog.findViewById(R.id.projectdetail);
                text1.setText(getItem(position).getProjectdetail());
                TextView text2 = (TextView) dialog.findViewById(R.id.projectmember);
                text2.setText(getItem(position).getProjectmembers());
                dialog.show();


            }
        };
    }


    private static class ViewHolder {
        private TextView gameName1;
        private ImageView gameImage1;

        public ViewHolder(View v) {
            gameImage1 = (ImageView) v.findViewById(R.id.img4);
            gameName1 = (TextView) v.findViewById(R.id.text1);
        }
    }







}