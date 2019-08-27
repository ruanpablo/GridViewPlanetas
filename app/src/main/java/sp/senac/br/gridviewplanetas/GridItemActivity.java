package sp.senac.br.gridviewplanetas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class GridItemActivity extends AppCompatActivity {

    TextView gridData;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_item);

        gridData = (TextView) findViewById(R.id.griddata);
        imageView = (ImageView) findViewById(R.id.imageView);

        Intent intent = getIntent();

        String receivedName = intent.getStringExtra("name");
        int receivedImage = intent.getIntExtra("image", 0);

        gridData.setText(receivedName);
        imageView.setImageResource(receivedImage);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
