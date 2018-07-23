package sg.edu.rp.webservices.demoaddon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.jsibbold.zoomage.ZoomageView;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
ImageView iv;
ZoomageView ir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv = (ImageView) findViewById(R.id.iv);
        ir = (ZoomageView) findViewById(R.id.myZoomageView);
        String imgurl = "https://t.facdn.net/17845383@300-1443799035.jpg";
        Picasso.with(this).load(imgurl).into(ir);
        String imageUrl = "https://t.facdn.net/17845383@300-1443799035.jpg";
        Picasso.with(this).load(imageUrl).into(iv);
    }
}
