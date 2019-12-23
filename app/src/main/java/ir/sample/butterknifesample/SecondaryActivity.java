package ir.sample.butterknifesample;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;
import java.util.List;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import butterknife.Action;
import butterknife.BindDrawable;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SecondaryActivity extends AppCompatActivity {

    @BindViews({R.id.btn_secondary_upPosition, R.id.btn_secondary_middlePosition, R.id.btn_secondary_downPosition})
    List<Button> buttonList;
    @BindView(R.id.rl_secondary_main)
    RelativeLayout relativeLayout;
    @BindDrawable(R.drawable.background_primary_color)
    Drawable drawables;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
        ButterKnife.bind(this);

        butterknife.ViewCollections.run(buttonList, viewAction);

//Setter
/*
        butterknife.ViewCollections.set(buttonList, viewSetter, drawables);
*/

    }


    butterknife.Action<View> viewAction = new Action<View>() {
        @Override
        public void apply(@NonNull View view, int index) {
        }
    };
//Setter
/*
    butterknife.Setter<View, Drawable> viewSetter = new Setter<View, Drawable>() {
        @Override
        public void set(@NonNull View view, @Nullable Drawable value, int index) {
            view.setBackground(value);

        }
    };
*/
    @OnClick({R.id.btn_secondary_upPosition,/* R.id.btn_secondary_middlePosition, */R.id.btn_secondary_downPosition, R.id.rl_secondary_main})
    public void onViewClicked(View view) {

        switch (view.getId()) {
            case R.id.btn_secondary_upPosition:
                Toast.makeText(this, "btn_secondary_upPosition", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_secondary_middlePosition:
                Toast.makeText(this, "btn_secondary_middlePosition", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_secondary_downPosition:
                Toast.makeText(this, "btn_secondary_downPosition", Toast.LENGTH_SHORT).show();
                break;

            default:
                Toast.makeText(this, "rl_secondary_main", Toast.LENGTH_SHORT).show();

        }
    }
@OnClick(R.id.btn_secondary_middlePosition)
    void onClickMiddleButton(View view){

    butterknife.ViewCollections.set(buttonList,view.ALPHA,0.0f);
}
}
