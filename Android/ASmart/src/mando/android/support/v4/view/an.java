package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.VelocityTracker;

public class an
{
  static final aq a = new ao();

  static
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      a = new ap();
      return;
    }
  }

  public static float a(VelocityTracker paramVelocityTracker, int paramInt)
  {
    return a.a(paramVelocityTracker, paramInt);
  }

  public static float b(VelocityTracker paramVelocityTracker, int paramInt)
  {
    return a.b(paramVelocityTracker, paramInt);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.an
 * JD-Core Version:    0.6.2
 */