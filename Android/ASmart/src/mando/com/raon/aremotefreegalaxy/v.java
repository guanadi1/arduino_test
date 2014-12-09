package com.raon.aremotefreegalaxy;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

class v
  implements AdapterView.OnItemSelectedListener
{
  v(MainActivity paramMainActivity)
  {
  }

  public void onItemSelected(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.a.n.b(paramInt);
    MainActivity.b(this.a);
  }

  public void onNothingSelected(AdapterView paramAdapterView)
  {
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.aremotefreegalaxy.v
 * JD-Core Version:    0.6.2
 */