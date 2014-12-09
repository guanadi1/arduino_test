package android.support.v7.internal.view.menu;

import android.view.View;

class d
  implements Runnable
{
  private f b;

  public d(ActionMenuPresenter paramActionMenuPresenter, f paramf)
  {
    this.b = paramf;
  }

  public void run()
  {
    this.a.e.e();
    View localView = (View)this.a.h;
    if ((localView != null) && (localView.getWindowToken() != null) && (this.b.a()))
      ActionMenuPresenter.a(this.a, this.b);
    ActionMenuPresenter.a(this.a, null);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.d
 * JD-Core Version:    0.6.2
 */