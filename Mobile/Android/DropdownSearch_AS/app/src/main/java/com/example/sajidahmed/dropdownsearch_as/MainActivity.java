package com.example.sajidahmed.dropdownsearch_as;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMyButton = (Button)findViewById(R.id.btnMyButton);

        btnMyButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView myText = (TextView)findViewById(R.id.txtMyText);
                        myText.setText("Good Job :)");
                    }
                }
        );
    }

}
