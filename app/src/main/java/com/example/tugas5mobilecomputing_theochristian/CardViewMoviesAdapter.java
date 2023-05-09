package com.example.tugas5mobilecomputing_theochristian;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewMoviesAdapter extends RecyclerView.Adapter<CardViewMoviesAdapter.CardViewViewHolder> {
    private ArrayList<MovieModel> listMovie;
    Context context;

    public CardViewMoviesAdapter(ArrayList<MovieModel> list, Context context) {
        this.listMovie = list;
        this.context = context;
    }


    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viwType) {
        // LayoutInflater inflater = LayoutInflater.from(context);
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_movie, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, int position) {
        MovieModel movieModel = listMovie.get(position);

        Glide.with(holder.itemView.getContext())
                .load(movieModel.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);

        holder.tvName.setText(movieModel.getName());
        holder.tvDetail.setText(movieModel.getDetail());
        holder.imgPhoto.setImageResource(movieModel.getPhoto());

        holder.btnSinopsis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent previewIntent = new Intent(context, PreviewActivity.class);
                previewIntent.putExtra(PreviewActivity.EXTRA_NAME, listMovie.get(holder.getAdapterPosition()).getName());
                previewIntent.putExtra(PreviewActivity.EXTRA_DETAIL, listMovie.get(holder.getAdapterPosition()).getDetail());
                previewIntent.putExtra(PreviewActivity.EXTRA_IMAGES, listMovie.get(holder.getAdapterPosition()).getPhoto());
                context.startActivity(previewIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listMovie.size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        Button btnSinopsis;

        CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
            btnSinopsis = itemView.findViewById(R.id.btn_set_sinopsis);
        }
    }
}