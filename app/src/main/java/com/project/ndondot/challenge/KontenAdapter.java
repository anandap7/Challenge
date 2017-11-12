package com.project.ndondot.challenge;

import android.content.Context;
import android.media.Image;
import android.provider.ContactsContract;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by a_pri on 11/12/2017.
 */

public class KontenAdapter extends RecyclerView.Adapter<KontenAdapter.ViewHolder>{
    private Context context;
    private List<KontenModel> kontenModelList;

    public KontenAdapter(Context context, List<KontenModel> kontenModelList) {
        this.context = context;
        this.kontenModelList = kontenModelList;
    }

    @Override
    public KontenAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v  = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.konten_recycler, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(KontenAdapter.ViewHolder holder, int position) {
        KontenModel kontenModel = kontenModelList.get(position);

        holder.duration.setText(kontenModel.getDuration());
        holder.title.setText(kontenModel.getTitle());
        holder.uploader.setText(kontenModel.uploader);
        Picasso.with(context).load(kontenModel.getThumbnail()).into(holder.thumbnail);
        Picasso.with(context).load(kontenModel.getPp()).into(holder.pp);
        holder.list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Sudah diklik", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return kontenModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView duration, title, uploader;
        public ImageView thumbnail, pp;
        public LinearLayout list;

        public ViewHolder (View itemView){
            super (itemView);

            duration = (TextView) itemView.findViewById(R.id.duration);
            title = (TextView) itemView.findViewById(R.id.tittle);
            uploader = (TextView) itemView.findViewById(R.id.uploader);
            thumbnail = (ImageView) itemView.findViewById(R.id.thumbnail_video);
            pp = (ImageView) itemView.findViewById(R.id.profile_pic);
            list = (LinearLayout) itemView.findViewById(R.id.list);
        }
    }
}
