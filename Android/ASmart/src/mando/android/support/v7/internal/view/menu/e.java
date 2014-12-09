package android.support.v7.internal.view.menu;

import android.content.Context;
import android.support.v7.b.b;
import android.widget.ImageButton;

class e extends ImageButton
  implements i
{
  public e(ActionMenuPresenter paramActionMenuPresenter, Context paramContext)
  {
    super(paramContext, null, b.actionOverflowButtonStyle);
    setClickable(true);
    setFocusable(true);
    setVisibility(0);
    setEnabled(true);
  }

  public boolean c()
  {
    return false;
  }

  public boolean d()
  {
    return false;
  }

  public boolean performClick()
  {
    if (super.performClick())
      return true;
    playSoundEffect(0);
    this.a.a();
    return true;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.e
 * JD-Core Version:    0.6.2
 */