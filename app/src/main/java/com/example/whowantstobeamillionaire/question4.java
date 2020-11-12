package com.example.whowantstobeamillionaire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class question4 extends AppCompatActivity {

    int count = 20000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_btn4a:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question4.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question4.this, lost.class));
                }
                break;
            case R.id.radio_btn4b:
                if (checked) {
                    count += 15000;
                    Toast toastCorrect = Toast.makeText(question4.this, "+15000 Total= $35,000", Toast.LENGTH_LONG);
                    toastCorrect.show();
                    startActivity(new Intent(question4.this, question5.class));
                }
                break;
            case R.id.radio_btn4c:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question4.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question4.this, lost.class));
                }
                break;
            case R.id.radio_btn4d:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question4.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question4.this, lost.class));
                }
                break;

        }
    }
}
