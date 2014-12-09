package android.support.v7.internal.view.menu;

import android.view.MenuItem;

class g
  implements v
{
  public void a(n paramn, boolean paramBoolean)
  {
    if ((paramn instanceof y))
      ((y)paramn).o().a(false);
  }

  public boolean a(n paramn)
  {
    if (paramn == null)
      return false;
    this.a.b = ((y)paramn).getItem().getItemId();
    return false;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.g
 * JD-Core Version:    0.6.2
 */