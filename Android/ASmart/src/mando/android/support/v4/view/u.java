package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.KeyEvent;

public class u
{
  static final y a = new v();

  static
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      a = new x();
      return;
    }
  }

  public static boolean a(KeyEvent paramKeyEvent)
  {
    return a.b(paramKeyEvent.getMetaState());
  }

  public static boolean a(KeyEvent paramKeyEvent, int paramInt)
  {
    return a.a(paramKeyEvent.getMetaState(), paramInt);
  }

  public static void b(KeyEvent paramKeyEvent)
  {
    a.a(paramKeyEvent);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.u
 * JD-Core Version:    0.6.2
 */