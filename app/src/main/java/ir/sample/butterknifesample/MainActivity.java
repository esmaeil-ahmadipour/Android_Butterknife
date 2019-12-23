package ir.sample.butterknifesample;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindColor;
import butterknife.BindDrawable;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnLongClick;

public class MainActivity extends AppCompatActivity {

    @BindColor(R.color.GoogleBlue)
    int colorInt;
    @BindString(R.string.btn_Main_btn1)
    String stringBtnBindSample1;
    @BindDrawable(R.drawable.background_primary_color)
    Drawable drawableRelMainLight;
    @BindDrawable(R.drawable.background_secondry_color)
    Drawable drawableRelMainDark;
    @BindView(R.id.btn_main_BindSample1)
    Button btnBindSample1;
    @BindView(R.id.rel_main_background)
    RelativeLayout relMain;


    @OnLongClick(R.id.btn_main_BindSample1)
    public void onClick_btnBindSample1() {
        changeBackground();
    }

    @OnClick(R.id.btn_main_BindSample1)
    public void onLongClick_changeActivity() {
        changeActivity();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        btnBindSample1.setText(stringBtnBindSample1);
        btnBindSample1.setTextColor(colorInt);
        relMain.setBackground(drawableRelMainLight);

    }

    public void changeBackground() {
        if (relMain.getBackground() == drawableRelMainLight) {
            relMain.setBackground(drawableRelMainDark);
        } else
            relMain.setBackground(drawableRelMainLight);

    }
    public void changeActivity() {
        Intent intent = new Intent(MainActivity.this,SecondaryActivity.class);
        startActivity(intent);
    }

}
