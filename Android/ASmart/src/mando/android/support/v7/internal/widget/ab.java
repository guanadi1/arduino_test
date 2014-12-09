package android.support.v7.internal.widget;

import android.widget.PopupWindow;

class ab
  implements Runnable
{
  private ab(t paramt)
  {
  }

  public void run()
  {
    if ((t.a(this.a) != null) && (t.a(this.a).getCount() > t.a(this.a).getChildCount()) && (t.a(this.a).getChildCount() <= this.a.a))
    {
      t.b(this.a).setInputMethodMode(2);
      this.a.c();
    }
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ab
 * JD-Core Version:    0.6.2
 */