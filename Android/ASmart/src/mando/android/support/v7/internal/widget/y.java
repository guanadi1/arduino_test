package android.support.v7.internal.widget;

import android.database.DataSetObserver;

class y extends DataSetObserver
{
  private y(t paramt)
  {
  }

  public void onChanged()
  {
    if (this.a.f())
      this.a.c();
  }

  public void onInvalidated()
  {
    this.a.d();
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.y
 * JD-Core Version:    0.6.2
 */