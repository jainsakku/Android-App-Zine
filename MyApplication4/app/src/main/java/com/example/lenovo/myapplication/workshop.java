package com.example.lenovo.myapplication;

/**
 * Created by lenovo on 6/13/2017.
 */

import android.os.Bundle;
        import android.support.v4.app.Fragment;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;





import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class workshop extends Fragment {

    public static class ContentAdapter extends Adapter<ViewHolder> {
        private static final int LENGTH = 18;
        Context context;
        private final String[] mPlaceDesc;
        private final Drawable[] mPlacePictures;
        private final String[] mPlaces;

        public ContentAdapter(String[] mPlaces, String[] mPlaceDesc, Drawable[] mPlacePictures, Context context) {
            this.mPlaces = mPlaces;
            this.mPlaceDesc = mPlaceDesc;
            this.mPlacePictures = mPlacePictures;
            this.context = context;
        }

        public ContentAdapter(Context context) {
            Resources resources = context.getResources();
            this.mPlaces = resources.getStringArray(R.array.workshop_title);
            this.mPlaceDesc = resources.getStringArray(R.array.workshop_desc);
            TypedArray a = resources.obtainTypedArray(R.array.workshop_pic);
            this.mPlacePictures = new Drawable[a.length()];
            for (int i = 0; i < this.mPlacePictures.length; i++) {
                this.mPlacePictures[i] = a.getDrawable(i);
            }
            a.recycle();
        }

        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new ViewHolder(LayoutInflater.from(parent.getContext()), parent);
        }

        public void onBindViewHolder(ViewHolder holder, int position) {
            holder.picture.setImageDrawable(this.mPlacePictures[position % this.mPlacePictures.length]);
            holder.name.setText(this.mPlaces[position % this.mPlaces.length]);
            
        }

        public int getItemCount() {
            return this.mPlacePictures.length;
        }
    }

    public static class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        
        public TextView name = ((TextView) this.itemView.findViewById(R.id.card_title));
        public ImageView picture = ((ImageView) this.itemView.findViewById(R.id.card_image));

        public ViewHolder(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.item_card, parent, false));
            this.itemView.setOnClickListener(new OnClickListener() {
                public void onClick(View v) {
                    Context context = v.getContext();
                    Intent intent = new Intent(context, WorkshopDetailActivity.class);
                    intent.putExtra(WorkshopDetailActivity.EXTRA_POSITION, ViewHolder.this.getAdapterPosition());
                    context.startActivity(intent);
                }
            });
        }
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        RecyclerView recyclerView = (RecyclerView) inflater.inflate(R.layout.recycler_view, container, false);
        recyclerView.setAdapter(new ContentAdapter(recyclerView.getContext()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return recyclerView;
    }
}
