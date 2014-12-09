package android.support.v7.internal.widget;

import android.support.v7.a.d;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;

class ai
  implements View.OnClickListener
{
  private ai(ScrollingTabContainerView paramScrollingTabContainerView)
  {
  }

  public void onClick(View paramView)
  {
    ((ScrollingTabContainerView.TabView)paramView).getTab().d();
    int i = ScrollingTabContainerView.a(this.a).getChildCount();
    int j = 0;
    if (j < i)
    {
      View localView = ScrollingTabContainerView.a(this.a).getChildAt(j);
      if (localView == paramView);
      for (boolean bool = true; ; bool = false)
      {
        localView.setSelected(bool);
        j++;
        break;
      }
    }
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ai
 * JD-Core Version:    0.6.2
 */