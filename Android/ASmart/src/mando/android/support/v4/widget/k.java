package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;

public class k
{
  private static final n b = new l();
  private Object a;

  static
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      b = new m();
      return;
    }
  }

  public k(Context paramContext)
  {
    this.a = b.a(paramContext);
  }

  public void a(int paramInt1, int paramInt2)
  {
    b.a(this.a, paramInt1, paramInt2);
  }

  public boolean a()
  {
    return b.a(this.a);
  }

  public boolean a(float paramFloat)
  {
    return b.a(this.a, paramFloat);
  }

  public boolean a(Canvas paramCanvas)
  {
    return b.a(this.a, paramCanvas);
  }

  public void b()
  {
    b.b(this.a);
  }

  public boolean c()
  {
    return b.c(this.a);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.widget.k
 * JD-Core Version:    0.6.2
 */