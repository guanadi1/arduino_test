package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.MotionEvent;

public class ah
{
  static final ak a = new ai();

  static
  {
    if (Build.VERSION.SDK_INT >= 5)
    {
      a = new aj();
      return;
    }
  }

  public static int a(MotionEvent paramMotionEvent)
  {
    return 0xFF & paramMotionEvent.getAction();
  }

  public static int a(MotionEvent paramMotionEvent, int paramInt)
  {
    return a.a(paramMotionEvent, paramInt);
  }

  public static int b(MotionEvent paramMotionEvent)
  {
    return (0xFF00 & paramMotionEvent.getAction()) >> 8;
  }

  public static int b(MotionEvent paramMotionEvent, int paramInt)
  {
    return a.b(paramMotionEvent, paramInt);
  }

  public static float c(MotionEvent paramMotionEvent, int paramInt)
  {
    return a.c(paramMotionEvent, paramInt);
  }

  public static int c(MotionEvent paramMotionEvent)
  {
    return a.a(paramMotionEvent);
  }

  public static float d(MotionEvent paramMotionEvent, int paramInt)
  {
    return a.d(paramMotionEvent, paramInt);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.ah
 * JD-Core Version:    0.6.2
 */