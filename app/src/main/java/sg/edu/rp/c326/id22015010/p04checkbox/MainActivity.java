package sg.edu.rp.c326.id22015010.p04checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
CheckBox cbEnabled;
Button btnCheck;
TextView tvShow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cbEnabled=findViewById(R.id.checkBoxDiscount);
        btnCheck=findViewById(R.id.buttonCheck1);
        tvShow=findViewById(R.id.textView2);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "button is clicked", Toast.LENGTH_LONG).show();
                CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkBoxDiscount);
                if (checkBox1.isChecked()) {
                    double pay=calcPay(100,20);
                    tvShow.setText("The discount is given. You need to pay"+pay);
                }else{
                    double pay=calcPay(100,0);
                    tvShow.setText("The discount is not given. You need to pay"+pay);
                }
            }
        });

    }
    private double calcPay(double price, double discount){
        double pay =price*(1-discount/100);
        return pay;
    }
}