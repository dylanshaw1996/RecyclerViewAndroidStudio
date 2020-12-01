package com.example.recyclerviewassignment;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    String names1[];
    int[] images1;
    String funFact1 [];
    String wiki1[];
    Context context;
    RelativeLayout parentLayout;

    public RecyclerViewAdapter (Context ct, String[] cars, int[] img, String[] funFact, String[] wikiUrl){
        names1 = cars;
        context = ct;
        images1 = img;
        funFact1 = funFact;
        wiki1 = wikiUrl;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.list_layout, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.myText1.setText(names1[position]);
        holder.myimage.setImageResource(images1[position]);

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, SecondActivity.class);
                intent.putExtra("factz", funFact1[position]);
                intent.putExtra("wikz", wiki1[position]);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return names1.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public View parentLayout;
        TextView myText1;
        ImageView myimage;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            myText1 = itemView.findViewById(R.id.name);
            myimage = itemView.findViewById(R.id.image_name);
            parentLayout = itemView.findViewById(R.id.layout_parent);
        }
    }
}
