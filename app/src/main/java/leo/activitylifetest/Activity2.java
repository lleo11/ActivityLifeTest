package leo.activitylifetest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by lsx on 2016/7/22.
 */
public class Activity2 extends AppCompatActivity{
    TextView textView;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        String info = getIntent().getStringExtra("name");
        textView =(TextView) findViewById(R.id.the_second_activity_textView);
        textView.setText(info);
        Toast.makeText(Activity2.this, info, Toast.LENGTH_SHORT).show();
    }
}
