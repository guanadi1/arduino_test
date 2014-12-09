package com.raon.aremotefreegalaxy;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

class q
  implements AdapterView.OnItemSelectedListener
{
  q(MainActivity paramMainActivity)
  {
  }

  public void onItemSelected(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.a.n.a(paramInt);
    MainActivity.a(this.a);
  }

  public void onNothingSelected(AdapterView paramAdapterView)
  {
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.aremotefreegalaxy.q
 * JD-Core Version:    0.6.2
 */