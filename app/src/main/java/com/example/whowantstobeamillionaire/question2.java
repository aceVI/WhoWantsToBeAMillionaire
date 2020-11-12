package com.example.whowantstobeamillionaire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class question2 extends AppCompatActivity {

    int count = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_btn2a:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question2.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question2.this, lost.class));
                }
                break;
            case R.id.radio_btn2b:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question2.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question2.this, lost.class));
                }
                break;
            case R.id.radio_btn2c:
                if (checked) {
                    count += 4000;
                    Toast toastCorrect = Toast.makeText(question2.this, "+4000 Total= $5,000", Toast.LENGTH_LONG);
                    toastCorrect.show();
                    startActivity(new Intent(question2.this, question3.class));
                }
                break;
            case R.id.radio_btn2d:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question2.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question2.this, lost.class));
                }
                break;
        }
    }
}
