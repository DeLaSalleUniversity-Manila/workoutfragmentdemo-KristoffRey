package com.example.kristoffer.workoutlecture;

import android.app.Activity;
import android.os.Bundle;
import android.app.FragmentTransaction;
public class MainActivity extends Activity
        implements WorkoutList.WorkoutListListener {

    private String[] title;
    private String[] details;

    private Workout[] workout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    @Override
    public void itemClicked(long id) {
        WorkoutDetail details = new WorkoutDetail();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        details.setWorkout(id);
        ft.replace(R.id.fragment_container, details);
        ft.addToBackStack(null);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.commit();
    }
}