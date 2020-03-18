package com.example.roomdatabase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;
    public class adapter extends RecyclerView.Adapter<adapter.ViewHolder> {
        private String name,address;
        int E_ID;
        private Context context;
        public adapter(String name,String address,int E_ID , Context context) {
            this.name= name;
            this.address=address;
            this.E_ID=E_ID;
            this.context=context;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            View listItem= layoutInflater.inflate(R.layout.list, parent, false);
            ViewHolder viewHolder = new ViewHolder(listItem);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, final int position) {
            holder.textView.setText(name);
            holder.textView1.setText(address);
            holder.textView2.setText(E_ID);
            holder.linearLayout.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view) {

               Toast.makeText(context,"kuch bhi",Toast.LENGTH_SHORT).show();

                }
            });
        }

        @Override
        public int getItemCount() {
            return 0;
        }

        public static class ViewHolder extends RecyclerView.ViewHolder {

            public TextView textView;
            public TextView textView1;
            public TextView textView2;
            public LinearLayout linearLayout;
            public ViewHolder(View itemView) {
                super(itemView);
                this.textView = (TextView) itemView.findViewById(R.id.text);
                this.textView1 = (TextView) itemView.findViewById(R.id.text1);
                this.textView2 = (TextView) itemView.findViewById(R.id.text3);
                linearLayout = (LinearLayout) itemView.findViewById(R.id.linear);

            }
        }

    }

