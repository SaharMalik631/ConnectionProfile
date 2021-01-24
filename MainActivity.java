package com.example.connectionprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
EditText t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void process(View view){
    t1=(EditText)findViewById(R.id.t1);

FirebaseDatabase db =FirebaseDatabase.getInstance();
DatabaseReference root =db.getReference();

root.setValue (t1.getText().toString());
t1.setText("");
       Toast.makeText(getApplicationContext(),resid:"inserted",Toast.LENGTH_LONG).show();
}
}
