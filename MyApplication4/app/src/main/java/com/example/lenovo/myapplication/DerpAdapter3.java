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

public class DerpAdapter3 extends RecyclerView.Adapter <DerpAdapter3.DerpHolder3>{

    private List<ListItem3> listData3;
    private LayoutInflater inflater3;

    private ItemClickCallback3 itemClickCallback3;

    public interface ItemClickCallback3 {
        void onItemClick3(int s);

    }

    public void setItemClickCallback3(final ItemClickCallback3 itemClickCallback3) {
        this.itemClickCallback3 = itemClickCallback3;
    }

    public DerpAdapter3(List <ListItem3> listData3, Context c3){
        inflater3 = LayoutInflater.from(c3);
        this.listData3 = listData3;
    }

    @Override
    public DerpAdapter3.DerpHolder3 onCreateViewHolder(ViewGroup parent, int viewType) {
        View view3 = inflater3.inflate(R.layout.card_item3, parent, false);
        return new DerpHolder3(view3);
    }

    @Override
    public void onBindViewHolder(DerpHolder3 holder3, int position) {
        ListItem3 item3 = listData3.get(position);
        holder3.thumbnail3.setImageResource(item3.getImageResId3());
        holder3.subTitle3.setText(item3.getSubtitle3());
        /*if (item.isFavourite()){
            holder.secondaryIcon.setImageResource(R.drawable.ic_star_black_24dp);
        } else {
            holder.secondaryIcon.setImageResource(R.drawable.ic_star_border_black_24dp);
        }*/
    }

    public void setListData3(ArrayList<ListItem3> exerciseList3) {
        this.listData3.clear();
        this.listData3.addAll(exerciseList3);
    }

    @Override
    public int getItemCount() {
        return listData3.size();
    }

    class DerpHolder3 extends RecyclerView.ViewHolder implements View.OnClickListener{

        ImageView thumbnail3;
        //ImageView secondaryIcon;
        TextView title3;
        TextView subTitle3;
        View container3;
        Button load3;

        public DerpHolder3(View itemView) {
            super(itemView);
            thumbnail3 = (ImageView)itemView.findViewById(R.id.im_item_icon3);
            // secondaryIcon = (ImageView)itemView.findViewById(R.id.im_item_icon_secondary);
            // secondaryIcon.setOnClickListener(this);
            subTitle3 = (TextView)itemView.findViewById(R.id.lbl_item_sub_title3);

            container3 = (View)itemView.findViewById(R.id.cont_item_root3);
            load3 = (Button)itemView.findViewById(R.id.btn_card_load3);
            load3.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.btn_card_load3){
                itemClickCallback3.onItemClick3(getAdapterPosition());
            } else {
                // itemClickCallback.onSecondaryIconClick(getAdapterPosition());
            }
        }
    }
}
