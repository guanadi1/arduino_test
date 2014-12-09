package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.ViewConfiguration;

public class bi
{
  static final bl a = new bj();

  static
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      a = new bk();
      return;
    }
  }

  public static int a(ViewConfiguration paramViewConfiguration)
  {
    return a.a(paramViewConfiguration);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.bi
 * JD-Core Version:    0.6.2
 */