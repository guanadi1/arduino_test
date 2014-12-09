package android.support.v4.widget;

import android.database.DataSetObserver;

class d extends DataSetObserver
{
  private d(a parama)
  {
  }

  public void onChanged()
  {
    this.a.a = true;
    this.a.notifyDataSetChanged();
  }

  public void onInvalidated()
  {
    this.a.a = false;
    this.a.notifyDataSetInvalidated();
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.widget.d
 * JD-Core Version:    0.6.2
 */