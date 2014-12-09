package com.raon.aremotefreegalaxy;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

class ae extends BaseAdapter
  implements SpinnerAdapter
{
  public String[] a;
  private Activity b;

  public ae(Activity paramActivity, String[] paramArrayOfString)
  {
    this.b = paramActivity;
    this.a = paramArrayOfString;
  }

  public int getCount()
  {
    return this.a.length;
  }

  public View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
      paramView = this.b.getLayoutInflater().inflate(2130903074, null);
    ((TextView)paramView.findViewById(2131230909)).setText(this.a[paramInt]);
    paramView.setEnabled(true);
    paramView.setClickable(false);
    return paramView;
  }

  public Object getItem(int paramInt)
  {
    return this.a[paramInt];
  }

  public long getItemId(int paramInt)
  {
    return 0L;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
      paramView = this.b.getLayoutInflater().inflate(2130903069, null);
    ((TextView)paramView.findViewById(2131230902)).setText(this.a[paramInt]);
    return paramView;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.aremotefreegalaxy.ae
 * JD-Core Version:    0.6.2
 */