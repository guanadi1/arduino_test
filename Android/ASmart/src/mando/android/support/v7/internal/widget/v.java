package android.support.v7.internal.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

class v
  implements AdapterView.OnItemSelectedListener
{
  v(t paramt)
  {
  }

  public void onItemSelected(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (paramInt != -1)
    {
      w localw = t.a(this.a);
      if (localw != null)
        w.a(localw, false);
    }
  }

  public void onNothingSelected(AdapterView paramAdapterView)
  {
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.v
 * JD-Core Version:    0.6.2
 */