package bipulsarkar.com.androidprofilescreen;

import android.support.design.widget.AppBarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;


public class MainActivity extends AppCompatActivity {

    AppBarLayout appBarLayout;
    Toolbar toolbar;

    int colorOfFet = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appBarLayout = (AppBarLayout) findViewById(R.id.appbar);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Bangladesh");

        setSupportActionBar(toolbar);

        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                colorOfFet = -(i);
                if (colorOfFet > 255)
                    colorOfFet = 255;


                //Hide toolbar
                toolbar.getBackground().setAlpha(colorOfFet);
                toolbar.setAlpha(colorOfFet / 256f);
            }
        });
    }
}
