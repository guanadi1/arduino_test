package android.support.v4.view;

import android.view.MotionEvent;

class al
{
  public static int a(MotionEvent paramMotionEvent)
  {
    return paramMotionEvent.getPointerCount();
  }

  public static int a(MotionEvent paramMotionEvent, int paramInt)
  {
    return paramMotionEvent.findPointerIndex(paramInt);
  }

  public static int b(MotionEvent paramMotionEvent, int paramInt)
  {
    return paramMotionEvent.getPointerId(paramInt);
  }

  public static float c(MotionEvent paramMotionEvent, int paramInt)
  {
    return paramMotionEvent.getX(paramInt);
  }

  public static float d(MotionEvent paramMotionEvent, int paramInt)
  {
    return paramMotionEvent.getY(paramInt);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.al
 * JD-Core Version:    0.6.2
 */