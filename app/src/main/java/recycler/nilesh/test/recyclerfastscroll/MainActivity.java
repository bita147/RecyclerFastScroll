package recycler.nilesh.test.recyclerfastscroll;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcv;
    private ArrayList<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv = (RecyclerView) findViewById(R.id.recyclerview);
        rcv.setLayoutManager(new LinearLayoutManager(this));

        fillList();
        FastScroller fs = (FastScroller) findViewById(R.id.fast_scroller);
        fs.setRecyclerView(rcv, list);

        RecycleAdapter adapter = new RecycleAdapter(list, getApplicationContext());
        rcv.setAdapter(adapter);

    }

    private void fillList() {
        for (int i = 0; i < 1; i++)
            for (int j = 65; j < (65 + 26); j++)
                for (int k = 0; k < 20; k++)
                    list.add("" + (char) j + ""+ j + ""+k);
    }
}
