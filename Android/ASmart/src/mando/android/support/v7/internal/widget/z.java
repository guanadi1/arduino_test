package android.support.v7.internal.widget;

import android.os.Handler;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.PopupWindow;

class z
  implements AbsListView.OnScrollListener
{
  private z(t paramt)
  {
  }

  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if ((paramInt == 1) && (!this.a.g()) && (t.b(this.a).getContentView() != null))
    {
      t.d(this.a).removeCallbacks(t.c(this.a));
      t.c(this.a).run();
    }
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.z
 * JD-Core Version:    0.6.2
 */