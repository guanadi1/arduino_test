package android.support.v7.internal.widget;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.widget.Adapter;

class m extends DataSetObserver
{
  private Parcelable b = null;

  m(k paramk)
  {
  }

  public void onChanged()
  {
    this.a.u = true;
    this.a.A = this.a.z;
    this.a.z = this.a.e().getCount();
    if ((this.a.e().hasStableIds()) && (this.b != null) && (this.a.A == 0) && (this.a.z > 0))
    {
      k.a(this.a, this.b);
      this.b = null;
    }
    while (true)
    {
      this.a.i();
      this.a.requestLayout();
      return;
      this.a.n();
    }
  }

  public void onInvalidated()
  {
    this.a.u = true;
    if (this.a.e().hasStableIds())
      this.b = k.a(this.a);
    this.a.A = this.a.z;
    this.a.z = 0;
    this.a.x = -1;
    this.a.y = -9223372036854775808L;
    this.a.v = -1;
    this.a.w = -9223372036854775808L;
    this.a.p = false;
    this.a.i();
    this.a.requestLayout();
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.m
 * JD-Core Version:    0.6.2
 */