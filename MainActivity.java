package com.example.program6;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import androidx.appcompat.app.AppCompatActivity;
import com.example.program6.R;
public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private EditText editText;
    private Button button;private CheckBox checkBox;
    private RadioGroup radioGroup;
    private RadioButton radioButton1;
    private RadioButton radioButton2;
    private Switch switch1;
    private Spinner spinner;
    private ProgressBar progressBar;
    private DatePicker datePicker;
    private TimePicker timePicker;
    private NumberPicker numberPicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        checkBox = findViewById(R.id.checkBox);
        radioGroup=findViewById(R.id.radioGroup);
        radioButton1 = findViewById(R.id.radioButton);
        radioButton2 =findViewById(R.id.radioButton3);
        switch1=findViewById(R.id.switch1);
        spinner =findViewById(R.id.spinner);
        progressBar = findViewById(R.id.progressBar);
        datePicker =findViewById(R.id.datepicker);
        timePicker = findViewById(R.id.timepicker);
        numberPicker =findViewById(R.id.numberpicker);
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue (100);
    }

}
