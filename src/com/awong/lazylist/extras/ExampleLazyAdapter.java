package com.awong.lazylist.extras;

import com.awong.lazylist.LazyAdapter;
import com.awong.lazylist.R;
import com.awong.lazylist.extras.DummyObject;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ExampleLazyAdapter extends LazyAdapter {
       
    public ExampleLazyAdapter(Activity a) {
    	super(a);
    }
    
    public View getView(int position, View convertView, ViewGroup parent){
    	DummyObject d = (DummyObject) data.get(position);
        
        View vi=convertView;
        if(convertView==null){
        	vi = inflater.inflate(R.layout.plain_item, null);
        }
        else{
        	Log.d("print", "it was null");
        }

        TextView text=(TextView)vi.findViewById(R.id.text);;
  

        
        text.setText(position + ", " + d.dummy);

        return vi;
    }


}