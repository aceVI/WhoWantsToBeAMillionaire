package com.example.whowantstobeamillionaire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class question10 extends AppCompatActivity {
    int count = 500000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question10);
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_btn10a:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question10.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question10.this, lost.class));
                }
                break;
            case R.id.radio_btn10b:
                if (checked) {
                    count += 500000;
                    Toast toastCorrect = Toast.makeText(question10.this, "+500000 Total= $1,000,000", Toast.LENGTH_LONG);
                    toastCorrect.show();
                    startActivity(new Intent(question10.this, winner.class));
                }
                break;
            case R.id.radio_btn10c:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question10.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question10.this, lost.class));
                }
                break;
            case R.id.radio_btn10d:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question10.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question10.this, lost.class));
                }
                break;

        }
    }
}
