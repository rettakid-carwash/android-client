package za.co.rettakid.carwash.fragments;

import android.databinding.DataBindingUtil;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.concurrent.ExecutionException;

import za.co.rettakid.carwash.R;
import za.co.rettakid.carwash.models.dto.UserDto;
import za.co.rettakid.carwash.utils.binding.BindUser;
import za.co.rettakid.carwash.databinding.ActivityUserBinding;
import za.co.rettakid.carwash.network.UserClient;
import za.co.rettakid.carwash.models.vo.UserVo;

public class UserActivity extends BaseActivity {

    private ActivityUserBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        UserDto userDto = new UserDto();
    }

    @Override
    public void onBaseCreate()   {
        setContentView(R.layout.activity_user);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_user);
    }

    public void getUser(View view) throws ExecutionException, InterruptedException {
        AsyncTask asyncTask = new AsyncTask<Object, Void, UserDto>() {

            @Override
            protected UserDto doInBackground(Object... params) {
                Long userId = 0L;
                for (Object param : params) {
                    userId = (long)param;
                }
                UserClient userClient = new UserClient(getBaseContext());
                return userClient.getUsers(userId);
            }

            @Override
            protected void onPostExecute(UserDto userDto) {
                Toast.makeText(getBaseContext(), "get complete", Toast.LENGTH_SHORT).show();
                binding.setUser(BindUser.bindUser(userDto));
            }
        };
        asyncTask.execute(1);

    }

    public void putUser(View view) throws ExecutionException, InterruptedException {

        AsyncTask asyncTask = new AsyncTask<Object, Void, UserDto>() {

            @Override
            protected UserDto doInBackground(Object... params) {
                UserDto userDto = null;
                for (Object param : params) {
                    userDto = (UserDto)param;
                }
                UserClient userClient = new UserClient(getBaseContext());
                userClient.putUser(userDto);
                return null;
            }

            @Override
            protected void onPostExecute(UserDto userDto) {
                Toast.makeText(getBaseContext(), "put complete", Toast.LENGTH_SHORT).show();
            }

        };
        UserVo userVo = binding.getUser();
        asyncTask.execute(BindUser.bindUser(userVo));

    }

    public void postUser(View view) throws ExecutionException, InterruptedException {

        AsyncTask asyncTask = new AsyncTask<Object, Void, UserDto>() {

            @Override
            protected UserDto doInBackground(Object... params) {
                UserDto userDto = null;
                for (Object param : params) {
                    userDto = (UserDto)param;
                }
                UserClient userClient = new UserClient(getBaseContext());
                userClient.postUser(userDto);
                return null;
            }

            @Override
            protected void onPostExecute(UserDto userDto) {
                Toast.makeText(getBaseContext(), "post complete", Toast.LENGTH_SHORT).show();
            }

        };
        UserVo userVo = binding.getUser();
        asyncTask.execute(BindUser.bindUser(userVo));

    }

}
