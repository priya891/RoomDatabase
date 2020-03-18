package com.example.roomdatabase;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    EditText t1,t2,t3;
    Button b1;

    String name,address,a;
    int E_ID;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(EditText) findViewById(R.id.name);
        t2=(EditText) findViewById(R.id.address);
        t3=(EditText) findViewById(R.id.eid);
        b1=(Button)findViewById(R.id.btn) ;
        name=t1.getText().toString();
        address= t2.getText().toString();
        a=t3.getText().toString();

        try{
            E_ID = Integer.parseInt(a);
        } catch(NumberFormatException ex){}
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t1.getText().toString().isEmpty() || t2.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "fill the details", Toast.LENGTH_SHORT).show();

                } else {


                    Intent intent=new Intent(MainActivity.this,recycler.class);
                    intent.putExtra("abc",name);
                    intent.putExtra("q",address);
                    intent.putExtra("w",E_ID);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(),""+name,Toast.LENGTH_SHORT).show();
                    rentity rentity = new rentity( t1.getText().toString().trim(), t2.getText().toString().trim(),E_ID);
                    repository rp = new repository(getApplicationContext());
                    rp.InsertTask(rentity);

                }
            }
            });
            }
}
