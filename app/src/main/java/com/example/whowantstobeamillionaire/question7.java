package com.example.whowantstobeamillionaire;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class question7 extends AppCompatActivity {
    int count = 75000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question7);
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_btn7a:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question7.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question7.this, lost.class));
                }
                break;
            case R.id.radio_btn7b:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question7.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question7.this, lost.class));
                }
                break;
            case R.id.radio_btn7c:
                if (checked) {
                    Toast toastWrong = Toast.makeText(question7.this, "Incorrect!", Toast.LENGTH_LONG);
                    toastWrong.show();
                    startActivity(new Intent(question7.this, lost.class));
                }
                break;
            case R.id.radio_btn7d:
                if (checked) {
                    count += 75000;
                    Toast toastCorrect = Toast.makeText(question7.this, "+75000 Total= $150,000", Toast.LENGTH_LONG);
                    toastCorrect.show();
                    startActivity(new Intent(question7.this, question8.class));
                }
                break;
        }
    }
}
