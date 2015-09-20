package za.co.rettakid.carwash.fragments;

import android.os.AsyncTask;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import za.co.rettakid.carwash.R;
import za.co.rettakid.carwash.models.dto.ServiceDto;
import za.co.rettakid.carwash.models.dto.ServiceListDto;
import za.co.rettakid.carwash.models.dto.SessionDto;
import za.co.rettakid.carwash.models.dto.SessionServiceDto;
import za.co.rettakid.carwash.models.dto.SessionServiceListDto;
import za.co.rettakid.carwash.network.ServiceClient;
import za.co.rettakid.carwash.network.SessionClient;
import za.co.rettakid.carwash.network.SessionServiceClient;
import za.co.rettakid.carwash.network.UserClient;

public class ServiceListActivity extends BaseActivity {

    private LinearLayout contentList;
    private List<ServiceDto> serviceDtos;
    private Map<Long,SessionServiceDto> selectedServices = new HashMap<>();
    private View btnSend;

    @Override
    protected void onBaseCreate() {
        setContentView(R.layout.activity_service_list);
        contentList = (LinearLayout)findViewById(R.id.service_list_content);
        btnSend = findViewById(R.id.tool_bar_action);
        getServices();
    }

    private void getServices()  {
        AsyncTask asyncTask = new AsyncTask<Object, Void, ServiceListDto>() {

            @Override
            protected ServiceListDto doInBackground(Object... params) {
                ServiceClient serviceClient = new ServiceClient(getBaseContext());
                return serviceClient.getServices();
            }

            @Override
            protected void onPostExecute(ServiceListDto serviceListDto) {
                serviceDtos = serviceListDto.getServiceList();
                for (ServiceDto serviceDto : serviceDtos) {
                    addServiceItem(serviceDto);
                }
            }
        };
        asyncTask.execute();
    }

    private void postSession()  {
        AsyncTask asyncTask = new AsyncTask<Object, Void, SessionDto>() {

            @Override
            protected SessionDto doInBackground(Object... params) {
                SessionClient sessionClient = new SessionClient(getBaseContext());
                UserClient userClient = new UserClient(getBaseContext());
                SessionDto sessionDto = new SessionDto();
                sessionDto.setEffTo(new Date());
                sessionDto.setEffFrom(new Date());
                sessionDto.setSessionLocation("my house");
                sessionDto.setUser(userClient.getUsers(1L));
                return sessionClient.postSession(sessionDto);
            }

            @Override
            protected void onPostExecute(SessionDto sessionDto) {
                Toast.makeText(getBaseContext(),"Posed session",Toast.LENGTH_SHORT).show();
                postServices(sessionDto);
            }
        };
        asyncTask.execute();
    }

    private void postServices(final SessionDto sessionDto)  {
        AsyncTask asyncTask = new AsyncTask<Object, Void, SessionServiceListDto>() {

            @Override
            protected SessionServiceListDto doInBackground(Object... params) {
                for (SessionServiceDto sessionServiceDto : selectedServices.values()) {
                    sessionServiceDto.setSession(sessionDto);
                }
                SessionServiceClient sessionServiceClient = new SessionServiceClient(getBaseContext());
                SessionServiceListDto sessionServiceListDto = new SessionServiceListDto();
                sessionServiceListDto.setSessionServiceList(new ArrayList<>(selectedServices.values()));
                return sessionServiceClient.postSessionService(sessionServiceListDto);
            }

            @Override
            protected void onPostExecute(SessionServiceListDto sessionServiceListDto) {
                Toast.makeText(getBaseContext(),"Posed services",Toast.LENGTH_SHORT).show();
            }
        };
        asyncTask.execute();
    }

    private void addServiceItem(final ServiceDto serviceDto)   {
        ViewGroup view = (ViewGroup) LayoutInflater.from(this).inflate(R.layout.service_list_item, contentList, false);
        TextView heading = (TextView)view.findViewById(R.id.service_item_header);
        TextView subHeading = (TextView)view.findViewById(R.id.service_item_body);
        final View select = view.findViewById(R.id.service_list_select_icon);

        heading.setText(serviceDto.getServiceName());
        subHeading.setText(String.format("R%s", serviceDto.getServiceAmount()));

        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (selectedServices.containsKey(serviceDto.getServiceId())) {
                    selectedServices.remove(serviceDto.getServiceId());
                    select.setBackground(getDrawable(R.drawable.list_icon_select_box_unselected));
                    if (selectedServices.isEmpty()) {
                        btnSend.setVisibility(View.GONE);
                    }
                } else {
                    SessionServiceDto sessionServiceDto = new SessionServiceDto();
                    sessionServiceDto.setService(serviceDto);
                    selectedServices.put(serviceDto.getServiceId(), sessionServiceDto);
                    select.setBackground(getDrawable(R.drawable.list_icon_select_box_selected));
                    if (btnSend.getVisibility() != View.VISIBLE) {
                        btnSend.setVisibility(View.VISIBLE);
                    }
                }
            }
        });

        contentList.addView(view);
    }

    public void toolbarAction(View view)    {
        postSession();
        Toast.makeText(getBaseContext(),"Send order",Toast.LENGTH_SHORT).show();
    }

}
