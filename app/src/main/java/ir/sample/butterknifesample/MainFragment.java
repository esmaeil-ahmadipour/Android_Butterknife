package ir.sample.butterknifesample;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import butterknife.BindColor;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class MainFragment extends Fragment {

    @BindView(R.id.lil_fragmentMain_background)
    LinearLayout lilBackground;
    @BindColor(R.color.OpacityWhite)
    int color_lilBackground;
    @BindView(R.id.txt_fragmentMain_content)
    TextView txtContent;
    @BindString(R.string.string_test)
    String string_txtContent;
    @BindColor(R.color.Black)
    int textColor_txtContent;
    public Unbinder unbinder;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main , container ,   false);
        ButterKnife.bind(this,view);
        txtContent.setTextColor(textColor_txtContent);
        lilBackground.setBackgroundColor(color_lilBackground);
        txtContent.setText(string_txtContent);
        return view;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }
}
