package android.support.v4.view;

import android.graphics.Paint;
import android.os.Build.VERSION;
import android.view.View;

public class as
{
  static final bb a = new at();

  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 19)
    {
      a = new ba();
      return;
    }
    if (i >= 17)
    {
      a = new az();
      return;
    }
    if (i >= 16)
    {
      a = new ay();
      return;
    }
    if (i >= 14)
    {
      a = new ax();
      return;
    }
    if (i >= 11)
    {
      a = new aw();
      return;
    }
    if (i >= 9)
    {
      a = new av();
      return;
    }
  }

  public static int a(View paramView)
  {
    return a.a(paramView);
  }

  public static void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a.a(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public static void a(View paramView, int paramInt, Paint paramPaint)
  {
    a.a(paramView, paramInt, paramPaint);
  }

  public static void a(View paramView, Paint paramPaint)
  {
    a.a(paramView, paramPaint);
  }

  public static void a(View paramView, a parama)
  {
    a.a(paramView, parama);
  }

  public static void a(View paramView, Runnable paramRunnable)
  {
    a.a(paramView, paramRunnable);
  }

  public static boolean a(View paramView, int paramInt)
  {
    return a.a(paramView, paramInt);
  }

  public static void b(View paramView)
  {
    a.b(paramView);
  }

  public static void b(View paramView, int paramInt)
  {
    a.b(paramView, paramInt);
  }

  public static int c(View paramView)
  {
    return a.c(paramView);
  }

  public static int d(View paramView)
  {
    return a.d(paramView);
  }

  public static int e(View paramView)
  {
    return a.e(paramView);
  }

  public static boolean f(View paramView)
  {
    return a.f(paramView);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.as
 * JD-Core Version:    0.6.2
 */