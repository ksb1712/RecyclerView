package bharath.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;
    private List<Events> events;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         rv = (RecyclerView)findViewById(R.id.rv);
        initializeData();

        GridLayoutManager llm = new GridLayoutManager(MainActivity.this,2);
        rv.setLayoutManager(llm);

        RecyleAdapter adapter = new RecyleAdapter(events);
        rv.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
   public  class Events {
        String name;
        String id;
        Events(String name, String age) {
            this.name = name;
            this.id = age;

        }
    }



    // This method creates an ArrayList that has three Person objects
// Checkout the project associated with this tutorial on Github if
// you want to use the same images.
    private void initializeData(){
        events = new ArrayList<>();
        events.add(new Events("FIFA", "fif15"));
        events.add(new Events("Lone wolf", "lf"));
        events.add(new Events("cs", "cs"));
    }
}
