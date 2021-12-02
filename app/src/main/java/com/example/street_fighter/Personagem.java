package com.example.street_fighter;

import android.os.Bundle;

import androidx.recyclerview.widget.RecyclerView;

public class Personagem extends RecyclerView.ViewHolder {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personagem);

            public NetworkImageView idimgpersonagem;
            public TextView txtidpersonagem;
            public TextView txtidade;

            public CardViewlistaHolder( View itemView) {
                super(itemView);
            idimgpersonagem = itemView.findViewById(R.id.idimgpersonagem);
            txtidpersonagem = itemView.findViewById(R.id.txtidpersonagem);
            txtidade = itemView.findViewById(R.id.txtidade);
            }
        }
    }
}