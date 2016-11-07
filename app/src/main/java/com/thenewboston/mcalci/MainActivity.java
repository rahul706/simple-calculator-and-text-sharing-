package com.thenewboston.mcalci;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final EditText msg =(EditText) findViewById(R.id.etMsg);
        Button send = (Button) findViewById(R.id.btnSend);

        Button clickMe = (Button) findViewById(R.id.btnClickMe);

        clickMe.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http:/www.google.com"));
                startActivity(intent);





            }
        });

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, msg.getText().toString());
                startActivity(intent);
            }
            });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

     public void doAdd(View view)
     {
         EditText editText1 =(EditText) findViewById(R.id.etNumber1);
         EditText editText2 =(EditText) findViewById(R.id.etNumber2);

         int a =Integer.parseInt(editText1.getText().toString());
         int b =Integer.parseInt(editText2.getText().toString());

         Intent intent = new Intent(MainActivity.this, ResultActivity.class);
         intent.putExtra("RESULT" ,String.valueOf(a+b));
          startActivity(intent);

        // TextView textView3 = (TextView)findViewById(R.id.tvResult);

         //textView3.setText(String.valueOf(a+b));
     }

     public void doSub(View view)

     {
         EditText editText1 =(EditText) findViewById(R.id.etNumber1);
         EditText editText2 =(EditText) findViewById(R.id.etNumber2);

         int a =Integer.parseInt(editText1.getText().toString());
         int b =Integer.parseInt(editText2.getText().toString());

         Intent intent = new Intent(MainActivity.this, ResultActivity.class);
         intent.putExtra("RESULT" ,String.valueOf(a-b));
         startActivity(intent);

        // TextView textView3 = (TextView)findViewById(R.id.tvResult);

         //textView3.setText(String.valueOf(a-b));

     }

    public void doMul(View view)

    {
        EditText editText1 =(EditText) findViewById(R.id.etNumber1);
        EditText editText2 =(EditText) findViewById(R.id.etNumber2);

        int a =Integer.parseInt(editText1.getText().toString());
        int b =Integer.parseInt(editText2.getText().toString());

        Intent intent = new Intent(MainActivity.this, ResultActivity.class);
        intent.putExtra("RESULT" ,String.valueOf(a*b));
        startActivity(intent);

       // TextView textView3 = (TextView)findViewById(R.id.tvResult);

        //textView3.setText(String.valueOf(a*b));

    }
}


