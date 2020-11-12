package com.example.whowantstobeamillionaire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class question8 extends AppCompatActivity {
    int count = 150000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question8);
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_btn8a:
                if (checked) {
                Toast toastWrong = Toast.makeText(question8.this, "Incorrect!", Toast.LENGTH_LONG);
                toastWrong.show();
                startActivity(new Intent(question8.this, lost.class));
            }
            break;
            case R.id.radio_btn8b:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question8.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question8.this, lost.class));
                }
                break;
            case R.id.radio_btn8c:
                if (checked) {
                    count += 10000;
                    Toast toastCorrect = Toast.makeText(question8.this, "+150000 Total= $250,000", Toast.LENGTH_LONG);
                    toastCorrect.show();
                    startActivity(new Intent(question8.this, question9.class));
                }
                break;
            case R.id.radio_btn8d:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question8.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question8.this, lost.class));
                }
                break;
        }
    }
}
