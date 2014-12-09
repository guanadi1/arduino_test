package android.support.v7.internal.view.menu;

import android.content.Context;
import android.view.View;

class f extends s
{
  public f(ActionMenuPresenter paramActionMenuPresenter, Context paramContext, n paramn, View paramView, boolean paramBoolean)
  {
    super(paramContext, paramn, paramView, paramBoolean);
    a(paramActionMenuPresenter.a);
  }

  public void onDismiss()
  {
    super.onDismiss();
    this.a.e.close();
    ActionMenuPresenter.a(this.a, null);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.f
 * JD-Core Version:    0.6.2
 */