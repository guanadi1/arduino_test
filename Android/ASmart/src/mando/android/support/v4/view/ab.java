package android.support.v4.view;

import android.os.Build.VERSION;

public class ab
{
  static final af a = new ac();

  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 14)
    {
      a = new ae();
      return;
    }
    if (i >= 11)
    {
      a = new ad();
      return;
    }
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.ab
 * JD-Core Version:    0.6.2
 */