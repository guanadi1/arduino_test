package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;

class o
{
  public static Object a(Context paramContext)
  {
    return new EdgeEffect(paramContext);
  }

  public static void a(Object paramObject, int paramInt1, int paramInt2)
  {
    ((EdgeEffect)paramObject).setSize(paramInt1, paramInt2);
  }

  public static boolean a(Object paramObject)
  {
    return ((EdgeEffect)paramObject).isFinished();
  }

  public static boolean a(Object paramObject, float paramFloat)
  {
    ((EdgeEffect)paramObject).onPull(paramFloat);
    return true;
  }

  public static boolean a(Object paramObject, Canvas paramCanvas)
  {
    return ((EdgeEffect)paramObject).draw(paramCanvas);
  }

  public static void b(Object paramObject)
  {
    ((EdgeEffect)paramObject).finish();
  }

  public static boolean c(Object paramObject)
  {
    EdgeEffect localEdgeEffect = (EdgeEffect)paramObject;
    localEdgeEffect.onRelease();
    return localEdgeEffect.isFinished();
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.widget.o
 * JD-Core Version:    0.6.2
 */