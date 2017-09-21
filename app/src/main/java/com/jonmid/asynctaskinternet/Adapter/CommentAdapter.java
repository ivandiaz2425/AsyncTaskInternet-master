package com.jonmid.asynctaskinternet.Adapter;

import android.content.Context;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.jonmid.asynctaskinternet.Models.Comment;
import com.jonmid.asynctaskinternet.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aula7 on 21/09/17.
 */

public class CommentAdapter  extends RecyclerView.Adapter<CommentAdapter.ViewHolder>{

    List<Comment> commentList = new ArrayList<>();
    Context context;

    public CommentAdapter(List<Comment> commentList, Context context) {
        this.commentList = commentList;
        this.context = context;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //configurar el ViewHolder
        //Obtener el archivo item. xml
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        //pasar los componentes del archivo (item.xml) para hacer referencia de ellos.
        ViewHolder viewHolder = new ViewHolder(item);

        return null;
    }

    @Override
    public int getItemCount() {
        return commentList.size();
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //Encargado de trabajar los componentes del (item.xml)
        holder.textViewEmail.setText(commentList.get(position).getEmail());
        holder.getTextViewbody.setText(commentList.get(position).getBody());

    }

    //toda clase adapter necesita un ViewHolder clase que permite hacer referencia a los componentes (item.xml)
    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textViewEmail;
        TextView getTextViewbody;

        public ViewHolder(View item) {
            super(item);
            imageView = (ImageView) item.findViewById(R.id.img_person);
            textViewEmail = (TextView) item.findViewById(R.id.tv_item_email);
            textViewEmail = (TextView) item.findViewById(R.id.tv_item_body);
        }
    }
}
