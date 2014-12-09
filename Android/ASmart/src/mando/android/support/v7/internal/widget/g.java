package android.support.v7.internal.widget;

import android.support.v7.internal.view.menu.r;
import android.view.View;
import android.view.View.OnClickListener;

class g
  implements View.OnClickListener
{
  g(ActionBarView paramActionBarView)
  {
  }

  public void onClick(View paramView)
  {
    r localr = ActionBarView.b(this.a).b;
    if (localr != null)
      localr.collapseActionView();
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.g
 * JD-Core Version:    0.6.2
 */