package com.dibengkel.app;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

//    private TextView mTextMessage;
//    private TextView get_user;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {


            switch (item.getItemId()) {
                case R.id.navigation_home:
                    HomeFragment homeFragment = new HomeFragment();
                    android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.content, homeFragment);
                    fragmentTransaction.commit();
//                    get_user = (TextView)findViewById(R.id.get_user);
//                    Bundle b = getIntent().getExtras();
//                    String get_nama = b.getString("username");
   //                 get_user.setText("Username: "+get_nama);

  //                  mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_notifications:
                    NotificationsFragment notificationsFragment = new NotificationsFragment();
                    android.support.v4.app.FragmentTransaction fragmentNotificationsTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentNotificationsTransaction.replace(R.id.content, notificationsFragment);
                    fragmentNotificationsTransaction.commit();
                    //                  mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_help:
                    HelpFragment helpFragment = new HelpFragment();
                    android.support.v4.app.FragmentTransaction fragmentHelpTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentHelpTransaction.replace(R.id.content, helpFragment);
                    fragmentHelpTransaction.commit();
                    //                  mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_profil:
                    ProfilFragment profilFragment = new ProfilFragment();
                    android.support.v4.app.FragmentTransaction fragmentProfilTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentProfilTransaction.replace(R.id.content, profilFragment);
                    fragmentProfilTransaction.commit();
  //                  mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        HomeFragment homeFragment = new HomeFragment();
        android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.content,homeFragment);
        fragmentTransaction.commit();

        //mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
