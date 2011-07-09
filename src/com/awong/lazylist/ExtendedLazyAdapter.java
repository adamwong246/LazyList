package com.awong.lazylist;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.awong.lazylist.R;

public class ExtendedLazyAdapter extends LazyAdapter{

	public ExtendedLazyAdapter(Activity a) {
		super(a);
	}

	@Override
    public View getView(int position, View convertView, ViewGroup parent) {
        DummyObject d = (DummyObject) data.get(position);
        
        View vi=convertView;
        if(convertView==null){
        	if (parent.getClass().getSimpleName().equals("Gallery")){
        		vi = inflater.inflate(R.layout.gallery_item, null);
        	}else{
        		vi = inflater.inflate(R.layout.item, null);
        	}
        }

        TextView text=(TextView)vi.findViewById(R.id.text);;
        ImageView image=(ImageView)vi.findViewById(R.id.image);
        

        
        text.setText(position + ", " + d.dummy);
        imageLoader.DisplayImage(d.url, activity, image);
        return vi;
    }
	
	

}

