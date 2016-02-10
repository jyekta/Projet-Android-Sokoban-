package p8.demo.p8sokoban;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

// declaration de notre activity h�rit�e de Activity
public class p8_Sokoban extends Activity {


    private SokobanView mSokobanView;

    private Menu m = null;


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        //R.menu.menu est l'id de notre menu
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected (MenuItem item)
    {
        switch(item.getItemId())
        {
            case R.id.item1:

                return true;
        }
        return super.onOptionsItemSelected(item);
    }
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        // initialise notre activity avec le constructeur parent    	
        super.onCreate(savedInstanceState);
        // charge le fichier main.xml comme vue de l'activit�
       // MenuInflater inflater = getMenuInflater();
        //R.menu.menu est l'id de notre menu
       // inflater.inflate(R.menu.menu, menu);


        setContentView(R.layout.main);
        // recuperation de la vue une voie cree � partir de son id
        mSokobanView = (SokobanView)findViewById(R.id.SokobanView);
        // rend visible la vue
        mSokobanView.setVisibility(View.VISIBLE);




   /* if(mSokobanView.isWon()==true) {

       //mSokobanView = (SokobanView) findViewById(R.id.SokobanView);

        mSokobanView.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
            mSokobanView= (SokobanView)findViewById(R.id.SokobanView2);
                mSokobanView.setVisibility(View.VISIBLE);


            }

        });
    }
        mSokobanView.setVisibility(View.VISIBLE);*/
    }

}