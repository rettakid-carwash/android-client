package za.co.rettakid.carwash.fragments;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.concurrent.ExecutionException;

import za.co.rettakid.carwash.R;
import za.co.rettakid.carwash.dto.UserCarDto;
import za.co.rettakid.carwash.dto.UserDto;
import za.co.rettakid.carwash.network.UserCarClient;
import za.co.rettakid.carwash.network.UserClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(getBaseContext(),UserActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void getUser(View view) throws ExecutionException, InterruptedException {

        AsyncTask asyncTask = new AsyncTask<Integer, Void, UserDto>() {

            @Override
            protected UserDto doInBackground(Integer... params) {
                UserClient userClient = new UserClient();
                return userClient.getUsers(1);
            }

            @Override
            protected void onPostExecute(UserDto userDto) {
                Toast.makeText(getBaseContext(), userDto.getUserEmail(), Toast.LENGTH_SHORT).show();
            }
        };
        asyncTask.execute(1);

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
}
