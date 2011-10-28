package com.awong.lazylist;

import java.util.Vector;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public abstract class LazyAdapter extends BaseAdapter {
    
    protected Activity activity;
    protected Vector<Object> data;
    protected static LayoutInflater inflater=null;
   
    
    public LazyAdapter(Activity a) {
        activity = a;
        inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        
        
        data = new Vector<Object>(0);
    }

    public int getCount() {
        return data.size();
    }

    public Object getItem(int position) {
        return data.get(position);
    }

    public long getItemId(int position) {
        return position;
    }
    
	public void add(final Object o, Activity a) {
		
		a.runOnUiThread(new Runnable() {
		    public void run() {
		    	data.add(o);
		    	notifyDataSetChanged();
		    }
		});
		
		
	}
    public abstract View getView(int position, View convertView, ViewGroup parent);
//    {
//    	Object d = (Object) data.get(position);
//        
//        View vi=convertView;
//        if(convertView==null){
//        	vi = inflater.inflate(R.layout.plain_item, null);
//        }
//        else{
//        	Log.d("print", "it was null");
//        }
//
//        TextView text=(TextView)vi.findViewById(R.id.text);;
//  
//
//        
//        //text.setText(position + ", " + d.dummy);
//
//        return vi;
//    }


}