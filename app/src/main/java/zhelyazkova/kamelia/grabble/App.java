package zhelyazkova.kamelia.grabble;

import android.app.Application;
import android.os.Bundle;

import com.parse.Parse;

import java.io.InputStream;

/**
 * Created by Kamelia on 9/30/2016.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("myAppId")
                .server("https://grabble-app.herokuapp.com/parse")

        .build()
        );
    }

    public static class Dictionary {
        public static int getScore(String word) {
            int score = 0;

            return 0;
        }

//
//  private String getDictionaryString () {
//            String fileName = "dictionary.txt";
//
//            byte[] buffer = null;
//
//            InputStream is;
//
//        }
    }
}

