package helloworld.com.taquangtu132gmail.taquangtu.kmapwithintent;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class loginActivity extends AppCompatActivity {
    private Button btStart;
    private Button btReadMe;
    private Button btExit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        map();
        btStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(loginActivity.this,KmapActivity.class);
                startActivity(it);
            }
        });
        btReadMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  Intent it=new Intent(loginActivity.this,ReadMeActivity.class);
                  startActivity(it);
            }
        });
        btExit.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder al = new AlertDialog.Builder(loginActivity.this);
                al.setIcon(R.drawable.chamthan);
                al.setTitle("Warning!!!");
                al.setMessage("Do you want to exit?");
                al.setCancelable(true);
                al.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        onBackPressed();
                    }
                });
                al.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                al.show();
            }
        });
    }
    private void map()
    {
        this.btExit=(Button) findViewById(R.id.bt_exit_id);
        this.btReadMe=(Button) findViewById(R.id.bt_readme_id);
        this.btStart=(Button) findViewById(R.id.bt_start_id);
    }
}
