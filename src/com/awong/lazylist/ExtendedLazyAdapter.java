package com.awong.lazylist;

import android.app.Activity;
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
        View vi=convertView;
        if(convertView==null)
            vi = inflater.inflate(R.layout.item, null);

        TextView text=(TextView)vi.findViewById(R.id.text);;
        ImageView image=(ImageView)vi.findViewById(R.id.image);
        
        String url = (String) data.get(position);
        
        text.setText(position + "-" + url);
        imageLoader.DisplayImage(url, activity, image);
        return vi;
    }
	
	

}
