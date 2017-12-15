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

public class DerpAdapter2 extends RecyclerView.Adapter <DerpAdapter2.DerpHolder2>{

    private List<ListItem2> listData2;
    private LayoutInflater inflater2;

    private ItemClickCallback2 itemClickCallback2;

    public interface ItemClickCallback2 {
        void onItemClick2(int r);

    }

    public void setItemClickCallback2(final ItemClickCallback2 itemClickCallback2) {
        this.itemClickCallback2 = itemClickCallback2;
    }

    public DerpAdapter2(List <ListItem2> listData2, Context c2){
        inflater2 = LayoutInflater.from(c2);
        this.listData2 = listData2;
    }

    @Override
    public DerpAdapter2.DerpHolder2 onCreateViewHolder(ViewGroup parent, int viewType) {
        View view2 = inflater2.inflate(R.layout.card_item2, parent, false);
        return new DerpHolder2(view2);
    }

    @Override
    public void onBindViewHolder(DerpHolder2 holder2, int position) {
        ListItem2 item = listData2.get(position);

        holder2.subTitle2.setText(item.getSubtitle2());
        holder2.thumbnail2.setImageResource(item.getImageResId2());
        /*if (item.isFavourite()){
            holder.secondaryIcon.setImageResource(R.drawable.ic_star_black_24dp);
        } else {
            holder.secondaryIcon.setImageResource(R.drawable.ic_star_border_black_24dp);
        }*/
    }

    public void setListData2(ArrayList<ListItem2> exerciseList2) {
        this.listData2.clear();
        this.listData2.addAll(exerciseList2);
    }

    @Override
    public int getItemCount() {
        return listData2.size();
    }

    class DerpHolder2 extends RecyclerView.ViewHolder implements View.OnClickListener{

        ImageView thumbnail2;
        //ImageView secondaryIcon;
        TextView title2;
        TextView subTitle2;
        View container2;
        Button load2;

        public DerpHolder2(View itemView) {
            super(itemView);
            thumbnail2 = (ImageView)itemView.findViewById(R.id.im_item_icon2);
            // secondaryIcon = (ImageView)itemView.findViewById(R.id.im_item_icon_secondary);
            // secondaryIcon.setOnClickListener(this);
            subTitle2 = (TextView)itemView.findViewById(R.id.lbl_item_sub_title2);

            container2 = (View)itemView.findViewById(R.id.cont_item_root2);
            load2 = (Button)itemView.findViewById(R.id.btn_card_load2);
            load2.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.btn_card_load2){
                itemClickCallback2.onItemClick2(getAdapterPosition());
            } else {
                // itemClickCallback.onSecondaryIconClick(getAdapterPosition());
            }
        }
    }
}
