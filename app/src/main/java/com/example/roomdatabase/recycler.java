package com.example.roomdatabase;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class recycler extends AppCompatActivity {
    String name,address;
    int E_ID;
    public recycler()
    { }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        Intent intent=getIntent();
        name=intent.getStringExtra("abc");
        address=intent.getStringExtra("q");
        E_ID=intent.getIntExtra("w",0);
        Log.d("vall","kuch b"+E_ID);
        Log.d("vall22","kuch b"+name);
        Log.d("vall3","kuch b"+address);

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rec);
            final LinearLayoutManager abc = new LinearLayoutManager(this);
            abc.setOrientation(LinearLayoutManager.VERTICAL);
            recyclerView.setLayoutManager(abc);
           adapter adapter=new adapter(name,address,E_ID,this);
            recyclerView.setAdapter(adapter);
            adapter.notifyDataSetChanged();

    }
}
