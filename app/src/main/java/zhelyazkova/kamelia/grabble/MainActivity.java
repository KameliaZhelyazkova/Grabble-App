package zhelyazkova.kamelia.grabble;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.parse.ParseObject;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");
        //testObject.saveInBackground();

    }

    public void openMap(View v){
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }


}
