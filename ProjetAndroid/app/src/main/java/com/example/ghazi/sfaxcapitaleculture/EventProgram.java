package com.example.ghazi.sfaxcapitaleculture;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class EventProgram extends AppCompatActivity {

    ListView listView;
    String[] thetitles;
    String[] thedesc;
    String[] thedate;
    int[] images={R.drawable.a1,R.drawable.a2,R.drawable.a3,R.drawable.a4,R.drawable.a5,R.drawable.a6,R.drawable.a7,R.drawable.a8,R.drawable.a9,R.drawable.a10,R.drawable.a11,R.drawable.a12,R.drawable.a13,R.drawable.a14,R.drawable.a15,R.drawable.a16,R.drawable.a17,R.drawable.a18,R.drawable.a19,R.drawable.a20,R.drawable.a21,R.drawable.a22,R.drawable.a23,R.drawable.a24,R.drawable.a25,R.drawable.a26,R.drawable.a27,R.drawable.a28,R.drawable.a29,R.drawable.a30,R.drawable.a31,R.drawable.a32,R.drawable.a33,R.drawable.a34,R.drawable.a35,R.drawable.a36,R.drawable.a37,R.drawable.a38,R.drawable.a39,R.drawable.a40,R.drawable.a41,R.drawable.a42,R.drawable.a43,R.drawable.a44,R.drawable.a45,R.drawable.a46,R.drawable.a47,R.drawable.a48,R.drawable.a49,R.drawable.a50,R.drawable.a51,R.drawable.a52,R.drawable.a53,R.drawable.a54,R.drawable.a55};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_program);
    listView=(ListView)findViewById(R.id.listView);
        Resources r=getResources();
        thetitles=r.getStringArray(R.array.EventName);
        thedesc=r.getStringArray(R.array.EventDescription);
        thedate=r.getStringArray(R.array.EventDate);

MyAdapter adapter=new MyAdapter(this,thetitles,thedesc,thedate,images);
listView.setAdapter(adapter);
    }

class MyAdapter extends ArrayAdapter<String>{
Context context;
    int[] img;
    String[]titleArray;
    String[]descArray;
    String[]dateArray;


public MyAdapter(Context c,String[] EventName,String[] EventDescription,String[] EventDate,int[] images)
{
super(c,R.layout.singlerow,R.id.textView,EventName);
    this.context=c;
    this.img=images;
    this.titleArray=EventName;
    this.dateArray=EventDate;
    this.descArray=EventDescription;

}

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
View row=inflater.inflate(R.layout.singlerow,parent,false);
        ImageView myImage=(ImageView)row.findViewById(R.id.imageView29);
        TextView mytitle=(TextView)row.findViewById(R.id.textView36);
        TextView mydesc=(TextView)row.findViewById(R.id.textView37);
        TextView mydate=(TextView)row.findViewById(R.id.textView35);
        myImage.setImageResource(img[position]);
        mytitle.setText(titleArray[position]);
        mydesc.setText(descArray[position]);
        mydate.setText(dateArray[position]);


        return row;
    }
}






}
