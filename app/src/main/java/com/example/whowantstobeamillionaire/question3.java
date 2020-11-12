package com.example.whowantstobeamillionaire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class question3 extends AppCompatActivity {
    int count = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_btn3a:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question3.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question3.this, lost.class));
                }
                break;
            case R.id.radio_btn3b:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question3.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question3.this, lost.class));
                }
                break;
            case R.id.radio_btn3c:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question3.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question3.this, lost.class));
                }
                break;
            case R.id.radio_btn3d:
                if (checked) {
                    count += 15000;
                    Toast toastCorrect = Toast.makeText(question3.this, "+15000 Total= $20,000", Toast.LENGTH_LONG);
                    toastCorrect.show();
                    startActivity(new Intent(question3.this, question4.class));
                }
                break;
        }
    }
}
