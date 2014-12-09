package com.raon.aremotefreegalaxy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.raon.remotelib.d;
import java.util.ArrayList;

class an extends ArrayAdapter
{
  int a = -1;
  private ArrayList b;

  public an(Context paramContext, int paramInt, ArrayList paramArrayList)
  {
    super(paramContext, paramInt, paramArrayList);
    this.b = paramArrayList;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
      paramView = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(2130903071, null);
    d locald = (d)this.b.get(paramInt);
    if (locald != null)
      ((TextView)paramView.findViewById(2131230904)).setText(locald.c);
    if ((paramView != null) && (paramInt == this.a))
    {
      paramView.setBackgroundResource(2130837773);
      return paramView;
    }
    paramView.setBackgroundDrawable(null);
    return paramView;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.aremotefreegalaxy.an
 * JD-Core Version:    0.6.2
 */