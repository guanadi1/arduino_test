package android.support.v4.c;

import android.os.Build.VERSION;
import android.os.Parcelable.Creator;

public class a
{
  public static Parcelable.Creator a(c paramc)
  {
    if (Build.VERSION.SDK_INT >= 13)
      e.a(paramc);
    return new b(paramc);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.c.a
 * JD-Core Version:    0.6.2
 */