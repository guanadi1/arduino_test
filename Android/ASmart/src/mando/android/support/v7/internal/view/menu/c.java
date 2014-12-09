package android.support.v7.internal.view.menu;

import android.content.DialogInterface;

class c extends q
{
  public c(ActionMenuPresenter paramActionMenuPresenter, y paramy)
  {
    super(paramy);
    paramActionMenuPresenter.a(paramActionMenuPresenter.a);
  }

  public void onDismiss(DialogInterface paramDialogInterface)
  {
    super.onDismiss(paramDialogInterface);
    ActionMenuPresenter.a(this.a, null);
    this.a.b = 0;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.c
 * JD-Core Version:    0.6.2
 */