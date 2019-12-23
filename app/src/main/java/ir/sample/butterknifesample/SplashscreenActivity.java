package ir.sample.butterknifesample;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;

public class SplashscreenActivity extends AppCompatActivity {

    @BindString(R.string.app_name)
    String string;

    @BindView(R.id.txt_splashscreen_content)
    TextView txtContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        ButterKnife.bind(this);
        txtContent.setText(string);
        delayIntent();

    }

    void delayIntent() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashscreenActivity.this, MainActivity.class);
                startActivity(intent);
            }
        }, 1000);

    }

}