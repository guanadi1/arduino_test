package android.support.v4.view;

import android.database.DataSetObserver;

class bx extends DataSetObserver
{
  private bx(ViewPager paramViewPager)
  {
  }

  public void onChanged()
  {
    this.a.b();
  }

  public void onInvalidated()
  {
    this.a.b();
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.bx
 * JD-Core Version:    0.6.2
 */