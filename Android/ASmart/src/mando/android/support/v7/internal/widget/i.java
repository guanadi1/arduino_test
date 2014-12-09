package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.support.v4.b.a.b;
import android.support.v7.c.a;
import android.support.v7.internal.view.menu.n;
import android.support.v7.internal.view.menu.r;
import android.support.v7.internal.view.menu.u;
import android.support.v7.internal.view.menu.y;
import android.view.View;
import android.widget.LinearLayout;

class i
  implements u
{
  n a;
  r b;

  public void a(Context paramContext, n paramn)
  {
    if ((this.a != null) && (this.b != null))
      this.a.d(this.b);
    this.a = paramn;
  }

  public void a(n paramn, boolean paramBoolean)
  {
  }

  public boolean a(n paramn, r paramr)
  {
    this.c.g = paramr.getActionView();
    ActionBarView.e(this.c).a(ActionBarView.d(this.c).getConstantState().newDrawable(this.c.getResources()));
    this.b = paramr;
    if (this.c.g.getParent() != this.c)
      this.c.addView(this.c.g);
    if (ActionBarView.e(this.c).getParent() != this.c)
      this.c.addView(ActionBarView.e(this.c));
    ActionBarView.f(this.c).setVisibility(8);
    if (ActionBarView.g(this.c) != null)
      ActionBarView.g(this.c).setVisibility(8);
    if (ActionBarView.h(this.c) != null)
      ActionBarView.h(this.c).setVisibility(8);
    if (ActionBarView.i(this.c) != null)
      ActionBarView.i(this.c).setVisibility(8);
    if (ActionBarView.j(this.c) != null)
      ActionBarView.j(this.c).setVisibility(8);
    this.c.requestLayout();
    paramr.e(true);
    if ((this.c.g instanceof a))
      ((a)this.c.g).a();
    return true;
  }

  public boolean a(y paramy)
  {
    return false;
  }

  public void b(boolean paramBoolean)
  {
    int k;
    if (this.b != null)
    {
      if (this.a == null)
        break label78;
      int j = this.a.size();
      k = 0;
      if (k >= j)
        break label78;
      if ((b)this.a.getItem(k) != this.b)
        break label72;
    }
    label72: label78: for (int i = 1; ; i = 0)
    {
      if (i == 0)
        b(this.a, this.b);
      return;
      k++;
      break;
    }
  }

  public boolean b(n paramn, r paramr)
  {
    if ((this.c.g instanceof a))
      ((a)this.c.g).b();
    this.c.removeView(this.c.g);
    this.c.removeView(ActionBarView.e(this.c));
    this.c.g = null;
    if ((0x2 & ActionBarView.k(this.c)) != 0)
      ActionBarView.f(this.c).setVisibility(0);
    if ((0x8 & ActionBarView.k(this.c)) != 0)
    {
      if (ActionBarView.g(this.c) != null)
        break label245;
      ActionBarView.l(this.c);
    }
    while (true)
    {
      if ((ActionBarView.h(this.c) != null) && (ActionBarView.m(this.c) == 2))
        ActionBarView.h(this.c).setVisibility(0);
      if ((ActionBarView.i(this.c) != null) && (ActionBarView.m(this.c) == 1))
        ActionBarView.i(this.c).setVisibility(0);
      if ((ActionBarView.j(this.c) != null) && ((0x10 & ActionBarView.k(this.c)) != 0))
        ActionBarView.j(this.c).setVisibility(0);
      ActionBarView.e(this.c).a(null);
      this.b = null;
      this.c.requestLayout();
      paramr.e(false);
      return true;
      label245: ActionBarView.g(this.c).setVisibility(0);
    }
  }

  public boolean f()
  {
    return false;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.i
 * JD-Core Version:    0.6.2
 */