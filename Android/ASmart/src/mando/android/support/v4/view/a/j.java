package android.support.v4.view.a;

import android.os.Build.VERSION;
import android.os.Bundle;
import java.util.List;

public class j
{
  private static final k a = new p();
  private final Object b;

  static
  {
    if (Build.VERSION.SDK_INT >= 19)
    {
      a = new n();
      return;
    }
    if (Build.VERSION.SDK_INT >= 16)
    {
      a = new l();
      return;
    }
  }

  public j()
  {
    this.b = a.a(this);
  }

  public j(Object paramObject)
  {
    this.b = paramObject;
  }

  public a a(int paramInt)
  {
    return null;
  }

  public Object a()
  {
    return this.b;
  }

  public List a(String paramString, int paramInt)
  {
    return null;
  }

  public boolean a(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    return false;
  }

  public a b(int paramInt)
  {
    return null;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.a.j
 * JD-Core Version:    0.6.2
 */