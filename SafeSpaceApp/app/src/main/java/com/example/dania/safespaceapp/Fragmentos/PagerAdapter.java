package com.example.dania.safespaceapp.Fragmentos;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {

    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                HistoriasFragment tab_historia = new HistoriasFragment();
                return tab_historia;
            case 1:
                TableroFragment tab_tablero = new TableroFragment();
                return tab_tablero;
            case 2:
                AutoayudaFragment tab_autoayuda = new AutoayudaFragment();
                return tab_autoayuda;
             default:
                 return null;
        }

    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
