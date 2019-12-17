package com.king.myrecyclerapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ImageViewHolder> {
    private Context mContext;
    private List<Item> mUploads;
    private OnItemClickListener mListener;

    public CustomAdapter(Context mContext, List<Item> mUploads) {
        this.mContext = mContext;
        this.mUploads = mUploads;
    }

    @Override
    public ImageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.item_layout,parent,false);
        return new ImageViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ImageViewHolder holder, int position) {
        Item uploadCurrent = mUploads.get(position);
        holder.mTvFname.setText(uploadCurrent.getFname());
        holder.mTvSname.setText(uploadCurrent.getSname());
//        Picasso.with(mContext).load(uploadCurrent.getmImageUrl())
//                .fit().centerInside().into(holder.imageView);
        //This has centerCrop()

        Picasso.with(mContext).load(uploadCurrent.getPoster()).placeholder(R.mipmap.ic_launcher).fit()
                .centerInside().into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return mUploads.size();
    }

    public class ImageViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public TextView mTvFname;
        public TextView mTvSname;
        public ImageView imageView;
        public ImageViewHolder(View itemView) {
            super(itemView);
            mTvFname = itemView.findViewById(R.id.tvfname);
            mTvSname = itemView.findViewById(R.id.tvsname);
            imageView = itemView.findViewById(R.id.imgposter);

            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            if (mListener!=null){
                //Get the position of the clicked item
                int position = getAdapterPosition();
                if (position!=RecyclerView.NO_POSITION){
                    mListener.onItemClick(position);
                }
            }
        }


    }
    public interface OnItemClickListener{
        void onItemClick(int position);


    }
    public void setOnItemClickListener(OnItemClickListener listener){
        mListener = listener;
    }

}