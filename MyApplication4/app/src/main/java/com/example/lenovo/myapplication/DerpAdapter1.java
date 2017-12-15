package com.example.lenovo.myapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 7/31/2017.
 */

public class DerpAdapter1 extends RecyclerView.Adapter <DerpAdapter1.DerpHolder1>{

    private List<ListItem1> listData1;
    private LayoutInflater inflater1;

    private ItemClickCallback1 itemClickCallback1;

    public interface ItemClickCallback1 {
        void onItemClick1(int q);

    }

    public void setItemClickCallback1(final ItemClickCallback1 itemClickCallback1) {
        this.itemClickCallback1 = itemClickCallback1;
    }

    public DerpAdapter1(List <ListItem1> listData1, Context c1){
        inflater1 = LayoutInflater.from(c1);
        this.listData1 = listData1;
    }

    @Override
    public DerpAdapter1.DerpHolder1 onCreateViewHolder(ViewGroup parent, int viewType) {
        View view1 = inflater1.inflate(R.layout.card_item1, parent, false);
        return new DerpHolder1(view1);
    }

    @Override
    public void onBindViewHolder(DerpHolder1 holder1, int position) {
        ListItem1 item = listData1.get(position);
        holder1.thumbnail1.setImageResource(item.getImageResId1());
        holder1.subTitle1.setText(item.getSubtitle1());
        /*if (item.isFavourite()){
            holder.secondaryIcon.setImageResource(R.drawable.ic_star_black_24dp);
        } else {
            holder.secondaryIcon.setImageResource(R.drawable.ic_star_border_black_24dp);
        }*/
    }

    public void setListData1(ArrayList<ListItem1> exerciseList1) {
        this.listData1.clear();
        this.listData1.addAll(exerciseList1);
    }

    @Override
    public int getItemCount() {
        return listData1.size();
    }

    class DerpHolder1 extends RecyclerView.ViewHolder implements View.OnClickListener{

        ImageView thumbnail1;
        //ImageView secondaryIcon;
        TextView title1;
        TextView subTitle1;
        View container1;
        Button load1;

        public DerpHolder1(View itemView1) {
            super(itemView1);
            thumbnail1 = (ImageView)itemView1.findViewById(R.id.im_item_icon1);
            // secondaryIcon = (ImageView)itemView.findViewById(R.id.im_item_icon_secondary);
            // secondaryIcon.setOnClickListener(this);
            subTitle1 = (TextView)itemView1.findViewById(R.id.lbl_item_sub_title1);

            container1 = (View)itemView1.findViewById(R.id.cont_item_root1);
            load1 = (Button)itemView1.findViewById(R.id.btn_card_load1);
            load1.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.btn_card_load1){
                itemClickCallback1.onItemClick1(getAdapterPosition());
            } else {
                // itemClickCallback.onSecondaryIconClick(getAdapterPosition());
            }
        }
    }
}