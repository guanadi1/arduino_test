package android.support.v7.internal.widget;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.PopupWindow;

class aa
  implements View.OnTouchListener
{
  private aa(t paramt)
  {
  }

  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction();
    int j = (int)paramMotionEvent.getX();
    int k = (int)paramMotionEvent.getY();
    if ((i == 0) && (t.b(this.a) != null) && (t.b(this.a).isShowing()) && (j >= 0) && (j < t.b(this.a).getWidth()) && (k >= 0) && (k < t.b(this.a).getHeight()))
      t.d(this.a).postDelayed(t.c(this.a), 250L);
    while (true)
    {
      return false;
      if (i == 1)
        t.d(this.a).removeCallbacks(t.c(this.a));
    }
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.aa
 * JD-Core Version:    0.6.2
 */