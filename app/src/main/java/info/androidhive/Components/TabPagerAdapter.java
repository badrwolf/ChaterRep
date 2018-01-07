package info.androidhive.Components;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Erene on 26/12/2017.
 */

public class TabPagerAdapter extends FragmentPagerAdapter {

    int tabCount;

    public TabPagerAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.tabCount = numberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                frag_home tab1 = new frag_home();
                return tab1;
            case 1:
                frag_info tab2 = new frag_info();
                return tab2;
            case 2:
                frag_news tab3 = new frag_news();
                return tab3;
            case 3:
                frag_profile tab4 = new frag_profile();
                return tab4;
            case 4:
                frag_members tab5 = new frag_members();
                return tab5;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
