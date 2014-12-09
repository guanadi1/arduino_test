package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SpinnerAdapter;

class an extends t
  implements ap
{
  private CharSequence c;
  private ListAdapter d;

  public an(aj paramaj, Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramaj);
    a(true);
    a(0);
    a(new o(paramaj, new ao(this, paramaj)));
  }

  public void a(ListAdapter paramListAdapter)
  {
    super.a(paramListAdapter);
    this.d = paramListAdapter;
  }

  public void a(CharSequence paramCharSequence)
  {
    this.c = paramCharSequence;
  }

  public void c()
  {
    int i = this.b.getPaddingLeft();
    if (this.b.E == -2)
    {
      int n = this.b.getWidth();
      int i1 = this.b.getPaddingRight();
      e(Math.max(this.b.a((SpinnerAdapter)this.d, a()), n - i - i1));
    }
    while (true)
    {
      Drawable localDrawable = a();
      int j = 0;
      if (localDrawable != null)
      {
        localDrawable.getPadding(aj.a(this.b));
        j = -aj.a(this.b).left;
      }
      b(j + i);
      f(2);
      super.c();
      h().setChoiceMode(1);
      g(this.b.f());
      return;
      if (this.b.E == -1)
      {
        int k = this.b.getWidth();
        int m = this.b.getPaddingRight();
        e(k - i - m);
      }
      else
      {
        e(this.b.E);
      }
    }
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.an
 * JD-Core Version:    0.6.2
 */