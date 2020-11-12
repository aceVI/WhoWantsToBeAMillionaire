package com.example.whowantstobeamillionaire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class question5 extends AppCompatActivity {

    int count = 35000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question5);
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_btn5a:
                if (checked) {
                    count += 15000;
                    Toast toastCorrect = Toast.makeText(question5.this, "+15000 Total= $50,000", Toast.LENGTH_LONG);
                    toastCorrect.show();
                    startActivity(new Intent(question5.this, question6.class));
                }
                break;
            case R.id.radio_btn5b:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question5.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question5.this, lost.class));
                }
                break;
            case R.id.radio_btn5c:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question5.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question5.this, lost.class));
                }
                break;
            case R.id.radio_btn5d:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question5.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question5.this, lost.class));
                }
                break;
        }
    }
}
