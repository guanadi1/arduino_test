package android.support.v7.internal.widget;

import android.util.SparseArray;
import android.view.View;

class d
{
  private final SparseArray b = new SparseArray();

  d(AbsSpinnerICS paramAbsSpinnerICS)
  {
  }

  View a(int paramInt)
  {
    View localView = (View)this.b.get(paramInt);
    if (localView != null)
      this.b.delete(paramInt);
    return localView;
  }

  void a()
  {
    SparseArray localSparseArray = this.b;
    int i = localSparseArray.size();
    for (int j = 0; j < i; j++)
    {
      View localView = (View)localSparseArray.valueAt(j);
      if (localView != null)
        AbsSpinnerICS.a(this.a, localView, true);
    }
    localSparseArray.clear();
  }

  public void a(int paramInt, View paramView)
  {
    this.b.put(paramInt, paramView);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.d
 * JD-Core Version:    0.6.2
 */