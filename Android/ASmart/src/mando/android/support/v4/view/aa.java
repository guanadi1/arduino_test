package android.support.v4.view;

import android.view.KeyEvent;

class aa
{
  public static int a(int paramInt)
  {
    return KeyEvent.normalizeMetaState(paramInt);
  }

  public static boolean a(int paramInt1, int paramInt2)
  {
    return KeyEvent.metaStateHasModifiers(paramInt1, paramInt2);
  }

  public static boolean b(int paramInt)
  {
    return KeyEvent.metaStateHasNoModifiers(paramInt);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.aa
 * JD-Core Version:    0.6.2
 */