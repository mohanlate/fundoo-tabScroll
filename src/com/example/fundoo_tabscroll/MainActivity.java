package com.example.fundoo_tabscroll;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends FragmentActivity {

	ViewPager viewPager=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
        viewPager= (ViewPager) findViewById(R.id.pager);
        FragmentManager fragmentManager=getSupportFragmentManager();
        viewPager.setAdapter(new MyAdapter(fragmentManager));
 	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}


class MyAdapter extends FragmentStatePagerAdapter
{

    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment=null;
//        Log.d("VIVZ", "get Item is called "+i);
        if(i==0)
        {
            fragment=new Home();
        }
        if(i==1)
        {
            fragment=new Services();
        }
        if(i==2)
        {
            fragment=new AboutUs();
        }
        if(i==3)
        {
            fragment=new Messages();
        }        
        if(i==4)
        {
            fragment=new Like();
        }        
        if(i==5)
        {
            fragment=new Gallery();
        }        
        if(i==6)
        {
            fragment=new Tellafriend();
        }        
        if(i==7)
        {
            fragment=new ContactUs();
        }        
        return fragment;
    }

    @Override
    public int getCount() {
//        Log.d("VIVZ", "get Count is called");
        return 8;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0)
        {
            return "Home";
        }
        if(position==1)
        {
            return "Services";
        }
        if(position==2)
        {
            return "About Us";
        }
        if(position==3)
        {
            return "Messages";
        }
        if(position==4)
        {
            return "Like Us";
        }
        if(position==5)
        {
            return "Gallery";
        }
        if(position==6)
        {
            return "Tell a Friend";
        }
        if(position==7)
        {
            return "Contact Us";
        }
        return null;
    }
}
