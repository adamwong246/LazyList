package com.awong.lazylist;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public abstract class ImageLoadingLazyAdapter extends LazyAdapter{
	 public ImageLoader imageLoader; 
	 
	public ImageLoadingLazyAdapter(Activity a, int s) {
		super(a);
		
		imageLoader=new ImageLoader(activity.getApplicationContext(), s);
	}

	public void loader(String url, Activity activity, ImageView image) {
		imageLoader.DisplayImage(url, activity, image);
		
	}
	
	@Override
    public abstract View getView(int position, View convertView, ViewGroup parent); 

	
	

}

