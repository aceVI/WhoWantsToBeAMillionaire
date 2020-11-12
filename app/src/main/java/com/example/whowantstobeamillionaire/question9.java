package com.example.whowantstobeamillionaire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class question9 extends AppCompatActivity {
    int count = 250000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question9);
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_btn9a:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question9.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question9.this, lost.class));
                }
                break;
            case R.id.radio_btn9b:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question9.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question9.this, lost.class));
                }
                break;
            case R.id.radio_btn9c:
                if (checked) {
                    count += 250000;
                    Toast toastCorrect = Toast.makeText(question9.this, "+250000 Total= $500,000", Toast.LENGTH_LONG);
                    toastCorrect.show();
                    startActivity(new Intent(question9.this, question10.class));
                }
                break;
            case R.id.radio_btn9d:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question9.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question9.this, lost.class));
                }
                break;
        }
    }
}

