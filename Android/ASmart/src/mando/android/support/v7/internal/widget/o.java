package android.support.v7.internal.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

class o
  implements AdapterView.OnItemClickListener
{
  private final n b;

  public o(k paramk, n paramn)
  {
    this.b = paramn;
  }

  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.b.a(this.a, paramView, paramInt, paramLong);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.o
 * JD-Core Version:    0.6.2
 */