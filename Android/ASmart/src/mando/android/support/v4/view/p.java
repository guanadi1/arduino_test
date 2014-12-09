package android.support.v4.view;

import android.os.Build.VERSION;

public class p
{
  static final q a = new r();

  static
  {
    if (Build.VERSION.SDK_INT >= 17)
    {
      a = new s();
      return;
    }
  }

  public static int a(int paramInt1, int paramInt2)
  {
    return a.a(paramInt1, paramInt2);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.p
 * JD-Core Version:    0.6.2
 */